package strings;

public class Strings {

    
    public static void main(String[] args) {
       String mesaj = "Bugün hava çok güzel.";
       System.out.println(mesaj);
       int i=2;
       if(i==0){
            System.out.println("Eleman sayısı =>" +mesaj.length());

            System.out.println("5.Eleman  =>"+mesaj.charAt(4) );

            System.out.println(mesaj.concat(" Yaşasın!"));//Mesaja yaşasın eklyor

            System.out.println(mesaj.startsWith("B"));//mesaj b ie başlıyorsa true

            System.out.println(mesaj.endsWith("."));//mesaj . ile bitiyorsa true

            char karakterler[]=new char[5];
            mesaj.getChars(0, 5, karakterler,0);//0dan başla ve msajın 5. elemanına kadar olan karakterleri, karakterler char dizisine ata
            System.out.println(karakterler);

            System.out.println(mesaj.indexOf("av"));
            System.out.println(mesaj.lastIndexOf("a"));//mesajın son indexi a olan elamanın yerini söyler
       }
       String yenimesaj=mesaj.replace(' ', '-');
       System.out.println(yenimesaj);
       
       System.out.println(mesaj.substring(2));//2.indexden itibaren kesiyor ve yazıyor

       for(String kelime : mesaj.split(" ")){//hernbirini ayrı ayrı string olarak yazdırıyor
           System.out.println(kelime);
       }
       
       System.out.println(mesaj.toUpperCase());
       System.out.println(mesaj.toLowerCase());
       
       System.out.println(mesaj.trim());
       
    }
    
}
