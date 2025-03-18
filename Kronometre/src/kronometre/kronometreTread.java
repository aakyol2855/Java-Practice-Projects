package kronometre;

public class kronometreTread implements Runnable{

    private Thread thread;
    private String threadName;
    
    public kronometreTread(String threadName){
        this.threadName = threadName;
        System.out.println("Olusturuluyor : "+threadName);
    }
    
    @Override
    public void run() {
        System.out.println("Calistiriliyor : "+threadName);
        try {
            for(int i =0;i<10;i++){
            System.out.println(threadName + " : " +i);
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            System.out.println("Interrupted"+threadName);
        }
        
        System.out.println("Thread bitti."+threadName);    
    }
    
    public void start(){
        System.out.println("Thread nesnesi oluşuyor...");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
