/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : MCivitasakademika.java
 * Tanggal      : 29 April 2026
*  Keterangan      : Main Driver untuk implementasi abstract class Civitasakademika, subclass Dosen dan Mahasiswaciv, serta kelas Seminar
*/

public class MCivitasakademika {
     public static void main(String[] args) {

        // e. 2 dosen
        Dosen d1 = new Dosen("Pak Yono", "D001");
        Dosen d2 = new Dosen("Bu Sri", "D002");

        // e. 5 mahasiswa
        Mahasiswaciv m1 = new Mahasiswaciv("Angga", "M001", d1);
        Mahasiswaciv m2 = new Mahasiswaciv("Budi", "M002", d1);
        Mahasiswaciv m3 = new Mahasiswaciv("Clara", "M003", d2);
        Mahasiswaciv m4 = new Mahasiswaciv("Dewi", "M004", d2);
        Mahasiswaciv m5 = new Mahasiswaciv("Erlangga", "M005", d1);

        // b. buat seminar
        Seminar s = new Seminar();

        // f. registrasi semua
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. jumlah peserta
        System.out.println("Total peserta: " + s.countPeserta());

        // g. tampil peserta
        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // i. ubah dosen wali
        m1.setWali(d2);

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}