/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempengelolaankolamrenang;

/**
 *
 * @author Alfareza
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ManajemenPengunjung manajemen =
                new ManajemenPengunjung();

        ValidasiInput validasi =
                new ValidasiInput(scanner);

        int pilihan;

        do {

            System.out.println("\n==========================================");
            System.out.println("     Sistem Manajemen Pengunjung");
            System.out.println("              Kolam Renang");
            System.out.println("==========================================");
            System.out.println("1. Tambah Pengunjung");
            System.out.println("2. Tampilkan Pengunjung");
            System.out.println("3. Ubah Pengunjung");
            System.out.println("4. Hapus Pengunjung");
            System.out.println("5. Cari Pengunjung");
            System.out.println("0. Keluar");
            System.out.println("==========================================");

            pilihan = validasi.inputInteger("Pilih menu: ");

            switch (pilihan) {

                case 1:

                    System.out.println(
                        "\n--- Tambah Data Pengunjung ---"
                    );

                    int id = validasi.inputId(
                        "Id Pengunjung: "
                    );

                    if (manajemen.cariPengunjung(id) != null) {

                        System.out.println(
                            "Id tersebut sudah digunakan"
                        );

                        break;
                    }

                    String nama = validasi.inputString(
                        "Nama Pengunjung: "
                    );

                    int umur = validasi.inputUmur(
                        "Umur: "
                    );

                    String jenisKelamin =
                        validasi.inputJenisKelamin();

                    String jenisTiket =
                        validasi.inputJenisTiket();

                    String tanggalKunjungan =
                        validasi.inputString(
                            "Tanggal Kunjungan: "
                        );

                    Pengunjung pengunjungBaru =
                        new Pengunjung(
                            id,
                            nama,
                            umur,
                            jenisKelamin,
                            jenisTiket,
                            tanggalKunjungan
                        );

                    manajemen.tambahPengunjung(
                        pengunjungBaru
                    );

                    break;
                    
                case 2:

                    System.out.println(
                        "\n--- Daftar Pengunjung ---"
                    );

                    manajemen.tampilkanSemuaPengunjung();

                    break;

                case 3:

                    System.out.println(
                        "\n--- Ubah Data Pengunjung ---"
                    );

                    int idUbah = validasi.inputId(
                        "Masukkan Id Pengunjung: "
                    );

                    if (manajemen.cariPengunjung(idUbah)
                            == null) {

                        System.out.println(
                            "Data Pengunjung Tidak Ditemukan"
                        );

                        break;
                    }

                    String namaBaru =
                        validasi.inputString(
                            "Nama baru: "
                        );

                    int umurBaru =
                        validasi.inputUmur(
                            "Umur baru: "
                        );

                    String jenisKelaminBaru =
                        validasi.inputJenisKelamin();

                    String jenisTiketBaru =
                        validasi.inputJenisTiket();

                    String tanggalBaru =
                        validasi.inputString(
                            "Tanggal kunjungan baru: "
                        );

                    boolean berhasilUbah =
                        manajemen.ubahPengunjung(
                            idUbah,
                            namaBaru,
                            umurBaru,
                            jenisKelaminBaru,
                            jenisTiketBaru,
                            tanggalBaru
                        );

                    if (berhasilUbah) {

                        System.out.println(
                            "Data berhasil diubah"
                        );

                    } else {

                        System.out.println(
                            "Data gagal diubah"
                        );
                    }

                    break;

                case 4:

                    System.out.println(
                        "\n--- Hapus Data Pengunjung ---"
                    );

                    int idHapus = validasi.inputId(
                        "Masukkan Id Pengunjung: "
                    );

                    boolean berhasilHapus =
                        manajemen.hapusPengunjung(
                            idHapus
                        );

                    if (berhasilHapus) {

                        System.out.println(
                            "Data berhasil dihapus"
                        );

                    } else {

                        System.out.println(
                            "Data pengunjung tidak ditemukan"
                        );
                    }

                    break;


                case 5:

                    System.out.println(
                        "\n--- Cari Data Pengunjung ---"
                    );

                    int idCari = validasi.inputId(
                        "Masukkan Id Pengunjung: "
                    );

                    Pengunjung hasil =
                        manajemen.cariPengunjung(idCari);

                    if (hasil != null) {

                        System.out.println(
                            "\nData pengunjung ditemukan:"
                        );

                        hasil.tampilkanData();

                    } else {

                        System.out.println(
                            "Data pengunjung tidak ditemukan"
                        );
                    }

                    break;

                case 0:

                    System.out.println(
                        "\n=========================================="
                    );

                    System.out.println(
                        "Terima kasih telah menggunakan"
                    );

                    System.out.println(
                        "Sistem Manajemen Pengunjung Kolam Renang"
                    );

                    System.out.println(
                        "=========================================="
                    );

                    break;

                default:

                    System.out.println(
                        "Menu tidak tersedia"
                    );
            }

        } while (pilihan != 0);

        scanner.close();
    }
}