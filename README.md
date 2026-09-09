# Tugas 1 - Kartu Parkir

## Domain

Domain yang saya gunakan dalam tugas ini adalah **Kartu Parkir**.

Kartu parkir digunakan untuk mencatat kendaraan yang masuk dan keluar dari area parkir. Pada program ini terdapat nomor kartu, jenis kendaraan, dan status kendaraan.

## Class Utama

Class utama yang digunakan adalah `KartuParkir`.

### Field

- `nomorKartu : String`
- `jenisKendaraan : String`
- `status : String`

### Method

- `KartuParkir(nomor, jenis)` digunakan untuk membuat objek kartu parkir.
- `masuk()` digunakan untuk mencatat kendaraan masuk.
- `keluar()` digunakan untuk mencatat kendaraan keluar.
- `cekStatus()` digunakan untuk menampilkan informasi kartu parkir.

## Invariant

Pada class `KartuParkir` terdapat 2 invariant, yaitu:

1. Nomor kartu tidak boleh kosong karena nomor kartu digunakan sebagai identitas kendaraan.
2. Status kartu harus mengikuti urutan yang benar, yaitu `Belum Masuk → Aktif → Selesai`.

## Cara Menjalankan

### Java

```bash
javac KartuParkir.java Main.java
java Main
```

### PHP

```bash
php index.php
```

## Deklarasi Penggunaan Ai

Sejujurnya saya menggunakan AI untuk membantu saya dalam membuat tugas PBO kali ini dikarenakan saya masih sedikit sekali dalam pemahaman Java dan PHP. AI saya gunakan untuk membantu memahami kode, mencari kesalahan pada program, dan membantu saya dalam proses pengerjaan tugas.
