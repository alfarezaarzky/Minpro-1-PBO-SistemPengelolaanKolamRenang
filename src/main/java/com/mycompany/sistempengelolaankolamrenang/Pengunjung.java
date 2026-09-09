/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaankolamrenang;

/**
 *
 * @author Alfareza
 */
public class Pengunjung {

    private int idPengunjung;
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String jenisTiket;
    private String tanggalKunjungan;

    public Pengunjung(int idPengunjung, String nama, int umur,
                      String jenisKelamin, String jenisTiket,
                      String tanggalKunjungan) {
        this.idPengunjung = idPengunjung;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.jenisTiket = jenisTiket;
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public int getIdPengunjung() {
        return idPengunjung;
    }

    public void setIdPengunjung(int idPengunjung) {
        this.idPengunjung = idPengunjung;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public String getTanggalKunjungan() {
        return tanggalKunjungan;
    }

    public void setTanggalKunjungan(String tanggalKunjungan) {
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public void tampilkanData() {
        System.out.println("------------------------------------------");
        System.out.println("Id Pengunjung     : " + idPengunjung);
        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur + " tahun");
        System.out.println("Jenis Kelamin     : " + jenisKelamin);
        System.out.println("Jenis Tiket       : " + jenisTiket);
        System.out.println("Tanggal Kunjungan : " + tanggalKunjungan);
    }
}