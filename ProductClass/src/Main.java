//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        InventoryManagement manager = new InventoryManagement();
//        int choice;
//        do {
//            System.out.println("\nWelcome to Inventory Management System");
//            System.out.println("1. Add Product");
//            System.out.println("2. Add Perishable Product");
//            System.out.println("3. Display Inventory");
//            System.out.println("4. Place Order");
//            System.out.println("5. Show Low Stock Products");
//            System.out.println("6. Exit");
//            System.out.print("Enter choice: ");
//            choice = sc.nextInt();
//
//            try {
//                switch (choice) {
//
//                    case 1:
//                        System.out.print("Enter Product ID: ");
//                        int id = sc.nextInt();
//
//                        System.out.print("Enter Name of the product: ");
//                        String name = sc.next();
//
//                        System.out.print("Enter Price: ");
//                        double price = sc.nextDouble();
//
//                        System.out.print("Enter Quantity: ");
//                        int qty = sc.nextInt();
//
//                        Product product = new Product(id, name, price, qty);
//                        manager.addProduct(product);
//                        break;
//
//                    case 2:
//                        System.out.print("Enter Product ID: ");
//                        int pid = sc.nextInt();
//
//                        System.out.print("Enter Name of the product: ");
//                        String pname = sc.next();
//
//                        System.out.print("Enter Price: ");
//                        double pprice = sc.nextDouble();
//
//                        System.out.print("Enter Quantity: ");
//                        int pqnty = sc.nextInt();
//
//                        System.out.print("Enter Expiry Date: ");
//                        String expiry = sc.next();
//
//                        System.out.print("Enter Storage Type (COLD/DRY): ");
//                        StorageType type = StorageType.valueOf(sc.next().toUpperCase());
//
//                        PerishableProduct pp =
//                                new PerishableProduct(pid, pname, pprice, pqnty, expiry, type);
//
//                        manager.addProduct(pp);
//                        break;
//
//                    case 3:
//                        manager.displayAllProducts();
//                        break;
//
//                    case 4:
//                        System.out.print("Enter Order ID: ");
//                        int orderId = sc.nextInt();
//
//                        System.out.print("Enter Product ID: ");
//                        int productId = sc.nextInt();
//
//                        System.out.print("Enter Order Quantity: ");
//                        int orderQty = sc.nextInt();
//
//                        Order order = new Order(orderId, productId, orderQty, manager);
//                        order.displayOrderDetails();
//                        break;
//
//                    case 5:
//                        manager.showLowStockProducts();
//                        break;
//
//                    case 6:
//                        System.out.println("Exiting system...");
//                        break;
//
//                    default:
//                        System.out.println("Invalid choice!");
//                }
//
//            } catch (InsufficientStockException e) {
//                System.out.println("Error: " + e.getMessage());
//
//            } catch (IllegalArgumentException e) {
//                System.out.println("Invalid input: " + e.getMessage());
//
//            } catch (Exception e) {
//                System.out.println("Unexpected error occurred.");
//            }
//
//        } while (choice != 6);
//
//        sc.close();
//    }
//}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManagement manager = new InventoryManagement();
        int choice;

        do {
            System.out.println("\nWelcome to Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Add Perishable Product");
            System.out.println("3. Display Inventory");
            System.out.println("4. Place Order");
            System.out.println("5. Show Low Stock Products");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name of the product: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        Product product = new Product(id, name, price, qty);
                        manager.addProduct(product);
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int pid = sc.nextInt();
                        sc.nextLine();

                        Product existing = manager.getProduct(pid);

                        if (existing != null) {
                            System.out.println("Product already exists. Converting to Perishable Product...");

                            System.out.print("Enter Expiry Date: ");
                            String expiry = sc.nextLine();

                            System.out.print("Enter Storage Type (COLD/DRY): ");
                            StorageType type = StorageType.valueOf(sc.nextLine().toUpperCase());

                            PerishableProduct pp = new PerishableProduct(
                                    existing.getProductId(),
                                    existing.getName(),
                                    existing.getPrice(),
                                    existing.getQuantity(),
                                    expiry,
                                    type
                            );

                            manager.addProduct(pp);
                            System.out.println("Product converted to Perishable Product successfully!");

                        } else {
                            System.out.println("New product. Enter full details.");

                            System.out.print("Enter Name of the product: ");
                            String pname = sc.nextLine();

                            System.out.print("Enter Price: ");
                            double pprice = sc.nextDouble();

                            System.out.print("Enter Quantity: ");
                            int pqnty = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Expiry Date: ");
                            String expiry = sc.nextLine();

                            System.out.print("Enter Storage Type (COLD/DRY): ");
                            StorageType type = StorageType.valueOf(sc.nextLine().toUpperCase());

                            PerishableProduct pp =
                                    new PerishableProduct(pid, pname, pprice, pqnty, expiry, type);

                            manager.addProduct(pp);
                            System.out.println("New perishable product added successfully!");
                        }
                        break;

                    case 3:
                        manager.displayAllProducts();
                        break;

                    case 4:
                        System.out.print("Enter Order ID: ");
                        int orderId = sc.nextInt();

                        System.out.print("Enter Product ID: ");
                        int productId = sc.nextInt();

                        System.out.print("Enter Order Quantity: ");
                        int orderQty = sc.nextInt();
                        sc.nextLine();

                        Order order = new Order(orderId, productId, orderQty, manager);
                        order.displayOrderDetails();
                        break;

                    case 5:
                        manager.showLowStockProducts();
                        break;

                    case 6:
                        System.out.println("Exiting system...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InsufficientStockException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error occurred.");
            }

        } while (choice != 6);

        sc.close();
    }
}
