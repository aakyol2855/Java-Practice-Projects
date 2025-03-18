package banksysdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        
        manager.deposit(100.5);
        System.out.println("Hesaptaki tutar =>"+manager.getBalance());
        
        try {
            manager.withDraw(80.5);
            System.out.println("Hesaptaki tutar =>"+manager.getBalance());
        
            manager.withDraw(21);
            System.out.println("Hesaptaki tutar =>"+manager.getBalance());
        } catch (BalanceInsufficientException  ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
