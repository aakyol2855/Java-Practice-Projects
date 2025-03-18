package polymorphism.overridingDemo;

public class Main {
    public static void main (String[] args){
        
//        OgretmenCreditManager oCredit = new OgretmenCreditManager();
//        System.out.println(oCredit.hesapa(1000));
        
        baseCreditManager[] krediManagers  = new baseCreditManager[]
        {new OgretmenCreditManager(),new TarımCreditManager(),new OgrenciCreditManager()};
        
        for(baseCreditManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
