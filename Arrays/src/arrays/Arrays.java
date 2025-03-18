/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author aakyol28
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int a[]=new int[5];
//        a[3]=8;
//        System.out.println("3. eleman : "+a[3]);
//        int b[] = {1,3,5,7,9};
//        String str[] = {"ali","baba","ve","kırk","haramiler"};
//        System.out.println(str[2]+str[4]+str[3]);


//        String students[]= new String[3];
//        students[0]="Abdulvahab";
//        students[1]="Ensar";
//        students[2]="Esat";
//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i]);
//        }
//        System.out.println("-------------------");
//        for(String ogrenci:students){
//            System.out.println(ogrenci);
//        }
        

        //Multi daimentionalArrays
        String şehirler[][]=new String[3][3];
        şehirler[0][0]="İstanbul";
        şehirler[0][1]="Bursa";
        şehirler[0][2]="Bilecik";
        şehirler[1][0]="Ankara";
        şehirler[1][1]="Konya";
        şehirler[1][2]="Kayseri";
        şehirler[2][0]="Diyarbekr";
        şehirler[2][1]="Şanlıurfa";
        şehirler[2][2]="Gaziantep";
        
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println(şehirler[i][j]);
            }
            
        }
    }
    
}
