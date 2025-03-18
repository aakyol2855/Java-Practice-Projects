package ders.pkg31;

import newAcces.*;


public class Ders31 {

    
    public static void main(String[] args) {
        pubpriv pp = new pubpriv();
        pp.setIsim("Abdulvahab");
        pp.setYas(21);
        pp.setDogumYili(2002);
//        System.out.println("Isim => "+pp.getIsim());
//        System.out.println("Yaş => "+pp.getYas());
//        System.out.println("Doğum Yılı => "+pp.getDogumYili());
//        System.out.println("-------------------------");
//        pp.Read1();  
//        System.out.println("-------------------------");
//        pp.Read3();
//        System.out.println("-------------------------");
//        pp.Read4();
//        pp.setSoyIsim("Akyol");
//        System.out.println(pp.getSoyIsim());
//        newAcces.testSinifi pp1 = new newAcces.testSinifi();
        testSinifi pp1 = new testSinifi();
        pp1.settIsim("Abdulvahab");
        pp1.settSoyisim("Akyol");
        pp1.settDogumYili(2002);
        pp1.settYas(21);
        System.out.println(pp1.gettIsim());
        System.out.println(pp1.gettSoyisim());
        System.out.println(pp1.gettYas());
        System.out.println(pp1.gettDogumYili());
    }
    
}
