public class Main {
    public static void main(String[] args) {

        KartuParkir motor = new KartuParkir("KP001", "Motor");
        KartuParkir mobil = new KartuParkir("KP002", "Mobil");

        // OPERASI SAH
        System.out.println("----> Kendaraan <----");

        motor.cekStatus();
        motor.masuk();

        mobil.cekStatus();
        mobil.masuk();

        // OPERASI TIDAK SAH
        motor.masuk();
        mobil.masuk();
    }
}