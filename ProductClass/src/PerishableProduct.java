//public class PerishableProduct extends Product {
//    private String expiryDate;
//    private storageType StorageType;
//
//    public PerishableProduct(int productId, String name, double price, int quantity, String expiryDate, storageType storageType) {
//        super(productId, name, price, quantity);
//        this.expiryDate = expiryDate;
//        this.StorageType = storageType;
//    }
//
//    public String getexpiryDate() {
//        return expiryDate;
//    }
//
//    public void SetexpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public void Display() {
//        {
//
//            super.Display();
//            System.out.println("expiryDate   : " + expiryDate);
//            System.out.println("----------------------------");
//            System.out.println("storageType  : " + StorageType);
//            System.out.println("----------------------------");
//        }
//    }
//}
//public class PerishableProduct extends Product {
//
//    private String expiryDate;
//    private StorageType storageType;
//
//    public PerishableProduct(int productId, String name, double price, int quantity,
//                             String expiryDate, StorageType storageType) {
//        super(productId, name, price, quantity);
//        this.expiryDate = expiryDate;
//        this.storageType = storageType;
//    }
//
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    @Override
//    public void Display() {
//        super.Display();
//        System.out.println("Expiry Date  : " + expiryDate);
//        System.out.println("----------------------------");
//        System.out.println("Storage Type : " + storageType);
//        System.out.println("----------------------------");
//    }
//}
public class PerishableProduct extends Product {

    private String expiryDate;
    private StorageType storageType;

    public PerishableProduct(int productId, String name, double price, int quantity,
                             String expiryDate, StorageType storageType) {
        super(productId, name, price, quantity);
        this.expiryDate = expiryDate;
        this.storageType = storageType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Expiry Date  : " + expiryDate);
        System.out.println("Storage Type : " + storageType);
        System.out.println("----------------------------");
    }
}
