package com.yasarerkan.activitelistdeneme0811;

public class Kisimodel {

    private String  isim;
    private String passw;
    private String yas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public Kisimodel(String isim, String passw, String yas) {
        this.isim = isim;
        this.passw = passw;
        this.yas = yas;
    }
}
