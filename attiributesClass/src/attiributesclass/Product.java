package attiributesclass;

public class Product {
    
    public Product(int id , String description , double price , int stockAmount ,String renk,String name ){
        System.out.println("Yapıcı blok çalıştı.");
        this._id=id;
        this._desciripton=description;
        this._price = price;
        this._stockAmount = stockAmount;
        this._renk = renk;
        this._name= name;
    }
    //aynı isim farklı parametrelerle işlem yapamya overloading denir.
    public Product (){
        
    }
    
    private int _id;
    private String _name;
    private String _desciripton;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;
    
//    getter bloğu
    public int getid(){
        return _id;
    }
    public void getName(String _name){
        this.setName(_name);
    }
//    setter bloğu
    public void setid(int id){
        this._id=id;//anlam karışıklığını engellemek için this id yazılır
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getDesciripton() {
        return _desciripton;
    }

    public void setDesciripton(String _desciripton) {
        this._desciripton = _desciripton;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String _renk) {
        this._renk = _renk;
    }

    public String getKod() {
        return this._name.substring(0,2)+_id;
    }

}
