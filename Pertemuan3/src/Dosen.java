/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat - NIM  : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 04/03/2026
 */

public class Dosen {
    /************** Atribute **************/
    private String nip;
    private String nama;
    private String prodi;

    /************** Method **************/
    //Konstruktor tanpa parameter
    public Dosen() {

    }

    //konstruktor dengan parameter
    public Dosen(String nip,String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //getter untuk mendapatkan NIP
    public String getNIP() {
        return nip;
    }

    //setter untuk mengubah NIP milik dosen
    public void setNIP(String nip) {
        this.nip = nip;
    }

    //getter untuk mendapatkan NIP
    public String getNama() {
        return nama;
    }

    //setter untuk mengubah nama dosen
    public void setNama(String nama) {
        this.nama = nama;
    }

     //setter untuk mengubah NIP milik dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //getter untuk mendapatkan NIP
    public String getProdi() {
        return prodi;
    }
}