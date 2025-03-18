package demoinheritance;

public class TarımCreditManager extends BaseCreditManager {
    public void hesapla(int b){
        int a = (int) (b *0.45);
        System.out.println("Kredi hesaplandı");
    }
}
