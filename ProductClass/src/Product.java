//public class Product {
//    private int productId;
//    private String name;
//    private double price;
//    private int quantity;
//    public Product(int productId,String name,double price,int quantity){
//        this.productId=productId;
//        this.name=name;
//        setPrice(price);
//        setQuantity(quantity);
//    }
//    public int getProductId(){
//        return productId;
//    }
//    public String name(){
//        return name;
//    }
//    public double price(){
//        return price;
//    }
//    public int quantity() {
//        return quantity;
//    }
//    public void getProductId(int productId){
//        this.productId=productId;
//    }
//    public void getName(String name){
//        this.name=name;
//    }
//    public double getPrice(){
//        return price;
//    }
//    public int getQuantity(){
//        return quantity;
//    }
//    public void setPrice(double price) {
//        if (price >= 0) {
//            this.price = price;
//        } else {
//            System.out.println("enter proper price");
//        }
//    }
//    public void setQuantity(int quantity){
//            if(quantity>=0){
//                this.quantity=quantity;
//            }else{
//                System.out.println("enter proper qunatity");
//            }
//        }
//        public void Display(){
//            {
//                System.out.println("----------------------------");
//                System.out.println("Product ID   : " + productId);
//                System.out.println("----------------------------");
//                System.out.println("Name         : " + name);
//                System.out.println("----------------------------");
//                System.out.println("Price        : ₹" + price);
//                System.out.println("----------------------------");
//                System.out.println("Quantity     : " + quantity);
//                System.out.println("----------------------------");
//            }
//        }
//    }
public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }

    // Display method
    public void Display() {
        System.out.println("----------------------------");
        System.out.println("Product ID   : " + productId);
        System.out.println("Name         : " + name);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
    }
}
