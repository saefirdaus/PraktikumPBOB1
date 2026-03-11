/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat - NIM  : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 04/03/2026
 */

public class Kendaraan {
    /************** Atribute **************/
    private String noPlat;
    private String jenis;

    /************** Atribute **************/
    //Konstruktor tanpa parameter
    public Kendaraan() {

    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //getter untuk mendapatkan noPlat
    public String getnoPlat() {
        return noPlat;
    }

    //setter untuk mengubah noPlat 
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //getter untuk mendapatkan NIP
    public String getjenis() {
        return jenis;
    }

     //setter untuk mengubah jenis kendaraan 
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}