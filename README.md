# Dokumentasi Program PBO

## 1. Deskripsi Singkat Program

Program ini merupakan aplikasi berbasis Java yang dibuat untuk menerapkan konsep 
Pemrograman Berorientasi Objek (PBO). Program yang dibuat adalah **[Nama Program]** 
yang digunakan untuk [jelaskan fungsi utama program secara singkat].

Program ini memiliki fitur utama berupa:
- [Fitur 1]
- [Fitur 2]
- [Fitur 3]
- [Fitur 4]

Dalam pembuatannya, program menerapkan beberapa konsep PBO seperti **class, object, 
attribute/property, constructor, method, ArrayList, percabangan, dan perulangan**.

---

## 2. Penjelasan Alur Program

Alur kerja program secara umum adalah sebagai berikut:

1. Program dijalankan melalui class **[Nama Class Main/Entry Point]**.
2. Program menampilkan menu utama kepada pengguna.
3. Pengguna memilih menu berdasarkan pilihan yang tersedia.
4. Program memproses pilihan pengguna menggunakan percabangan.
5. Jika pengguna memilih:
   - **Tambah Data**, pengguna memasukkan data yang diperlukan kemudian data disimpan.
   - **Tampilkan Data**, program menampilkan seluruh data yang telah tersimpan.
   - **Ubah Data**, pengguna memilih data yang akan diubah kemudian memasukkan data baru.
   - **Hapus Data**, pengguna memilih data yang akan dihapus.
   - **Keluar**, program dihentikan.
6. Setelah suatu proses selesai, program kembali menampilkan menu utama.
7. Perulangan akan terus berjalan sampai pengguna memilih menu **Keluar**.

### Gambaran Alur

```text
Mulai
  ↓
Menampilkan Menu
  ↓
Input Pilihan Pengguna
  ↓
┌───────────────────────┐
│ Pilihan Menu          │
├───────────────────────┤
│ 1. Tambah Data        │
│ 2. Tampilkan Data     │
│ 3. Ubah Data          │
│ 4. Hapus Data         │
│ 5. Keluar             │
└───────────────────────┘
  ↓
Proses Sesuai Pilihan
  ↓
Kembali ke Menu Utama
  ↓
Pilih Keluar?
  ├── Tidak → Kembali ke Menu
  └── Ya → Selesai
