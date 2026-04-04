/* Nama file : Petani.java
Deskripsi    : Berisi Atribute dan Method dalam subclass Petani 
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 11/03/2025
Last update  : 04/04/2025 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak{
    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani = 0;

    /* METHOD */
    /* KONSTRUKTOR */
    // konstruktor tanpa parameter
    public Petani(){
        this.asal_kota = null;
        counterPetani++;
    }

    // konstruktor dengan parameter
    public Petani(String Nama, LocalDate Tmk, String Alamat, double Income, String kota_asal){
        super(Nama, Tmk, Alamat, Income);
        this.asal_kota = kota_asal;
        counterPetani++;
    }


    /* SELEKTOR */
    // selektor atribut asal_kota
    public String getAsalKota(){
        return asal_kota;
    }


    /* MUTATOR */
    // mutator atribut asal_kota
    public void setAsalKota(String kota_asal){
        this.asal_kota = kota_asal;
    }


    /* METHOD LAINNYA */
    // method untuk meghitung masa kerja Pengusaha
    public int hitungMasaKerja(){
        // NIM  : 24060124120001
        int C = 0;
        long selisihTahun = ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) selisihTahun + C;
    }

    // method untuk menghitung pajak untuk Petani
    @Override
    public double hitungPajak(){
        return 0;
    }

    // method menampilkan info asal kota Petani
    @Override
    public void printKotaPetani(){
        System.out.println("Asal Kota           : " + asal_kota);
    }

    // method menghitung jumlah Petani
    public static int getCounterPetani(){
        return counterPetani;
    }
}