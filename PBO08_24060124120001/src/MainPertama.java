/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : MainPertama.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : MainPertama, untuk menjalankan program anabul
 */

public class MainPertama {
    public static void main(String[] args) {

        // pake Anabul
        Datum<Anabul> data = new Datum<>();

        Anggora a = new Anggora("Milo", 3.5, "Putih");

        data.setIsi(a);

        System.out.println("Isi datum:");
        data.getIsi().bersuara();
    }
}