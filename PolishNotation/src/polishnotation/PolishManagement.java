package polishnotation;

public class PolishManagement { 
    Stack nStack = new Stack();
    String postfix = "";
    
    public void toChar(String content){
        
        int lenght = content.length();
        char[] nArray = new char[lenght];
        for (int i = 0 ; i<lenght ; i++){
            nArray[i] = content.charAt(i);
        }
    }
    public int checkPriorty(char op1){
        switch (op1) {
            case '+':
            case '-':
                return (1);
            case '*':
            case '/':
                return 2;
            case '^':
                return 4;
            default:
                throw new AssertionError();
        }
    }
    
    public boolean isOperator(){
        if(){ 
    }
    }
    
}
