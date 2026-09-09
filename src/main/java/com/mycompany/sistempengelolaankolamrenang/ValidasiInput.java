/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengelolaankolamrenang;

/**
 *
 * @author Alfareza
 */
import java.util.Scanner;

public class ValidasiInput {

    private Scanner scanner;

    public ValidasiInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputInteger(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka");
            }
        }
    }

    public int inputId(String pesan) {

        while (true) {

            int id = inputInteger(pesan);

            if (id > 0) {
                return id;
            }

            System.out.println("Id harus lebih dari 0");
        }
    }

    public int inputUmur(String pesan) {

        while (true) {

            int umur = inputInteger(pesan);

            if (umur >= 1 && umur <= 100) {
                return umur;
            }

            System.out.println(
                "Umur harus berada antara 1 sampai 100 tahun"
            );
        }
    }

    public String inputString(String pesan) {

        while (true) {

            System.out.print(pesan);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input tidak boleh kosong");
        }
    }

    public String inputJenisKelamin() {

        while (true) {

            System.out.print("Jenis Kelamin (L/P): ");

            String pilihan = scanner.nextLine();

            if (pilihan.equalsIgnoreCase("L")) {
                return "Laki-laki";
            }

            if (pilihan.equalsIgnoreCase("P")) {
                return "Perempuan";
            }

            System.out.println(
                "Pilihan tidak valid, Masukkan L atau P"
            );
        }
    }

    public String inputJenisTiket() {

        while (true) {

            System.out.println("\nJenis Tiket:");
            System.out.println("1. Biasa");
            System.out.println("2. VIP");

            int pilihan = inputInteger("Pilih jenis tiket: ");

            if (pilihan == 1) {
                return "Biasa";
            }

            if (pilihan == 2) {
                return "VIP";
            }

            System.out.println("Pilihan tiket tidak tersedia");
        }
    }
}