package staticdemo;
public class StaticDemo {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "";
        
        manager.add(product);
        
        DataBaseHelper.Crud.Create();
        DataBaseHelper.Connection.createConnection();
    } 
}
