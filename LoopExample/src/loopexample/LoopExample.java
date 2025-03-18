/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopexample;

import java.util.Scanner;

/**
 *
 * @author aakyol28
 */
public class LoopExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        for(int i=0; i<100 ; i++){
         if(i%2 !=0){
             System.out.println(""+i);
         }
     }  
     */
     /*
     for(int i= 0 ; i<100;i++){
         if(i%3==0 && i%7==0){
             System.out.println(""+i);
         }
     }
     */
     /*
    Scanner s=new Scanner(System.in); 
    System.out.println("Lütfen 2'nin kaçıncı kuvvetini alacağınız giriniz : ");
    int num=s.nextInt();
    int times=2;
    for(int i=0;i<num;i++){
        System.out.println(times);//Math.pow(); ile de üs alma işlemi yapılabilir.
        times=times*2;
     }
     */
    for(int i=1;i<=5;i++){
        if(i%5==0) System.out.println(i);
        }
    }
    
     
}
