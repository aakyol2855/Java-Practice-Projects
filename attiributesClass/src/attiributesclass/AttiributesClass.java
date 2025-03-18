package attiributesclass;
public class AttiributesClass {

    public static void main(String[] args) {
        Product product = new Product(1, "Casper Excalibur", 16000, 2, "Siyah","Laptop");
        
        
        System.out.println(product.getName());
        System.out.println(product.getKod());
        System.out.println(product.getid());
        ProductManager mngr = new ProductManager();
        mngr.Add(product);
        
    }
    
}
