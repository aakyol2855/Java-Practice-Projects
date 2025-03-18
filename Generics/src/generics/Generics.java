package generics;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        validator valid = new validator();
        Customer cst = new Customer();
        valid.validate(cst);
        
    }
    
}
