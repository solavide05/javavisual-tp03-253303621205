# Character Manager Sprint #3 - TP8 AP10

## Identitas Mahasiswa

- Nama: Sola Vide Br Surbakti
- NIM: 253303621205
- Program Studi: Sistem Informasi

## Deskripsi Proyek

Character Manager adalah aplikasi berbasis Java untuk menampilkan daftar karakter melalui antarmuka grafis menggunakan Java Swing.

## Struktur Proyek

- `src/Main.java`
- `src/model/Character.java`
- `src/model/CharacterType.java`
- `src/model/CharacterManager.java`
- `src/view/MainWindow.java`

## Fitur

- Menampilkan daftar karakter.
- Menampilkan nama, tipe, dan level karakter.
- Menghitung total karakter.
- Menghitung rata-rata level.
- Mencegah penambahan karakter dengan nama yang sama.

## Penjelasan Kelas

- **Character:** menyimpan nama, tipe, dan level karakter.
- **CharacterType:** menentukan tipe karakter.
- **CharacterManager:** mengelola daftar karakter, pencarian, penghapusan, dan statistik.
- **MainWindow:** menampilkan daftar karakter menggunakan GUI.
- **Main:** menjalankan aplikasi.

## Konsep OOP dan MVC

Program menerapkan encapsulation melalui atribut `private` dan metode getter/setter. Metode `equals()` digunakan untuk membandingkan nama karakter tanpa membedakan huruf besar dan kecil.

Struktur program memisahkan model yang mengelola data dari view yang menampilkan data kepada pengguna.

## Data Pengujian

- Archer: level 5
- Mage: level 8
- Warrior: level 10
- Healer: level 4
- Paladin: level 7

**Total karakter:** 5

**Rata-rata level:** 6.80

## Cara Menjalankan

1. Buka folder proyek `CharacterManager` di VS Code.
2. Buka file `src/Main.java`.
3. Klik **Run Java**.

## Kesimpulan

Aplikasi ini menerapkan konsep OOP dan pemisahan model-view untuk mengelola serta menampilkan data karakter melalui antarmuka grafis.

## Google doc

[Klik di sini untuk membuka google doc](https://docs.google.com/document/d/12svZlrJLjiPhVqVhPWoQqSwD1xLNCIHi86BsXXZtO1c/edit?usp=sharing)
