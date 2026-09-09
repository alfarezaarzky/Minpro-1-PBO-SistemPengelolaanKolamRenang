# Dokumentasi Program PBO

## 1. Deskripsi Singkat Program

Program ini merupakan aplikasi berbasis Java yang dibuat untuk menerapkan konsep Pemrograman Berorientasi Objek (PBO). Program yang dibuat adalah Sistem Manajemen Pengunjung Kolam Renang yang digunakan untuk mengelola data pengunjung yang datang ke kolam renang.

Program ini memiliki fitur utama berupa:

* Menambahkan data pengunjung.
* Menampilkan data pengunjung.
* Mengubah data pengunjung.
* Menghapus data pengunjung.
* Mencari data pengunjung berdasarkan Id.

Dalam pembuatannya, program menerapkan beberapa konsep PBO seperti class, object, attribute/property, constructor, method, ArrayList, percabangan, dan perulangan. Selain itu, program juga menerapkan beberapa berupa access modifier, encapsulation, dan validasi input untuk membuat program lebih terstruktur dan aman digunakan.

---

## 2. Penjelasan Alur Program

Alur kerja program secara umum adalah sebagai berikut:

1. Program dijalankan melalui class Main sebagai entry point.
2. Program membuat objek ManajemenPengunjung untuk mengelola data pengunjung dan objek ValidasiInput untuk menangani validasi input.
3. Program menampilkan menu utama kepada pengguna.
4. Pengguna memilih menu berdasarkan pilihan yang tersedia.
5. Program memproses pilihan pengguna menggunakan percabangan.
6. Jika pengguna memilih:

   * Tambah Data, pengguna memasukkan data pengunjung berupa ID, nama, umur, jenis kelamin, jenis tiket, dan tanggal kunjungan, kemudian data disimpan ke dalam ArrayList.
   * Tampilkan Data, program menampilkan seluruh data pengunjung yang telah tersimpan menggunakan perulangan.
   * Ubah Data, pengguna memasukkan ID pengunjung yang akan diubah, kemudian memasukkan data baru.
   * **Hapus Data**, pengguna memasukkan ID pengunjung yang akan dihapus, kemudian program menghapus data tersebut.
   * **Cari Data**, pengguna memasukkan ID pengunjung, kemudian program mencari dan menampilkan data yang sesuai.
   * **Keluar**, program dihentikan.
7. Setelah suatu proses selesai, program kembali menampilkan menu utama.
8. Perulangan akan terus berjalan sampai pengguna memilih menu **Keluar**.

### Gambaran Alur

**Menu Utama**

<img width="444" height="282" alt="image" src="https://github.com/user-attachments/assets/20a60514-9cd3-4212-900f-bc676876fa67" />

Tampilan menu utama merupakan halaman awal dari Sistem Manajemen Pengunjung Kolam Renang. Pada menu ini, pengguna dapat memilih proses yang ingin dilakukan dengan memasukkan nomor pilihan melalui keyboard. Terdapat beberapa pilihan, yaitu Tambah Pengunjung untuk menambahkan data baru, Tampilkan Pengunjung untuk melihat seluruh data yang tersimpan, Ubah Pengunjung untuk memperbarui data, Hapus Pengunjung untuk menghapus data, dan Cari Pengunjung untuk mencari data berdasarkan ID. Selain itu, terdapat menu Keluar yang digunakan untuk menghentikan program. Menu utama akan terus ditampilkan kembali setelah proses selesai sampai pengguna memilih menu 0. Keluar.

**Tambah Data**

<img width="517" height="556" alt="image" src="https://github.com/user-attachments/assets/76320582-44c1-4611-a970-c644c804449f" />

Pada tampilan ini, pengguna memilih menu 1. Tambah Pengunjung untuk memasukkan data pengunjung baru. Pengguna diminta mengisi beberapa informasi, yaitu ID Pengunjung, Nama Pengunjung, Umur, Jenis Kelamin, Jenis Tiket, dan Tanggal Kunjungan. Jenis tiket yang tersedia terdiri dari Biasa dan VIP. Setelah seluruh data berhasil dimasukkan, program menampilkan pesan “Data pengunjung berhasil ditambahkan” yang menunjukkan bahwa data telah berhasil disimpan ke dalam ArrayList. Setelah proses penambahan selesai, program secara otomatis kembali menampilkan menu utama sehingga pengguna dapat melanjutkan ke proses lainnya.

**Tampilkan Data**

<img width="512" height="606" alt="image" src="https://github.com/user-attachments/assets/e8decb62-a09a-48b7-bb81-9c0a065deb04" />

Pada tampilan ini, pengguna memilih menu 2. Tampilkan Pengunjung untuk melihat seluruh data pengunjung yang telah tersimpan. Program menampilkan data pengunjung secara lengkap, meliputi ID Pengunjung, Nama, Umur, Jenis Kelamin, Jenis Tiket, dan Tanggal Kunjungan. Data ditampilkan menggunakan perulangan berdasarkan data yang tersimpan di dalam ArrayList. Setelah seluruh data ditampilkan, program kembali ke menu utama sehingga pengguna dapat memilih proses berikutnya.

**Ubah Data**

<img width="458" height="881" alt="image" src="https://github.com/user-attachments/assets/cb2e0ec4-d6b2-4f10-8e57-f46da6f73fef" />

Pada tampilan ini, pengguna memilih menu 3. Ubah Pengunjung untuk memperbarui data pengunjung yang telah tersimpan. Pengguna terlebih dahulu memasukkan ID Pengunjung yang ingin diubah, kemudian memasukkan data baru berupa nama, umur, jenis kelamin, jenis tiket, dan tanggal kunjungan. Pada contoh tersebut, data pengunjung dengan ID 2 berhasil diperbarui, terlihat dari perubahan nama menjadi Alfarezaa dan jenis tiket menjadi VIP. Setelah proses selesai, program menampilkan pesan “Data berhasil diubah”. Data yang telah diperbarui kemudian dapat dilihat kembali melalui menu Tampilkan Pengunjung.

**Hapus Data**

<img width="460" height="473" alt="image" src="https://github.com/user-attachments/assets/56d9802e-5de7-4d25-85cb-06b214741efb" />

Pada tampilan ini, pengguna memilih menu 4. Hapus Pengunjung untuk menghapus data pengunjung yang telah tersimpan. Pengguna diminta memasukkan ID Pengunjung yang ingin dihapus. Pada contoh tersebut, pengguna memasukkan ID 2, kemudian program menampilkan pesan “Data berhasil dihapus” yang menunjukkan bahwa data pengunjung telah berhasil dihapus dari ArrayList. Setelah itu, pengguna memilih menu 2. Tampilkan Pengunjung untuk memastikan data telah terhapus. Karena tidak terdapat data yang tersimpan, program menampilkan pesan “Belum ada data pengunjung”.

**Cari Data**

<img width="499" height="550" alt="image" src="https://github.com/user-attachments/assets/27df4e49-11cb-4665-9016-3581870033a2" />

Pada tampilan ini, pengguna memilih menu 5. Cari Pengunjung untuk mencari data pengunjung berdasarkan ID Pengunjung. Pengguna memasukkan ID 2, kemudian program melakukan pencarian terhadap data yang tersimpan. Jika data ditemukan, program menampilkan informasi pengunjung secara lengkap, seperti ID, nama, umur, jenis kelamin, jenis tiket, dan tanggal kunjungan. Pada contoh tersebut, data dengan ID 2 berhasil ditemukan dan ditampilkan. Setelah proses pencarian selesai, program kembali menampilkan menu utama sehingga pengguna dapat melanjutkan proses lainnya.

**Keluar**

<img width="528" height="493" alt="image" src="https://github.com/user-attachments/assets/1cb8f086-340b-49ab-a7e9-80ae4c4ff7d8" />

Pada tampilan ini, pengguna memilih menu 0. Keluar untuk mengakhiri program. Program kemudian menampilkan pesan terima kasih dan program selesai dijalankan.








---

## 3. Penerapan Nilai Tambah

### 3.1 Access Modifier

Program menerapkan **access modifier** untuk mengatur tingkat akses terhadap class, atribut, dan method. Pada class `Pengunjung`, atribut seperti `idPengunjung`, `nama`, `umur`, `jenisKelamin`, `jenisTiket`, dan `tanggalKunjungan` menggunakan access modifier `private`. Sementara itu, constructor, getter, setter, dan method yang dapat digunakan dari class lain menggunakan access modifier `public`.

Contoh penerapan:

```java
private int idPengunjung;
private String nama;
private int umur;
private String jenisKelamin;
private String jenisTiket;
private String tanggalKunjungan;

public String getNama() {
    return nama;
}
```

Penggunaan access modifier private membuat atribut tidak dapat diakses secara langsung dari luar class, sehingga akses terhadap data dapat dikontrol melalui method yang disediakan.

---

### 3.2 Encapsulation

Program menerapkan **encapsulation** dengan menyembunyikan atribut yang terdapat pada class `Pengunjung` menggunakan access modifier `private`. Data tersebut kemudian dapat diakses dan diubah melalui **getter dan setter**.

Contohnya:

```java
public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

Dengan menerapkan encapsulation, data pengunjung menjadi lebih terlindungi karena class lain tidak dapat mengubah atribut secara langsung. Perubahan data dilakukan melalui method yang telah disediakan oleh class `Pengunjung`.

---

### 3.3 Validasi Input

Program juga menerapkan **validasi input** untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan. Validasi dilakukan pada class `ValidasiInput`.

Beberapa validasi yang diterapkan antara lain:

* ID pengunjung harus berupa angka dan lebih dari 0.
* Umur harus berupa angka antara 1 sampai 100 tahun.
* Nama tidak boleh kosong.
* Jenis kelamin hanya menerima pilihan `L` atau `P`.
* Jenis tiket hanya menerima pilihan **Biasa** **VIP**.
* ID pengunjung tidak boleh sama dengan ID yang sudah tersimpan.

Contoh validasi input angka:

```java
try {
    System.out.print(pesan);
    return Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input harus berupa angka!");
}
```

Validasi tersebut menggunakan `try-catch` untuk menangani kesalahan ketika pengguna memasukkan input yang bukan berupa angka. Dengan adanya validasi input, program dapat mengurangi kesalahan data dan mencegah program berhenti akibat input yang tidak sesuai.
