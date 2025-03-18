package orneksorular;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String pswd = "285534";
        System.out.println("Please Enter U'r Password : ");
        String userPswd = s.next();
        if(userPswd.equals(pswd)){
            System.out.println("Login Succesfuly!");
        }
        else System.out.println("Login Failed");
    } 
}
