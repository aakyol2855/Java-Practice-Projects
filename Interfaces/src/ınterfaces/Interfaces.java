package ınterfaces;
public class Interfaces {
    public static void main(String[] args) {
        //interfaces
        //dal = data access layer
        System.out.println("none of u'r bussiness bitch!");
        
        ıCustomerDal customerDal = new MySqlCustomerDal();//pollyMorphism
        
        ıCustomerDal customerManager = new MySqlCustomerDal();
        customerManager.Add();
        //sistemi başka bir data base'e geçirmek için sadece customerManager'in
        //classını değiştiririz ve tüm sistem geçmiiş olur.
        ıCustomerDal customerManager2 = new OracleCustımerDal();
        customerManager2.Add();
        

        CustomerManager customerManager3 = new CustomerManager(new MySqlCustomerDal());
        customerManager3.Add();
        //Burada eğer yazılımcı yukarıda ıCustomerDal'a bir data base vermeyi unutursa
        //diye bunu CustomerManager'da atama yapmak zorunda olacak şekilde yazzdık.
        //böylede customerManager3 adlı nesne oluştururlurken bizden bir data base
        //vermemiz istenecek ve unutma ihtimali ortadan kalkacak.
        
    }
}
