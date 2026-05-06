/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : Data.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : Class Data, generic class untuk menyimpan data dengan tipe tertentu
 */
public class Data<T> {
    private T[] ruang;
    private int banyak;

    // konstruktor
    public Data() {
        ruang = (T[]) new Object[100]; // array generik
        banyak = 0;
    }

    // set isi di posisi tertentu
    public void setIsi(int posisi, T nilai) {
        ruang[posisi] = nilai;
        banyak++;
    }

    // ambil isi di posisi tertentu
    public T getIsi(int posisi) {
        return ruang[posisi];
    }

    // ambil jumlah elemen
    public int getSize() {
        return banyak;
    }
}