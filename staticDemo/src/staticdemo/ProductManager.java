package staticdemo;
public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValidate(product)){
//validator nesnesi oluşturulmadan isValidate'i kullandık. Static old. için
            System.out.println("Data base'e eklendi.");
        }
        else{
            System.out.println("Ürün bilgileri geçersiz.");
        }
//        ProductValidator pValidator = new ProductValidator();
//        pValidator.anotherOp();
//ProductValidator adlı class'ta bulunan ve static olmayan anotherOp adlı
//fonk. çağırmamız için new'lememiz ve nesne oluşturmamız gerekir.
    }
}
