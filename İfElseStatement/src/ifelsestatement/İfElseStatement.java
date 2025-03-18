package ifelsestatement;
//90+ AA
import java.util.Scanner;
//80-90 BB
//70-80 CC
//70- FF
public class İfElseStatement {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//        Java.util.Scanner s2= new Scanner(System.in); bu da kullanılabilir import etmeden
        System.out.println("Lütfen notunuzu giriniz : ");
        int i=s.nextInt();
        if(i>=90) System.out.println("Notunuz : AA");
        else if (i>=80) System.out.println("Notunuz : BB");
        else if (i>=70) System.out.println("Notunuz : CC");
        else if (i<70) System.out.println("Notunuz : FF");
        else System.out.println("Hatali işlem yaptınız!");
    }
    
}
