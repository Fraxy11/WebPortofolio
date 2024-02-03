package com.webapp.biodata.model;

import java.io.Serializable;

public class Konten implements Serializable {

    private static final long serialVersionUID = 0;

    private String nama;

    private String pengalaman;

    private String pengalaman2;

    private String tanggal;

    private String sekolah;

    private String alamat;

    public String umur;

    public String pkl;



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman = pengalaman;
    }

    
    public String getPengalaman2() {
        return pengalaman2;
    }

    public void setPengalaman2(String pengalaman2) {
        this.pengalaman2 = pengalaman2;
    }


    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    
    public String getPkl() {
        return pkl;
    }

    public void setPkl(String pkl) {
        this.pkl = pkl;
    }

}
