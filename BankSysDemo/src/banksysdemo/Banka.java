package banksysdemo;

import java.util.List;

public class Banka {
    private String bankaName;
    private String adress;
    private List <Customer> customers;
    private List <AccountManager> accounts; 
    private List  <Credit> credits;
    
    public Banka(){
        this.bankaName = "AkyolBank";
        this.adress = "null";
        this.customers.add(null);
        this.accounts.add(null);
        this.credits.add(null);
    }
    
}
