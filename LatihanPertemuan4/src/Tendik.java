/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
     /************** Atribute **************/
    private String bidang; 
    private final int BUP = 55;

    /************** METHODE **************/
    // Konstruktor untuk membuat Tendik dengan parameter NIP, nama, tanggal lahir, TMT bekerja, gaji pokok, dan bidang
    public Tendik (String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String bidang) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok);
        this.bidang = bidang;
    }

    // Mengembalikan bidang tendik
    public String getBidang() {
        return bidang;
    }

    // Menset bidang tendik
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Method untuk mencetak detail Tendik
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Tanggal Lahir   : " + this.formatTanggal(this.getTanggal_lahir()));
        System.out.println("TMT             : " + this.formatTanggal(this.getTMT_bekerja()));
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + this.getBidang());
        System.out.println("Masa Kerja      : " + getMasa_kerja().getYears() + " tahun " + getMasa_kerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + this.formatTanggal(getTanggal_pensiun(BUP)));
        System.out.println("Gaji Pokok      : " + this.formatRupiah(this.getGaji_pokok()));
        System.out.println("Tunjangan       : 1% x " + getMasa_kerja().getYears() + " x " + this.formatRupiah(this.getGaji_pokok()) + " = " + this.formatRupiah(0.01 * getMasa_kerja().getYears() * this.getGaji_pokok()));
    }
}