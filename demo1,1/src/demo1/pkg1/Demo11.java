/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo1.pkg1;

import java.util.Scanner;

/**
 *
 * @author aakyol28
 */
public class Demo11 {
    
    public static void main(String[] args) {
        
        System.out.println("Lütfen kontrol etmek istediğiniz sayıyı giriniz :");
        Scanner id1=new Scanner(System.in);
        int num=id1.nextInt();
        boolean isPrime=true;
        if(num==1) {
            System.out.println("Sayı asal değildir.");
            return;
        }
        if(num<1) System.out.println("Sayı Asaldır.");
        for(int i=2;i<num;i++){
            if(num % i == 0) isPrime = false;
        }
        if(isPrime == true){
            System.out.println("Sayı Asaldır.");
        }
        else System.out.println("Sayı asal değildir.");
    }
    
}
