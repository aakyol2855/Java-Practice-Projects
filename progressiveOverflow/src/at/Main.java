package at;

import java.io.IOException;


public class Main {
    
    public static void main(String[] args) throws IOException {
        
    ProgressiveOverflow probe = new ProgressiveOverflow(11);
    probe.insert(46);
    probe.insert(35);
    probe.insert(32);
    probe.insert(21);
    probe.insert(10);
    probe.insert(45);
    probe.insert(47);
    probe.insert(37);
    probe.insert(45);
    probe.insert(22);
    probe.insert(33);
    
    probe.printscr();
    
    probe.showTable();
    
    
    
   
    
            
    
    }
}