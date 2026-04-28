/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Anjing.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class Anjing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
 */

public class Anjing extends Anabul{
    /* METHOD */
    // konstruktor tanpa parameter
    public Anjing() {
        super();
    }

    // konstruktor dengan parameter
    public Anjing(String nama) {
        super(nama);
    }

    // override gerak
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    // override suara
    public void bersuara() {
        System.out.println(getNama() + " bersuara: guk-guk");
    }
}