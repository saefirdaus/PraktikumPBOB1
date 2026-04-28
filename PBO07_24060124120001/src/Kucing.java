/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Kucing.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class Kucing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
 */

public class Kucing extends Anabul{
    /* METHOD */
    // konstruktor default
    public Kucing() {
        super();
    }

    // konstruktor dengan parameter
    public Kucing(String nama) {
        super(nama);
    }

    // override gerak
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    // override suara
    public void bersuara() {
        System.out.println(getNama() + " bersuara: meong");
    }
}