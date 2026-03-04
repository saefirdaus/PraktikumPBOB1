/*
Nama file    : MGaris.java
Deskripsi    : Driver class Garis
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 25/02/2026
*/

public class MGaris {
    public static void main(String[] args) {

        // Membuat objek Garis menggunakan konstruktor default
        Garis G1 = new Garis(); 

        // Menampilkan koordinat garis G1
        System.out.println("\nGaris G1 dibuat dengan koordinat: ");
        G1.printGaris();

        // Menampilkan jumlah objek Garis yang sudah dibuat
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());

        // Membuat dua titik untuk membentuk garis baru
        Titik tA = new Titik(1, 2);
        Titik tB = new Titik(5, 6);

        // Membuat garis G2 menggunakan dua titik di atas
        Garis G2 = new Garis(tA, tB);

        // Menampilkan informasi garis G2
        System.out.println("\nGaris G2 dibuat dengan koordinat:");
        G2.printGaris();
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());

        // Menghitung dan menampilkan panjang garis G2
        System.out.println("Panjang G2: " + G2.getPanjang());

        // Menghitung dan menampilkan gradien garis G2
        System.out.println("Gradien G2: " + G2.getGradien());

        // Mengambil titik tengah dari garis G2
        Titik tTengah = G2.getTitikTengah();
        System.out.println("Titik tengah G2: ");
        tTengah.printTitik();

        // Menampilkan persamaan garis G2
        System.out.print("Persamaan garis G2: ");
        G2.printPersamaanGaris();

        // Membuat garis G3 untuk pengujian sejajar/tegak lurus
        Titik tC = new Titik(2, 4);
        Titik tD = new Titik(6, 8);
        Garis G3 = new Garis(tC, tD);

        System.out.println("\nGaris G3 dibuat dengan koordinat:");
        G3.printGaris();

        // Mengecek apakah G2 dan G3 sejajar
        System.out.println("G2 dan G3 sejajar: " + G2.isSejajar(G3));

        // Mengecek apakah G2 dan G3 tegak lurus
        System.out.println("G2 dan G3 tegak lurus: " + G2.isTegakLurus(G3));

        // Membuat garis vertikal (absis sama)
        Titik tE = new Titik(3, 0);
        Titik tF = new Titik(3, 6);
        Garis G4 = new Garis(tE, tF);

        System.out.println("\nGaris G4 dibuat dengan koordinat:");
        G4.printGaris();

        // Membuat garis horizontal (ordinat sama)
        Titik tG = new Titik(0, 2);
        Titik tH = new Titik(7, 2);
        Garis G5 = new Garis(tG, tH);

        System.out.println("\nGaris G5 dibuat dengan koordinat:");
        G5.printGaris();

        // Mengecek hubungan antara garis vertikal dan horizontal
        System.out.println("G4 dan G5 sejajar: " + G4.isSejajar(G5));
        System.out.println("G4 dan G5 tegak lurus: " + G4.isTegakLurus(G5));

        // Menampilkan persamaan garis vertikal dan horizontal
        System.out.print("\nPersamaan garis G4: ");
        G4.printPersamaanGaris();
        System.out.print("Persamaan garis G5: ");
        G5.printPersamaanGaris();

        // Menampilkan total objek Garis yang sudah dibuat
        System.out.println("\nJumlah objek Garis: " + Garis.getCounterGaris());
    }
}