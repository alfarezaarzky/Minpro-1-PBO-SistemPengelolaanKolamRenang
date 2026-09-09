/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaankolamrenang;

/**
 *
 * @author Alfareza
 */
import java.util.ArrayList;

public class ManajemenPengunjung {

    private ArrayList<Pengunjung> daftarPengunjung;

    public ManajemenPengunjung() {
        daftarPengunjung = new ArrayList<>();
    }

    public void tambahPengunjung(Pengunjung pengunjung) {

        daftarPengunjung.add(pengunjung);

        System.out.println("Data pengunjung berhasil ditambahkan");
    }

    public void tampilkanSemuaPengunjung() {

        if (daftarPengunjung.isEmpty()) {
            System.out.println("Belum ada data pengunjung");
            return;
        }

        System.out.println("\n==========================================");
        System.out.println("       Data Pengunjung Kolam Renang");
        System.out.println("==========================================");

        for (Pengunjung pengunjung : daftarPengunjung) {
            pengunjung.tampilkanData();
        }

        System.out.println("------------------------------------------");
    }

    public Pengunjung cariPengunjung(int idPengunjung) {

        for (Pengunjung pengunjung : daftarPengunjung) {

            if (pengunjung.getIdPengunjung() == idPengunjung) {
                return pengunjung;
            }
        }

        return null;
    }

    public boolean ubahPengunjung(
            int idPengunjung,
            String nama,
            int umur,
            String jenisKelamin,
            String jenisTiket,
            String tanggalKunjungan) {

        Pengunjung pengunjung = cariPengunjung(idPengunjung);

        if (pengunjung != null) {

            pengunjung.setNama(nama);
            pengunjung.setUmur(umur);
            pengunjung.setJenisKelamin(jenisKelamin);
            pengunjung.setJenisTiket(jenisTiket);
            pengunjung.setTanggalKunjungan(tanggalKunjungan);

            return true;
        }

        return false;
    }

    public boolean hapusPengunjung(int idPengunjung) {

        Pengunjung pengunjung = cariPengunjung(idPengunjung);

        if (pengunjung != null) {

            daftarPengunjung.remove(pengunjung);

            return true;
        }

        return false;
    }
}