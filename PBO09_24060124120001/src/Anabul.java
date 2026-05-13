/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Anabul.java
 * Tanggal      : 29 April 2026
 * Deskripsi    : Class Anabul, class abstrak yang memiliki atribut Nama dan method abstrak Gerak() dan Bersuara()
*/

public class Anabul {
    /* ATRIBUT */
    public String panggilan;

    /* METHOD */
    // konstruktor tanpa parameter
    public Anabul() {

    }

    // konstruktor dengan parameter
    public Anabul(String panggilan){
        this.panggilan = panggilan;
    }

    // getter panggilan
    public String getPanggilan() {
        return this.panggilan;
    }

    // setter panggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // method gerak (akan dioverride)
    public void gerak() {
        System.out.println("Hewan bergerak");
    }

    // method bersuara (akan dioverride)
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
}