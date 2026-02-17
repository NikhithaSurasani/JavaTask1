//public class Order {
//
//    private int orderId;
//    private int productId;
//    private int orderQuantity;
//    private int totalAmount;
//
//    public Order(int orderId, int productId, int orderQuantity,
//                 InventoryManagement manager) throws InsufficientStockException {
//
//        this.orderId = orderId;
//        this.productId = productId;
//        this.orderQuantity = orderQuantity;
//
//        Product product = manager.getProduct(productId);
//
//        if (product == null) {
//            throw new IllegalArgumentException("Invalid product ID");
//        }
//
//        if (product.getQuantity() < orderQuantity) {
//            throw new InsufficientStockException("Insufficient stock available");
//        }
//
//        double amount = product.getPrice() * orderQuantity;
//
//        this.totalAmount = (int) amount;
//
//        product.setQuantity(product.getQuantity() - orderQuantity);
//    }
//
//    public void displayOrderDetails() {
//        System.out.println("Order ID     : " + orderId);
//        System.out.println("Product ID   : " + productId);
//        System.out.println("Quantity     : " + orderQuantity);
//        System.out.println("Total Amount : ₹" + totalAmount);
//        System.out.println("----------------------------");
//    }
//}
//
public class Order {

    private int orderId;
    private int productId;
    private int orderQuantity;
    private int totalAmount;

    public Order(int orderId, int productId, int orderQuantity,
                 InventoryManagement manager) throws InsufficientStockException {

        if (orderQuantity <= 0) {
            throw new IllegalArgumentException("Order quantity must be greater than zero");
        }

        this.orderId = orderId;
        this.productId = productId;
        this.orderQuantity = orderQuantity;

        Product product = manager.getProduct(productId);

        if (product == null) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        if (product.getQuantity() < orderQuantity) {
            throw new InsufficientStockException("Insufficient stock available");
        }

        double amount = product.getPrice() * orderQuantity;

        this.totalAmount = (int) amount;   // explicit casting as per task

        product.setQuantity(product.getQuantity() - orderQuantity);
    }

    public void displayOrderDetails() {
        System.out.println("Order placed successfully!");
        System.out.println("Order ID     : " + orderId);
        System.out.println("Product ID   : " + productId);
        System.out.println("Quantity     : " + orderQuantity);
        System.out.println("Total Amount : ₹" + totalAmount);
        System.out.println("----------------------------");
    }
}
