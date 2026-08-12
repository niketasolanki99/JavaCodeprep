package BusinessRequirement;

import java.util.HashMap;
import java.util.Map;

class Product{
    String productId;
    int quantity;

    public Product(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class InventoryService {

    Map<String, Product> inventory = new HashMap<>();
    public void reserveProduct(String productId, int quantity){

        Product product = inventory.get(productId);

        if(product == null){
            throw new RuntimeException();
        }
       
    }




}
