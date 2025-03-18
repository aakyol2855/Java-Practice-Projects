/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metotvefonksiyonlar;

/**
 *
 * @author aakyol28
 */
public class MetotVeFonksiyonlar {

    /**
     * @param args the command line arguments
     */
    //f(x) = 5x + 10
    static int f(int x){
        return 5*x+10;
    }
    static int g(int x,int y){
        return y+2*x;
    }
    static void yaz(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(g(5,3));
        System.out.println(f(g(5,3)));
        yaz();
    }
    
}
