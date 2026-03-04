/*Nama FIle : Titik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat : Rizky Saefirdaus
* tanggal : 25/02/2026
 */

public class MTitik {
    public static void main(String[] args){

        // ===============================
        // Membuat objek titik default
        // ===============================
        Titik t1 = new Titik();
        System.out.println("Titik awal:");
        t1.printTitik();

        // ===============================
        // Mengubah absis dan ordinat
        // ===============================
        t1.setAbsis(3.0);
        t1.setOrdinat(4.0);
        System.out.println("\nSetelah setAbsis & setOrdinat:");
        t1.printTitik();

        // ===============================
        // Menguji kuadran
        // ===============================
        System.out.println("Kuadran: " + t1.getKuadran());

        // ===============================
        // Menghitung jarak ke pusat
        // ===============================
        System.out.println("Jarak ke pusat: " + t1.jarakPusat());

        // ===============================
        // Menggeser titik
        // ===============================
        t1.geser(1.0, 2.0);
        System.out.println("\nSetelah digeser (1,2):");
        t1.printTitik();

        // ===============================
        // Refleksi Y
        // ===============================
        t1.refleksiY();
        System.out.println("\nSetelah refleksi terhadap sumbu Y:");
        t1.printTitik();

        // ===============================
        // Membuat titik kedua
        // ===============================
        Titik t2 = new Titik(0,0);
        System.out.println("\nTitik kedua:");
        t2.printTitik();

        // ===============================
        // Menghitung jarak antar titik
        // ===============================
        System.out.println("Jarak t1 ke t2: " + t1.getJarak(t2));

        // ===============================
        // Menggunakan getter
        // ===============================
        System.out.println("\nAbsis t1: " + t1.getAbsis());
        System.out.println("Ordinat t1: " + t1.getOrdinat());

        // ===============================
        // Menguji refleksi versi return object
        // ===============================
        Titik t3 = t1.getRefleksiX();
        System.out.println("\nHasil getRefleksiX (objek baru):");
        t3.printTitik();

        // ===============================
        // Mengecek jumlah objek
        // ===============================
        System.out.println("\nJumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
    }
}