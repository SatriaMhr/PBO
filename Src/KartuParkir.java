public class KartuParkir {
    String nomorKartu;
    String jenisKendaraan;
    String status;

    public KartuParkir(String nomor, String jenis) {
        if (nomor.isEmpty())
            throw new IllegalArgumentException("Nomor kartu kosong!");

        nomorKartu = nomor;
        jenisKendaraan = jenis;
        status = "Belum Masuk";
    }

    public void masuk() {
        if (status.equals("Aktif"))
            throw new IllegalArgumentException("Kartu sudah digunakan!");

        if (status.equals("Selesai"))
            throw new IllegalArgumentException("Kartu sudah selesai digunakan!");

        status = "Aktif";
        System.out.println("Kendaraan berhasil masuk.");
    }

    public void keluar() {
        if (!status.equals("Aktif"))
            throw new IllegalArgumentException("Kendaraan belum berada di area parkir!");

        status = "Selesai";
        System.out.println("Kendaraan berhasil keluar.");
    }

    public void cekStatus() {
        System.out.println("Nomor Kartu : " + nomorKartu);
        System.out.println("Kendaraan   : " + jenisKendaraan);
        System.out.println("Status      : " + status);
    }
}