/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg12dersi;

import java.util.Scanner;


public class Main {

    public static int f(int sum, int counter,int i) {
        if(counter == i) {
            System.out.println(sum);
            return 1;
        }
        else {
            counter+=1;
            sum+=counter;
            return f(sum,counter,i);
        }
    }
    
    public static void main(String[] args) {    
        int sum=0,counter=0;
        Scanner id1 = new Scanner(System.in);
        System.out.println("Lütfen toplamak için bir sayı giriniz");
        int ct=id1.nextInt();
        f(sum,counter,ct);
       
    }
  
}
