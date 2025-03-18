package placemanagementdemo;

public class student {
    private int sId ;
    private int sGrade;
    
    student(int id,int grade){
        this.sGrade = grade;
        this.sId = id;
    }
    
    public void displayInfo(){
        System.out.println(this.sId);
        System.out.println(this.sGrade);
    }
}
