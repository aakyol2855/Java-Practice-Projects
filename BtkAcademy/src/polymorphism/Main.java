package polymorphism;

public class Main {
    
    public static void main(String[] args) {
//        EmailLogger logger = new EmailLogger();
//        logger.Log("Log mesaji");
//        DataBaseLogger dbLogger = new DataBaseLogger();
//        dbLogger.Log("Data Base mesajı");
        

//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(),new DataBaseLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.Log("logMesajı");
//        }
    
        CustomerManager cManager = new CustomerManager(new EmailLogger());
        cManager.add();
    }
} 
