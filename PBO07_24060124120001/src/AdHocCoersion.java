/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : AdHocCoersion.java
 * Tanggal      : 22 April 2026
 * Deskripsi    : Praktikum 7 - Polimerfisme Ad Hoc Coersion
 */

public class AdHocCoersion {
    
    public static void main(String[] args) {

        //a. Mengilustrasikan konsep polimerfisme ad hoc coersion (integer ke char dan real)
        int nilaiAwal = 65;
        char nilaiChar = (char) nilaiAwal; // Coersion dari integer ke char
        double nilaiReal = (double) nilaiAwal; // Coersion dari integer ke real
        System.out.println("Nilai Awal (Integer): " + nilaiAwal);
        System.out.println("Nilai Setelah Coersion ke Char: " + nilaiChar);
        System.out.println("Nilai Setelah Coersion ke Real: " + nilaiReal);
        System.out.println();

        //b. Nilai integer yang diubah ke real, lalu dikembalikan ke integer di variabel berbeda
        int nilaiIntAwal = 80;
        double ubahKeReal = (double) nilaiIntAwal; // Coersion dari integer ke real
        int kembaliKeInt = (int) ubahKeReal; // Coersion dari real ke integer
        System.out.println("Nilai Awal (Integer): " + nilaiIntAwal);
        System.out.println("Nilai Setelah Coersion ke Real: " + ubahKeReal);
        System.out.println("Nilai Setelah Coersion ke Integer: " + kembaliKeInt);
        System.out.println();

        //c. Objek String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // Coersion dari String ke String (konkatenasi)
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // Penjumlahan angka X dan Y setelah diubah ke integer
        System.out.println("String S (Konkatenasi X dan Y): " + S);
        System.out.println("Integer Z (Penjumlahan X dan Y): " + Z);
        System.out.println();

        //d. Objek String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // Coersion dari String ke String (konkatenasi)
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // Penjumlahan angka P dan Q setelah diubah ke double
        System.out.println("String R (Konkatenasi P dan Q): " + R);
        System.out.println("Double D (Penjumlahan P dan Q): " + D);

        //e. Objek Integer A diisi hasil konersi nilai S, lalu ditampilkan A
        //Cattan: S bernilai "12345678" dari proses bagian c
        Integer A = Integer.parseInt(S); // Coersion dari String ke Integer
        System.out.println("Integer A (Hasil Konversi S): " + A);
        System.out.println();

        //f. Objek String T diisi hasil konversi nilai A, lalu tampilkan T
        String T = A.toString(); // Coersion dari Integer ke String
        System.out.println("String T (Hasil Konversi A): " + T);
    }
}
