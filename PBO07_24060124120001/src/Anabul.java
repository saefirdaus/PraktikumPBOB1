/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Anabul.java
 * Tanggal      : 29 April 2026
 * Deskripsi    : Class Anabul, class abstrak yang memiliki atribut Nama dan method abstrak Gerak() dan Bersuara()
*/

public class Anabul {
    /* ATRIBUT */
    public String nama;

    /* METHOD */
    // konstruktor tanpa parameter
    public Anabul() {

    }

    // konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // getter nama
    String getNama() {
        return this.nama;
    }

    // setter nama
    void setNama(String nama) {
        this.nama = nama;
    }

    // method gerak (akan dioverride)
    void gerak() {
        System.out.println("Hewan bergerak");
    }

    // method bersuara (akan dioverride)
    void bersuara() {
        System.out.println("Hewan bersuara");
    }
}