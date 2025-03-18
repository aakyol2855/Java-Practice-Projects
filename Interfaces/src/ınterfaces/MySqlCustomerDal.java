package ınterfaces;
public class MySqlCustomerDal implements ıCustomerDal{

    @Override
    public void Add() {
        System.out.println("My Sql'e eklendi.");
    }
    
}
