package banksysdemo;

class AccountManager {
    protected double balance;
    
    public void deposit(double amount){
        balance+= amount;
    }
    
    public void withDraw(double amount) throws BalanceInsufficientException {
        if(balance>=amount){
            balance-=amount;
        }else{
            throw new BalanceInsufficientException ("Hesap Bakiyesi yetersiz!");
        }            
    }
    
    public double getBalance() {
        return balance;
    }
    
    
    
}
