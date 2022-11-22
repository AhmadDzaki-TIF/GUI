package com.dzaki.gui;

public class Peserta {
    private String NamaLengkap;
    private String NomorHP;
    private String Cabang;

    public Peserta() {
    }

    public Peserta(String namaLengkap, String nomorHP, String cabang) {
        NamaLengkap = namaLengkap;
        NomorHP = nomorHP;
        Cabang = cabang;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        NamaLengkap = namaLengkap;
    }

    public String getNomorHP() {
        return NomorHP;
    }

    public void setNomorHP(String nomorHP) {
        NomorHP = nomorHP;
    }

    public String getCabang() {
        return Cabang;
    }

    public void setCabang(String cabang) {
        Cabang = cabang;
    }

    @Override
    public String toString() {
        return "Peserta{" +
                "NamaLengkap='" + NamaLengkap + '\'' +
                ", NomorHP='" + NomorHP + '\'' +
                ", Cabang='" + Cabang + '\'' +
                '}';
    }
}
