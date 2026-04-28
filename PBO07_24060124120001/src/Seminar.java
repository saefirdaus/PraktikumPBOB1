/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Seminar.java
 * Tanggal      : 29 April 2026
 * Keterangan      : Class Seminar yang berisi peserta seminar, memiliki method untuk menghitung banyak peserta, registrasi peserta, menampilkan daftar peserta, dan menghitung banyak mahasiswa yang terdaftar dalam seminar
*/

public class Seminar {
    public Civitasakademika[] pesertas;
    public int banyakpeserta;

    // konstruktor
    public Seminar() {
        pesertas = new Civitasakademika[100]; // maksimal 100
        banyakpeserta = 0;
    }

    // hitung peserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // procedure untuk membuat registrasi 
    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }

    // procedure menampilkan peserta
    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " | " + pesertas[i].getNama()
            );
        }
    }

    // menghitung banyak mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswaciv) {
                count++;
            }
        }
        return count;
    }
}