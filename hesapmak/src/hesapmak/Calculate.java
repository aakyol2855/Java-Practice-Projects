package hesapmak;

public class Calculate {
    public int topla(int id1,int id2){
        return (id1+id2);
    }
    public int cikart(int id1,int id2){
        if(id1<id2) return (id2-id1);
        else return (id1-id2);
    }
    public void printScreen(int sonuc){
        System.out.println("Sonuc =>"+sonuc);
    }
    
}
