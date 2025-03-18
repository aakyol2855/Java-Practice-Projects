package rsaalgoritm;

import java.math.BigInteger;
import java.util.Scanner;

public class RsaAlgoritm {

    public static void main(String[] args) {
        int p = 43;
        int q = 59;
        int e = 13;
        BigInteger n = new BigInteger("2537"); 
        int temp = (p-1)*(q-1); 
        BigInteger fi= BigInteger.valueOf(temp);
        BigInteger d=new BigInteger("1169");
        
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("encryrpted or decrypted (1/2)");
        int choose = scn.nextInt();
        
        if(choose == 1){
            System.out.println("mesaj giriniz : ");
            String msj= scn.nextLine();
        
            String ciphed = " ";
        
            for(int i = 0; i< msj.length();i++){
                char karakter = msj.charAt(i); 
                BigInteger ascii = BigInteger.valueOf((int)karakter);
                BigInteger encyripted = ascii.modPow(BigInteger.valueOf(e), n);
                ciphed+=encyripted+" ";
            }
            System.out.println(ciphed);
        }
        
         else if(choose == 2){
            System.out.println("Şifreli metni giriniz : ");
            BigInteger cryp = scn.nextBigInteger();
            BigInteger decrypted = cryp.modPow(d, n);
            System.out.println("Çözülmüş mesaj: " + decrypted.toString());
         }
        
        System.out.println("Bitti.");
        
    }
    
}
