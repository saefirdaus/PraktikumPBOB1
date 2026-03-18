/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /************** Atribute **************/
    private String nidn;
    private final int BUP = 65;

    /************** METHODE **************/
    // Konstruktor untuk membuat Dosen Tetap dengan parameter NIP, NIDN, nama, tanggal lahir, TMT bekerja, gaji pokok, dan fakultas
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok, fakultas);
        this.nidn = nidn;
    }

    // Method untuk mencetak detail Dosen Tetap
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("NIDN            : " + this.nidn);
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Tanggal Lahir   : " + this.formatTanggal(this.getTanggal_lahir()));
        System.out.println("TMT             : " + this.formatTanggal(this.getTMT_bekerja()));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + this.getFakultas());
        System.out.println("Masa Kerja      : " + getMasa_kerja().getYears() + " tahun " + getMasa_kerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + this.formatTanggal(getTanggal_pensiun(BUP)));
        System.out.println("Gaji Pokok      : " + this.formatRupiah(this.getGaji_pokok()));
        System.out.println("Tunjangan       : 2% x " + getMasa_kerja().getYears() + " x " + this.formatRupiah(this.getGaji_pokok()) + " = " + this.formatRupiah(0.02 * getMasa_kerja().getYears() * this.getGaji_pokok()));
    }
    
}