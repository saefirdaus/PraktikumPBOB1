/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Civitasakademika.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class abstract Civitasakademika yang memiliki atribut Nama, method abstrak getNomor() untuk mendapatkan nomor identitas (NIM/NIP)
 */

public class Civitasakademika {
     /* ATRIBUT */
    public String nama;

    /* METHOD */
    //konstruktor tanpa parameter
    public Civitasakademika() {
    
    }

    //konstruktor dengan parameter
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // getter nama
    public String getNama() {
        return this.nama;
    }

    // method yang akan dioverride
    public String getNomor() {
        return "-";
    }
    
}