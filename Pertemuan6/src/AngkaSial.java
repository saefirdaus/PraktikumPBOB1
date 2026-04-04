/* Nama file : AngkaSial.java
Deskripsi    : Berisi Atribute dan Method dalam class AngkaSial  
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 26/03/2025
Last update  : 04/04/2025 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
    Jawaban :

    line 12 tidak dieksekusi karena masuk ke if condition angka==13
    line 20 tidak dieksekusi karena terjadi exception pada 19
    line 21 tereksekusi karena menangkap exception yang terjadi pada line 19

    Note :
    line 12 = line 15 pada file Asersi2.java
    line 20 = line 24 pada file Asersi2.java
    line 21 = line 25 pada file Asersi2.java

*/