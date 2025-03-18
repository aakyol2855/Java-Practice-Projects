package polishnotation;

public class Stack{
    private char[] sArray;
    private int size;
    private int flag;
    
    public void stack(int size){
        this.size = size;
        this.sArray = new char[this.size];
        flag = -1;
    }
    
    public boolean isFull(){
        if(this.flag == this.size){
            System.out.println("Stack is Full!");
            return (true);
        }
        else {
            System.out.println("Stack is not full");
            return (false);
        }
    }
    
    public boolean isEmpty(){
        if(this.flag ==  -1){
            System.out.println("Stack array is Empty!");
            return (true);
        }
        else {
            System.out.println("Stack array is not Empty!");
            return (false);
        }
    }
    
    public void push(char value){
        if(flag == sArray.length){
            System.out.println("Dizin dolu"); 
        }
        else {
            this.flag ++;
            sArray[flag]=value;
        }
    }
    
    public void pop(){
        if(flag == -1){
            System.out.println("Dizin boş");
        }
        else {
            sArray[flag]=0;
            flag--;
        }
    }
    public char peek(){//en son elemanı okur
        return sArray[flag];
    }
}
