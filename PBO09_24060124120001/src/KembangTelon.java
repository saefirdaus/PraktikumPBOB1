/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : KembangTelon.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : Class KembangTelon, subclass dari Kucing dan mengimplementasikan method abstrak Bersuara()
 */

public class KembangTelon extends Kucing {
    private int umur; // atribut pembeda

    // konstruktor
    public KembangTelon(String nama, double bobot, int umur) {
        super(nama, bobot); // ambil dari Kucing
        this.umur = umur;
    }

    // getter
    public int getUmur() {
        return umur;
    }

    // override suara
    @Override
    public void bersuara() {
        System.out.println(getPanggilan() + " bersuara: meong keras (KembangTelon)");
    }

    // override gerak (opsional tapi bagus biar beda)
    @Override
    public void gerak() {
        System.out.println(getPanggilan() + " bergerak lincah (KembangTelon)");
    }
}