/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : Burung.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class Burung, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
 */

public class Burung extends Anabul {
    /* METHOD */
     // konstruktor tanpa parameter
    public Burung() {

    }

    // konstruktor dengan parameter
    public Burung(String nama) {
        super(nama);
    }

    // override gerak
    public void gerak() {
        System.out.println(getPanggilan() + " bergerak dengan terbang");
    }

    // override suara
    public void bersuara() {
        System.out.println(getPanggilan() + " bersuara: ciut");
    }
}