package placemanagementdemo;

public class Main {

    public static void main(String[] args) {
        person nPerson1 = new person("Abdulvahab", 21);
        person nPerson2 = new person("Ali", 19);
        student nStudent1 = new student(210303055, 25);
        student nStudent2 = new student(210303057, 75);
        System.out.println("----------");
        nPerson1.displayInfo();
        nPerson2.displayInfo();
        System.out.println("----------");
        nStudent1.displayInfo();
        nStudent2.displayInfo();
        System.out.println("----------");
    }
    
}
