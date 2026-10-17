# Character Manager — TP3

## 1. Deskripsi Project

Character Manager adalah program berbasis Java yang dibuat untuk mengelola karakter dalam sebuah permainan. Program ini menerapkan konsep Object-Oriented Programming (OOP), seperti encapsulation, constructor, enum, getter, dan setter.

Program memiliki fitur untuk membuat karakter, menentukan tipe karakter, mengatur level, memperbarui statistik karakter, mengatur mana, serta memeriksa status hidup karakter menggunakan method `isAlive()`.

## 2. Fitur Program

- Membuat karakter dengan nama dan tipe karakter.
- Menggunakan enum `CharacterType` untuk menentukan tipe karakter.
- Mengatur level karakter.
- Memperbarui HP dan attack berdasarkan level.
- Mengatur nilai mana.
- Memvalidasi agar nilai tertentu tidak negatif.
- Memeriksa status hidup karakter menggunakan `isAlive()`.

## 3. Konsep OOP yang Digunakan

### Encapsulation

Encapsulation diterapkan dengan membuat atribut karakter menggunakan access modifier `private`. Atribut dapat diakses atau diubah melalui getter dan setter sehingga pengelolaan data lebih terkontrol.

### Constructor

Constructor digunakan untuk memberikan nilai awal ketika objek karakter dibuat. Dengan constructor, setiap objek dapat memiliki nama, tipe, dan level sesuai kebutuhan.

### Enum

Enum `CharacterType` digunakan untuk menentukan tipe karakter yang tersedia, seperti WARRIOR, MAGE, ARCHER, dan HEALER.

### Method

Method digunakan untuk menjalankan fungsi tertentu, seperti memperbarui statistik karakter, mengatur level, mengatur mana, dan memeriksa status hidup karakter.

## 4. Struktur Folder Project

```text
CHARACTERMANAGER/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
├── screenshots/
│   └── output.png
└── README.md
```

## 5. Screenshot Output Program

Screenshot berikut menunjukkan hasil program Character Manager yang dijalankan melalui terminal VS Code.

![Screenshot Output Character Manager](screenshots/output.png)

## 6. Identitas Mahasiswa

- Nama: Sola Vide Br Surbakti
- NIM: 253303621205
- Program Studi: Sistem Informasi
- Mata Kuliah: Java Visual SIH-6406
- Tugas: TP3 — Character Manager Sprint #1

## 7. Link Google Docs

Dokumen analisis desain dan ekosistem Java:

[https://docs.google.com/document/d/1yKr4DEhSc2AVcEmfSNPoypFGA7zri3fd/edit?usp=sharing&ouid=117036741043359602852&rtpof=true&sd=true]
