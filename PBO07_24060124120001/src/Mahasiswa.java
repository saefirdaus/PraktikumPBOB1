/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Mahasiswa.java
 * Tanggal      : 29 April 2026
 * Keterangan      : Class Mahasiswa, memiliki konstruktor tanpa dan dengan parameter, serta implementasi overload pada setProgramStudi()
*/

public class Mahasiswa {
    /* ATRIBUT */
    public String NIM;
    public String Nama;
    public String ProgramStudi;

    /* METHOD */
     // konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

     // set ProgramStudi jadi "Kosong"
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // set ProgramStudi sesuai input string
    public void setProgramStudi(String ps) {
        this.ProgramStudi = ps;
    }

    // set ProgramStudi mengikuti objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa M) {
        this.ProgramStudi = M.ProgramStudi;
    }

    // ambil nilai NIM
    public String getNIM() {
        return this.NIM;
    }

    // ambil nilai Nama
    public String getNama() {
        return this.Nama;
    }

    // ambil nilai ProgramStudi
    public String getProgramStudi() {
        return this.ProgramStudi;
    }

    // menampilkan data Mahasiswa
    public void print() {
        System.out.println(NIM + " | " + Nama + " | " + ProgramStudi);
    }
}

    