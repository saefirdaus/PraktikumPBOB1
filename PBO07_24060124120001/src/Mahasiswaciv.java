/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Mahasiswaciv.java
 * Tanggal      : 29 April 2026
 * Keterangan      : Class Mahasiswaciv, Subclass dari Civitasakademika, memiliki atribut NIM dan Dosenwali, serta implementasi method abstrak getNomor() untuk mengembalikan NIM
*/

public class Mahasiswaciv extends Civitasakademika{
    String NIM;
    Dosen dosenWali;

    public Mahasiswaciv(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    // set dosen wali
    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    // tampil data mahasiswa
    void tampilDataMahasiswa() {
        System.out.println(
            NIM + " | " + nama + " | Wali: " + dosenWali.getNama()
        );
    }

    // override getNomor → NIM
    @Override
    public String getNomor() {
        return this.NIM;
    }
}