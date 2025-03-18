/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

import java.util.Date;

public class Ucus {
    private int ucusNo;
    private Havalimani kalkis;
    private Havalimani varis;
    private Ucak ucak;
    private Gun gun;
    private Saat saat;
    private String kapiNo;
    private Durum durum;

    public Ucus(int ucusNo, Havalimani kalkis, Havalimani varis, Ucak ucak, Gun gun, Saat saat, String kapiNo, Durum durum) {
        this.ucusNo = ucusNo;
        this.kalkis = kalkis;
        this.varis = varis;
        this.ucak = ucak;
        this.gun = gun;
        this.saat = saat;
        this.kapiNo = kapiNo;
        this.durum = durum;
    }

    public int getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(int ucusNo) {
        this.ucusNo = ucusNo;
    }

    public Havalimani getKalkis() {
        return kalkis;
    }

    public void setKalkis(Havalimani kalkis) {
        this.kalkis = kalkis;
    }

    public Havalimani getVaris() {
        return varis;
    }

    public void setVaris(Havalimani varis) {
        this.varis = varis;
    }

    public Ucak getUcak() {
        return ucak;
    }

    public void setUcak(Ucak ucak) {
        this.ucak = ucak;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Saat getSaat() {
        return saat;
    }

    public void setSaat(Saat saat) {
        this.saat = saat;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    public void durumGuncelle(Durum yeniDurum) {
        this.durum = yeniDurum;
    }
}
