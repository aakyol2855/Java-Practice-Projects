package carsınform;
public class CarInformations {
    protected String _marka;
    protected String _model;
    protected String _renk;
    protected int _uretimYili;
    protected String _fiyat;
    
    void arabaAdd(String marka, String model , String renk , int uretimYili,String fiyat){
        this.setMarka(marka);
        this.setModel(model);
        this.setRenk(renk);
        this.setUretimYili(uretimYili);
        this.setFiyat(fiyat);
    }
    
    String readTo(){
        return (this.getMarka() + " " + this.getModel()+ " " + this.getRenk() + " " + this.getUretimYili() + " " + this.getFiyat() + "\n");
    }

    public String getMarka() {
        return _marka;
    }

    public void setMarka(String _marka) {
        this._marka = _marka;
    }

    public String getModel() {
        return _model;
    }

    public void setModel(String _model) {
        this._model = _model;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String _renk) {
        this._renk = _renk;
    }

    public int getUretimYili() {
        return _uretimYili;
    }

    public void setUretimYili(int _uretimYili) {
        this._uretimYili = _uretimYili;
    }

    public String getFiyat() {
        return _fiyat;
    }

    public void setFiyat(String _fiyat) {
        this._fiyat = _fiyat;
    }
    
}
