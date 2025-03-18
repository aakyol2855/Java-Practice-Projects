package polymorphism;

public class CustomerManager {
    private BaseLogger baseLogger;
    
    public CustomerManager(BaseLogger logger){
        this.baseLogger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        baseLogger.log("LogMessage");
        
    }
}
