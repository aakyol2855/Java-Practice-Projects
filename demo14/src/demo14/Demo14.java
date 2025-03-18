package demo14;
import java.util.Scanner;

public class Demo14 {
    
    public static void main(String[] args) {  
      sayıBul();
      
    }
     
    public static void sayıBul(){//camel casing(ilk harf küçük ikinci harf büyük olmasının adı)
        int nums[]=new int[]{11,13,3,4,2,6,7,8,9,21,0};
        System.out.println("Dizide aranacak olan bir giriniz :");
        Scanner s=new Scanner(System.in);
        int finder=s.nextInt();
        boolean isThere=false;
        
        for (int i = 0; i < 10; i++) {
            if(nums[i] == finder){
                isThere = true;
            }
        }
        ekranaYaz(isThere);
    }
    public static void ekranaYaz(boolean isThere){
        System.out.println("Aranan elaman dizide : "+isThere);
    }
}
