/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /************** Atribute **************/
    private String nidk;
    private LocalDate tanggal_berakhir_kontrak;

    /************** METHODE **************/
    // Konstruktor tanpa parameter
      public DosenTamu() {

    }
    // Konstruktor untuk membuat Dosen Tamu dengan parameter
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas, LocalDate tanggal_berakhir_Kontrak) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok, fakultas);
        this.nidk = nidk;
        this.tanggal_berakhir_kontrak = tanggal_berakhir_Kontrak;
    }

    // Menghitung masa akhir kontrak dalam bulan
    public int hitungMasaKontrak() {
        Period p = Period.between(LocalDate.now(), tanggal_berakhir_kontrak);
        return p.getYears() * 12 + p.getMonths();
}

    // Menghitung jumlah tunjangan
    public double getTunjangan() {
        return 0.025 * getGaji_pokok();
    }

    // Method untuk mencetak detail Dosen Tamu
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("NIDK            : " + this.nidk);
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Tanggal Lahir   : " + this.formatTanggal(this.getTanggal_lahir()));
        System.out.println("TMT             : " + this.formatTanggal(this.getTMT_bekerja()));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + this.getFakultas());
        System.out.println("Masa Kerja      : " + getMasa_kerja().getYears() + " tahun " + getMasa_kerja().getMonths() + " bulan");
        System.out.println("Sisa Kontrak    : " + hitungMasaKontrak() + " bulan");
        System.out.println("Gaji Pokok      : " + this.formatRupiah(this.getGaji_pokok()));
        System.out.println("Tunjangan       : 2,5% x " + this.formatRupiah(this.getGaji_pokok()) + " = " + this.formatRupiah(0.025 * this.getGaji_pokok()));
    }
}