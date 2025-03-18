package javaapplication1;

public class AbstractClass {

    public static void main(String[] args) {
        womanGameCalc womanC =new womanGameCalc();
        manGameCalc manC =new manGameCalc();
        
        womanC.hesapla();
        manC.hesapla();
        womanC.gameOver();
        
        GameCalculator gmr = new GameCalculator();//abstract sınıfı newlenemez. Çünkü hesaplanın içinin yazılması gerekir.
        GameCalculator newCa = new womanGameCalc();
    }
}
