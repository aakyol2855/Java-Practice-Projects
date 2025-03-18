package staticdemo;
public class ProductValidator {
    
    static{
        System.out.println("Static constructor blok çalıştı.");
    }//ProductValidator newlenmediği zaman alttaki const. çalışmaz ama bu
    //çalışır çünkü static ve genel.
    
    public ProductValidator(){
        System.out.println("Yapıcı Blok(Constructor) çalıştı.");
    }
    
    public static boolean isValidate(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void anotherOp(){
        
    }
    //inner class alttaki
    public class BaskaBirClass{
        public static void sil(){
            System.out.println("İnner class'ın sil fonksiyonu çaıştı.");
        }
    }
    
}
