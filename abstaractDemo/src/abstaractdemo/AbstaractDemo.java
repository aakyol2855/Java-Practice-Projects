package abstaractdemo;

public class AbstaractDemo {

    public static void main(String[] args) {
        customerManager customer = new customerManager();
        customer.databaseManager = new SqlServerManager();
        customer.getCustomers();
        
        customer.databaseManager = new oracleDataManager();
        customer.getCustomers();
        
        customer.databaseManager = new mySqlDataBaseManager();
        customer.getCustomers();
       
    }
    
}
