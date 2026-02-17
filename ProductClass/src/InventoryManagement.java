import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    Map<Integer,Product> productMap=new HashMap<>();
    public void addProduct(Product product){
        productMap.put(product.getProductId(),product);
        System.out.println("product added successfully");
    }
    public void displayAllProducts(){
        if(productMap.isEmpty()){
            System.out.println("inventory is empty");
            return;
        }
        for(Product product: productMap.values()){
            product.Display();
        }
    }
    public void updateProductQuantity(int productId, int newQuantity) {

        Product product = productMap.get(productId);

        if (product == null) {
            System.out.println("Invalid product ID.");
            return;
        }

        product.setQuantity(newQuantity);
        System.out.println("Quantity updated successfully!");
    }
    public void showLowStockProducts() {

        boolean found = false;

        for (Product product : productMap.values()) {
            if (product.getQuantity() < 5) {
                product.Display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("There are No low stock products.");
        }
    }
    public Product getProduct(int productId) {
        return productMap.get(productId);
    }

}

