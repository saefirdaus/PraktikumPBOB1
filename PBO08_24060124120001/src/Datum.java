/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : Datum.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : Class Datum, generic class untuk menyimpan data dengan tipe tertentu
 */


public class Datum<T> {
    private T isi;

    // getter
    public T getIsi() {
        return isi;
    }

    // setter
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}