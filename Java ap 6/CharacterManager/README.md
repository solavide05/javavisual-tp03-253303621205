
# Character Manager — TP5 AP6

## Identitas Mahasiswa

- **Nama:** Sola Vide Br Surbakti
- **NIM:** 253303621205
- **Program Studi:** Sistem Informasi
- **Mata Kuliah:** Algoritma dan Pemrograman

## Deskripsi Proyek

Character Manager adalah program Java sederhana untuk mengelola data karakter. Program ini menerapkan konsep Object-Oriented Programming (OOP), seperti class, object, encapsulation, enum, static, reference, dan method overriding.

## Struktur Folder

```text
CharacterManager/
├── Character.java
├── CharacterManager.java
├── CharacterType.java
├── Main.java
├── README.md
└── screenshots/
    ├── output-crud.png
    ├── output-analitik.png
    └── output-reference.png
```

## Fitur Program

- Menambahkan karakter baru.
- Menolak karakter dengan nama duplikat.
- Mencari karakter berdasarkan nama.
- Menghapus karakter berdasarkan nama.
- Menghitung jumlah karakter.
- Menghitung rata-rata level karakter.
- Mencari karakter berdasarkan tipe.
- Menentukan karakter dengan level tertinggi.
- Menghitung jumlah objek Character yang dibuat menggunakan `static`.
- Menguji perbedaan reference, operator `==`, dan metode `equals()`.
- Mengembalikan salinan daftar karakter agar struktur daftar internal tidak dapat diubah langsung dari luar kelas.

## Bagian A — Implementasi Class

### 1. CharacterType.java

Menggunakan `enum` untuk menentukan tipe karakter, yaitu WARRIOR, MAGE, ARCHER, dan HEALER.

### 2. Character.java

Menyimpan data karakter berupa nama, level, dan tipe. Class ini menggunakan encapsulation, getter, setter, atribut static, serta override metode `equals()`, `hashCode()`, dan `toString()`.

### 3. CharacterManager.java

Mengelola daftar karakter dengan fitur tambah, cari, hapus, hitung jumlah, hitung rata-rata level, cari berdasarkan tipe, dan cari karakter terkuat.

### 4. Main.java

Digunakan untuk menjalankan dan menguji fitur Character Manager, termasuk pengujian CRUD, analitik karakter, dan eksperimen reference.

## Bagian B — Bukti Hasil Program

### 1. Output CRUD

Screenshot berikut menunjukkan proses penambahan, pencarian, dan penghapusan karakter.

![Output CRUD](screenshots/output-crud.png)

### 2. Output Analitik

Screenshot berikut menunjukkan hasil perhitungan rata-rata level, pencarian berdasarkan tipe, dan karakter dengan level tertinggi.

![Output Analitik](screenshots/output-analitik.png)

### 3. Output Eksperimen Reference

Screenshot berikut menunjukkan perbedaan reference, operator `==`, metode `equals()`, serta pengujian salinan daftar karakter.

![Output Reference](screenshots/output-reference.png)

## Bagian C — Analisis findStrongest()

Metode `findStrongest()` digunakan untuk mencari karakter dengan level tertinggi dalam daftar.

Jika daftar kosong, metode mengembalikan `null`. Jika terdapat karakter, metode memeriksa level setiap karakter dan menyimpan karakter dengan level tertinggi.

Kompleksitas waktu metode ini adalah O(n), karena setiap karakter diperiksa paling banyak satu kali. Kompleksitas ruang tambahannya adalah O(1), karena metode hanya menggunakan beberapa variabel tambahan.

## Eksperimen Reference

Eksperimen reference menunjukkan bahwa dua variabel dapat menunjuk ke objek yang sama. Jika atribut objek diubah melalui salah satu variabel, perubahan tersebut terlihat melalui variabel lainnya.

Operator `==` membandingkan identitas referensi, sedangkan `equals()` membandingkan objek berdasarkan aturan yang ditentukan dalam class Character, yaitu kesamaan nama tanpa membedakan huruf besar dan kecil.

## Penggunaan Static

Atribut `totalCharacterCreated` menggunakan `static` agar penghitung objek Character dimiliki bersama oleh seluruh objek. Nilainya bertambah ketika konstruktor Character dipanggil. Penghitung ini menunjukkan jumlah objek yang dibuat, bukan jumlah karakter yang masih tersimpan di dalam CharacterManager.

## Keamanan Pengembalian ArrayList

Metode `getAllCharacters()` mengembalikan salinan daftar menggunakan `new ArrayList<>(characters)`. Cara ini melindungi struktur daftar internal dari penambahan atau penghapusan elemen melalui daftar yang dikembalikan.

Namun, salinan tersebut merupakan shallow copy. Objek Character di dalam daftar masih menggunakan referensi yang sama sehingga perubahan atribut objek tetap dapat terlihat pada daftar asli.

## Link Laporan Google Docs

**Laporan eksperimen TP5:** [Tempelkan link Google Docs kamu di sini]

## Kesimpulan

Melalui proyek Character Manager, saya mempelajari penerapan OOP dalam Java, pengelolaan objek menggunakan ArrayList, penggunaan enum dan static, perbedaan reference dan primitive, serta perbandingan objek menggunakan `==` dan `equals()`. Saya juga memahami pentingnya enkapsulasi dalam menjaga struktur data internal suatu class.

[https://docs.google.com/document/d/1F_yNdZ73EibiEnMvNLSWqCdbgKjYX4bu/edit?usp=sharing&ouid=117036741043359602852&rtpof=true&sd=true]
