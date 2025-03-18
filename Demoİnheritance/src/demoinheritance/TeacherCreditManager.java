package demoinheritance;

public class TeacherCreditManager extends BaseCreditManager{
    public void hesapla(int b){
        int a = (int)(b*0.23);
        System.out.println("Kredi hesaplandı.");
    }
}
