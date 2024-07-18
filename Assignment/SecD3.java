/**
 * . Create a ShoppingCart class to simulate an online shopping cart.
 *  The class should have the following attributes: cart ID, customer name, 
 * and items (a list of products). Include methods to addItem(), removeItem(),
 *  and calculateTotal(). Implement functionality to create new shopping carts,
 *  add/remove items, and calculate the total cost of items in the cart
 */
import java.util.*;
public class SecD3 {
    public static void main(String[] args) {
        Product pp= new Product("iphone",4,20);
        ShoppingCart s= new ShoppingCart();
        s.addItem(pp);
        System.out.print(s.calculateTotal());
        
        
    }
    
}
class Product{
    String pName;
    int quantity;
    int cost;
    Product(String pName,int quantity,int cost){
        this.pName=pName;
        this.quantity=quantity;
        this.cost=cost;
    }
}
class ShoppingCart{
    int cartId;
    String name;
    ArrayList<Product> pr=new ArrayList<>();
    void addItem(Product p){
        pr.add(p);
        
    }
    void removeItem(Product p){
        pr.remove(p);
    }
    double calculateTotal(){
        double total=0;
        for(Product pn:pr){
            total+=pn.quantity*pn.cost;
        }
        return total;
        
    }
    
}