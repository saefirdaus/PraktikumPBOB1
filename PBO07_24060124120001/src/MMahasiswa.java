/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : MMahasiswa.java
 * Tanggal      : 29 April 2026
 * Keterangan      : Main Driver untuk implementasi class Mahasiswa
*/

public class MMahasiswa {
     public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("987", "Sae", "Informatika");

        System.out.println(m1.getNIM());
        System.out.println(m1.getNama());
        System.out.println(m1.getProgramStudi());

        // tetap bisa pakai setter
        m1.setProgramStudi("Teknik Komputer");
        System.out.println(m1.getProgramStudi());
    }
}