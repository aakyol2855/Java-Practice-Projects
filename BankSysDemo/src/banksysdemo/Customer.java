package banksysdemo;

import java.util.List;

class Customer {
    private String name;
    private String surname;
    private String tcId;
    private List <AccountManager> accounts;
    
    public Customer(){
        this.name = "null";
        this.surname = "null";
        this.tcId = "null";
        this.accounts.add(null);
    }
    
    
}
