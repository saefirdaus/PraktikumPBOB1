/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : OperatorGenerik.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : Class dengan operasi generik (tukar & bobot2)
 */

public class OperatorGenerik {

    // prosedur generik untuk menukar isi dua Datum
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // fungsi generik untuk menjumlahkan bobot 2 objek kucing
    public static <T extends Kucing> double bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}