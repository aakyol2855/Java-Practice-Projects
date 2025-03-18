package placemanagementdemo;

public class person {
    private String pName;
    private int  pAge;
    person(String name,int age){
        this.pName = name;
        this.pAge = age;
    }
    public void displayInfo(){
        System.out.println(this.pName);
        System.out.println(this.pAge);
    }
}
