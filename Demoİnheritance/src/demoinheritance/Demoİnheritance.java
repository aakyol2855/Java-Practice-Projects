package demoinheritance;

public class Demoİnheritance {

    public static void main(String[] args) {
        TeacherCreditManager nTeacher = new TeacherCreditManager ();
        CreditUI krediUI = new CreditUI();
        krediUI.CreditCalc( nTeacher);
        
    }
    
}
