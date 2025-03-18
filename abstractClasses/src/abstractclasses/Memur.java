package abstractclasses;

public class Memur extends Muhasebe{

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int calismaSuresi() {
        return 250;
    }
    
}
