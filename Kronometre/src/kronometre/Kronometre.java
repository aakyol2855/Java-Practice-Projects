
package kronometre;
import java.sql.*;

public class Kronometre {

    
    public static void main(String[] args) {
        //bu örnek treading işlemi içindir.
        kronometreTread thread1 = new kronometreTread("thread1");
        kronometreTread thread2 = new kronometreTread("thread2");
        kronometreTread thread3 = new kronometreTread("thread3");
        
        thread1.start();    
        thread2.start();    
        thread3.start();    
        
        Connection cnn = null;
        
    }
    
}
