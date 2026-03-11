/* Nama File    : MMahasiswa.java
 * Deskripsi    : Driver class untuk Mahasiswa
 * Pembuat - NIM  : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 04/03/2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("GTI", "Grafik dan Teknik Interaktif", 3);
        Mahasiswa M1 = new Mahasiswa("543", "Qysae", "Informatika");
        Dosen D1 = new Dosen("789", "Budi", "informatika");
        Kendaraan K1 = new Kendaraan("E1234PQR", "motor");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();

        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}