package ıdpprojesi;

public class Cars {
    private String cMark;
    private String cModel;
    private String cYear;
    private String cType;
    private String cKm;
    
    public Cars(String cMark,String cModel, String cYear, String cKm, String cType){
        this.setType(cType);
        this.setcKm(cKm);
        this.setcMark(cMark);
        this.setcModel(cModel);
        this.setcYear(cYear);
    }
    
    public String getType(){
        return cType;
    }
    public void setType(String cType){
         this.cType = cType;
    }
    public String getcMark() {
        return cMark;
    }
    public void setcMark(String cMark) {
        this.cMark = cMark;
    }
    public String getcModel() {
        return cModel;
    }
    public void setcModel(String cModel) {
        this.cModel = cModel;
    }
    public String getcYear() {
        return cYear;
    }
    public void setcYear(String cYear) {
        this.cYear = cYear;
    }
    public String getcKm() {
        return cKm;
    }
    public void setcKm(String cKm) {
        this.cKm = cKm;
    }
    String readTo(){
        return (this.cKm + " " + this.cMark + " " + this.cModel + " "+ this.cYear);
    }
    
}
