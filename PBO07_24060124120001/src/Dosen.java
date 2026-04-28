/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Dosen.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Class Dosen, Subclass dari Civitasakademika, memiliki atribut NIP, serta implementasi method abstrak getNomor() untuk mengembalikan NIP
 */

public class Dosen extends Civitasakademika{
    public String NIP;
     Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    // Getter dan Setter untuk NIP
    public String getNIP() {
        return this.NIP;
    }

    // Setter untuk NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // override getNomor → NIP
    @Override
    public String getNomor() {
        return this.NIP;
    }
}