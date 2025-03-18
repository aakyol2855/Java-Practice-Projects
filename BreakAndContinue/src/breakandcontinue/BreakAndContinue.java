/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakandcontinue;

/**
 *
 * @author aakyol28
 */
public class BreakAndContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("İlk");
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
