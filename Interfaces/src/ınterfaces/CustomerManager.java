package ınterfaces;
public class CustomerManager {
    
    private ıCustomerDal customerDal;
    
    public CustomerManager(ıCustomerDal customerDal){
        this.customerDal = customerDal;
    }
    
    public void Add(/*Burası veri alıyor*/){
        //iş kodları yazılır.
        customerDal.Add();
        
    }
    
}
