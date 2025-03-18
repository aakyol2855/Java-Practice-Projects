package classes;

public class Classes {

    public static void main(String[] argumants/*argümanlar*/) {
//        Classlar referans tiplerdir.
        CustomerManager anyName;
        CustomerManager anyName2 = new CustomerManager();
        anyName = anyName2;
        anyName.Update();
        anyName.Add();
        anyName.Remove();
    }
    
}
