/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : Anggora.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : Class Anggora, subclass dari Kucing dan mengimplementasikan method abstrak Bersuara()
 */

public class Anggora extends Kucing {
    /* ATRIBUT */
    private String warnaBulu;

    public Anggora(String nama, double bobot, String warnaBulu) {
        super(nama, bobot);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    @Override
    public void bersuara() {
        System.out.println(getPanggilan() + " bersuara: meong lembut (Anggora)");
    }
}