package stackyapısı;

public class StackYapısı {


    public static void main(String[] args) {
        stackManagement nStack = new stackManagement();
        nStack.stack(6);
        nStack.push(1);
        nStack.push(2);
        nStack.push(3);
        nStack.push(4);
        nStack.push(5);
        
        nStack.readTo();
        System.out.println("----------");
        System.out.println("Tepedeki sayı -> "+ nStack.peek());
        System.out.println("\n");
        nStack.pop();
        nStack.pop();
        nStack.pop();
        nStack.readTo();
        System.out.println("----------");
        System.out.println("Tepedeki sayı -> " + nStack.peek());
    }
    
}
