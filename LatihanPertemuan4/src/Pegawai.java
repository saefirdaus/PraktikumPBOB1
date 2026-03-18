/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */



import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /************** Atribute **************/
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT_bekerja;
    private double gaji_pokok;

      /************** METHODE **************/
    // Konstruktor untuk membuat Pegawai tanpa parameter
    public Pegawai() {}

    // Konstruktor untuk membuat Pegawai dengan parameter NIP, nama, tanggal lahir, TMT bekerja, dan gaji pokok
    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT_bekerja = TMT_bekerja;
        this.gaji_pokok = gaji_pokok;
    }

    //  Method untuk mencetak detail pegawai
       public void printInfo() {
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggal_lahir));
        System.out.println("TMT Bekerja   : " + formatTanggal(TMT_bekerja));
        System.out.println("Gaji Pokok    : " + formatRupiah(gaji_pokok));
    }

    // Menghitung masa kerja pegawai 
    public Period getMasa_kerja() {
        return Period.between(TMT_bekerja, LocalDate.now());
    }

    // Menghitung tanggal pensiun pegawai berdasarkan masa kerja dan batas usia pensiun
    public LocalDate getTanggal_pensiun(int bup) {
        return tanggal_lahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

     // Memformat double menjadi rupiah 
    public String formatRupiah(double nominal) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(nominal);
    }

    // Memformat LocalDate menjadi format "d MMMM yyyy" dalam bahasa Indonesia (Contoh: 14 Maret 2025)
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    // Mengembalikan NIP Pegawai
    public String getNIP() {
        return NIP;
    }

    // Menset NIP Pegawai
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mengembalikan nama Pegawai
    public String getNama() {
        return nama;
    }

    // Menset nama Pegawai
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan tanggal lahir Pegawai
    public LocalDate getTanggal_lahir() {
        return tanggal_lahir;
    }

    // Menset tanggal lahir Pegawai
    public void setTanggal_lahir(LocalDate tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    // Mengembalikan TMT bekerja Pegawai
    public LocalDate getTMT_bekerja() {
        return TMT_bekerja;
    }

    // Menset TMT bekerja Pegawai
    public void setTMT_bekerja(LocalDate TMT_bekerja) {
        this.TMT_bekerja = TMT_bekerja;
    }

    // Mengembalikan gaji pokok Pegawai
    public double getGaji_pokok() {
        return gaji_pokok;
    }

    // Menset gaji pokok Pegawai
    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

}