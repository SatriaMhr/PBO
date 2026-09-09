<?php
class KartuParkir {
    private string $nomor;
    private string $jenis;
    private string $status;

    public function __construct($nomor, $jenis) {
        if (empty($nomor))
            throw new InvalidArgumentException("Nomor kartu kosong!");
        $this->nomor = $nomor;
        $this->jenis = $jenis;
        $this->status = "Belum Masuk";
    }

    public function masuk() {
        if ($this->status != "Belum Masuk")
            throw new InvalidArgumentException("Kendaraan sudah masuk!");
        $this->status = "Aktif";
        echo "Kendaraan berhasil masuk.\n";
    }

    public function keluar() {
        if ($this->status != "Aktif")
            throw new InvalidArgumentException("Kendaraan belum masuk!");
        $this->status = "Selesai";
        echo "Kendaraan berhasil keluar.\n";
    }

    public function cekStatus() {
        echo "Kartu: $this->nomor\nKendaraan: $this->jenis\nStatus: $this->status\n";
    }
}