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
