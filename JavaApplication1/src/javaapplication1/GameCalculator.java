package javaapplication1;

public abstract class GameCalculator {
    public abstract void hesapla();//her sınıfın kendi implemente işlemi yapması gerekir.
    
    
    public final void gameOver(){
        System.out.println("Oyun bitti!");
    }
}
