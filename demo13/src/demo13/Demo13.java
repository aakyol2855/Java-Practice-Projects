/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo13;

import java.util.Scanner;


public class Demo13 {

    public static void main(String[] args) {
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
        System.out.println("Aranan elaman dizide : "+isThere);
    }
}
