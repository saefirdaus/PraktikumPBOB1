/* Nama file : Asersi2.java
Deskripsi    : Progeam untuk menunjukkan asersi
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 26/03/2025
Last update  : 04/04/2025 */
// Class lingkaran
class Lingkaran {
    private double jariJari;

    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung Keliling lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0; // Contoh input jari-jari

        // Asersi untuk memastikan jari-jari tidak nol
        assert (jariJari > 0) : "Jari-jari tidak boleh nol";

        Lingkaran lingkaran = new Lingkaran(jariJari);
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
    }
}

/*
Jawaban : 

    Meskipun asersi tidak aktif karena tidak berada di dalam konstruktor kelaas Lingkaran , dapat berkemungkinan program akan tetap berjalan meskipun jari-jari yang diberikan 
    adalah nol.

*/