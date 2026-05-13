/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Kucing.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class Kucing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
 */


public class Kucing extends Anabul{
    /* METHOD */
    public double bobot;

    // konstruktor default
    public Kucing() {
        super();
    }

    // konstruktor dengan parameter
    public Kucing(String nama,double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // set bobot dari kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // fungsi untuk mendqapatkan bobot
    public double getBobot() {
        return bobot;
    }


    // override gerak
    public void gerak() {
        System.out.println(getPanggilan() + " bergerak dengan melata");
    }

    // override suara
    public void bersuara() {
        System.out.println(getPanggilan() + " bersuara: meong");
    }
}