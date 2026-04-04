/* Nama file : Asersi1.java
Deskripsi    : Progeam untuk menunjukkan asersi
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 26/03/2025
Last update  : 04/04/2025 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}