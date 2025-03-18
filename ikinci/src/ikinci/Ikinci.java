/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ikinci;

/**
 *
 * @author aakyol28
 */
public class Ikinci {
    public static void main(String[] args) {
        String s="Benim Adım Abdulvahab";
        s=s.toUpperCase();
        System.out.println(s);
        int ilkBoşluk = s.indexOf(" ");
        
        int sonboşluk = s.lastIndexOf(" ");
        String sonKelime = s.substring(sonboşluk);
        String ilkKelime = s.substring(0, ilkBoşluk);
        System.out.println("dizgi " + s + " İlk boşluk : "+ilkBoşluk + ilkKelime + " Son kelime : "+sonKelime);
        System.out.println("10. Harf : "+s.charAt(11));
    }
    
}
