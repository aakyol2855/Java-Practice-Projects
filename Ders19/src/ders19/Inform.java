package ders19;

public class Inform {
   private String marka; 
   private String model; 
   private String uretimYili; 
   private String renk; 
   private String fiyat; 
   
   void araba (String marka,String model,String uretimYili,String renk ,String fiyat ){
       this.fiyat=fiyat;
       this.marka=marka;
       this.model=model;
       this.uretimYili=uretimYili;
       this.renk=renk;
   }
   String readTo(){
       return (this.marka +" " + this.model +" " + this.renk + " " + this.uretimYili + " " + this.fiyat);
   }

}
