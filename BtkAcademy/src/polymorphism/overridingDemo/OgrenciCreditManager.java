package polymorphism.overridingDemo;

public class OgrenciCreditManager extends baseCreditManager{
    
    public double hesapla(double tutar){//BaseCreditManager 'da public 
//yanına final yazıldığı için hesapla fonksiyonu ezilemiyor/aşılıp özel 
//işlem yapılamıyor
        return tutar*1.10;
    }
    
}
