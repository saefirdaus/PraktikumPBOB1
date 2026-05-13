/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : MAnabul.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Main class untuk menguji semua class Anabul dan Piaraan
*/

public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek piaraan
        Piaraan Joko = new Piaraan();
        // Membuat objek anjing
        Anabul a1 = new Anjing("Embul");
        Anabul a2 = new Kucing("carlin", 1);
        Anabul a3 = new Burung("Rexi");
        Anabul a4 = new KembangTelon("Telon", 2, 13);
        Anabul a5 = new Anggora("caroline", 1, "Coklat");
        // Menambahkan anabul ke dalam piaraan
        Joko.enqueueAnabul(a1);
        Joko.enqueueAnabul(a2);
        Joko.enqueueAnabul(a3);
        Joko.enqueueAnabul(a4);
        Joko.enqueueAnabul(a5);
        // Menampilkan semua anabul dalam piaraan
        System.out.println("Daftar Anabul dalam Piaraan Joko:");
        Joko.showAnabul();

        // Menampilkan nama anabul beserta jenisnya
        System.out.println("\nNama Anabul beserta Jenisnya:");
        Joko.showJenisAnabul();

        // Menampilkan total bobot kucing dalam piaraan Joko
        System.out.println("\nTotal Bobot Kucing dalam Piaraan Joko:");
        System.out.println(Joko.bobotKucing());

        // Menghitung banyak kucing dalam piaraan Joko
        System.out.println("\nBanyak Kucing dalam Piaraan Joko:");
        System.out.println(Joko.countKucing());

        // Mengeluarkan anabul terakhir dari piaraan Joko
        System.out.println("\nMengeluarkan Anabul terakhir dari Piaraan Joko...");
        Joko.dequeueAnabul();

        // Menampilkan semua anabul dalam piaraan setelah pengeluaran
        System.out.println("\nDaftar Anabul dalam Piaraan Joko setelah pengeluaran:");
        Joko.showAnabul();

        // Banyak anabul tersisa dalam piaraan Joko        
        System.out.println("\nBanyak Anabul tersisa dalam Piaraan Joko:");
        System.out.println(Joko.getNbelm());

        // Menampilkan Anabul pertama dalam piaraan Joko
        System.out.println("\nAnabul pertama dalam Piaraan Joko:");
        Anabul firstAnabul = Joko.getAnabul();
        System.out.println("Nama: " + firstAnabul.getPanggilan());

        // Mengecek apakah anabul tertentu adalah anggota piaraan Joko
        System.out.println("\nMengecek apakah anabul tertentu adalah anggota Piaraan Joko:");
        Anabul anabulToCheck = new Kucing("carlina", 1);
        if (Joko.isMember(anabulToCheck)) {
            System.out.println(anabulToCheck.getPanggilan() + " adalah anggota Piaraan Joko.");
        } else {
            System.out.println(anabulToCheck.getPanggilan() + " bukan anggota Piaraan Joko.");   
        }

    }
}