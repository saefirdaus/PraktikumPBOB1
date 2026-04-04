/* Nama file : Pengusaha.java
Deskripsi    : Berisi Atribute dan Method dalam subclass Pengusaha 
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 11/03/2025
Last update  : 04/04/2025 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha = 0;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public Pengusaha(){
        this.npwp = null;
        counterPengusaha++;
    }

    // konstruktor dengan parameter
    public Pengusaha(String Nama, LocalDate Tmk, String Alamat, double Income, String NPWP){
        super(Nama, Tmk, Alamat, Income);
        this.npwp = NPWP;
        counterPengusaha++;
    }


    /* SELEKTOR */
    // selektor atribut npwp
    public String getNPWP(){
        return npwp;
    }


    /* MUTATOR */
    // mutator atribut npwp
    public void setNPWP(String NPWP){
        this.npwp = NPWP;
    }


    /* METHOD LAINNYA */
    // method untuk meghitung masa kerja Pengusaha
    public int hitungMasaKerja(){
        // NIM  : 24060124120001
        int B = 0;
        long selisihTahun = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) selisihTahun + B;
    }

    // method untuk menghitung pajak untuk Pengusaha
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    // menampilkan info nip PNS
    @Override
    public void printInfoUnik(){
        System.out.println("NPWP                : " + npwp);
    }

    // method untuk menghitung jumlah Pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }


}