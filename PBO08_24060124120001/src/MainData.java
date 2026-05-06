/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : MainData.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : MainData, untuk menjalankan program utama
 */
public class MainData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        // isi data
        data.setIsi(0, new Anggora("Milo", 3.2, "Putih"));
        data.setIsi(1, new KembangTelon("Tom", 4.1, 2));

        // tampilkan isi
        System.out.println("Isi Data:");
        for (int i = 0; i < data.getSize(); i++) {
            data.getIsi(i).bersuara();
        }

        // jumlah elemen
        System.out.println("Jumlah elemen: " + data.getSize());
    }
}