/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

/**
 *
 * @author aakyol28
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for( int i=0; i<5 ; i++){
             System.out.println("mesaj"+(i+1));
        }
        int i=0;
        while(i<5){
            System.out.println("Mesaj"+(i*2));
            i++;
        }
        i=5;
        do{
            System.out.println("ileti"+(i*2));
            i++;
        }while(i<5);
    }
    
}
