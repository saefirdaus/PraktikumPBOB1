/* Nama file : Manusia.java
Deskripsi    : Berisi Atribute dan Method dalam superclass Manusia 
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 11/03/2025
Last update  : 04/04/2025 */

import java.time.LocalDate;

public abstract class Manusia {
     /* ATRIBUT */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /* METHOD */
    // konstruktor tanpa parameter
    public Manusia(){
        this.nama = null;
        this.tgl_mulai_kerja = null;
        this.alamat = null;
        this.pendapatan = 0;
        counterMns++;
    }

    // konstruktor dengan parameter
    public Manusia(String Nama, LocalDate tmk, String Alamat, double income){
        this.nama = Nama;
        this.tgl_mulai_kerja = tmk;
        this.alamat = Alamat;
        this.pendapatan = income;
        counterMns++;
    }


    /* SELEKTOR */
    // selektor atribut nama
    public String getNama(){
        return nama;
    }

    // selektor atribut tgl_mulai_kerja
    public LocalDate getTmk(){
        return tgl_mulai_kerja;
    }

    // selektor atribut alamat
    public String getAlamat(){
        return alamat;
    }
    
    // selektor atribut pendapatan
    public double getPendapatan(){
        return pendapatan;
    }


    /* MUTATOR */
    // mutator atribut nama
    public void setNama(String Nama){
        this.nama = Nama;
    }

    // mutator atribut tgl_mulai_kerja
    public void setTmk(LocalDate Tmk){
        this.tgl_mulai_kerja = Tmk;
    }

    // mutator atribut alamat
    public void setAlamat(String Alamat){
        this.alamat = Alamat;
    }

    // mutator atribut pendapatan
    public void setPendapatan(double Income){
        this.pendapatan = Income;
    }

    /* METHOD LAINNYA */
    // method untuk menghitung masa kerja
    public abstract int hitungMasaKerja();

    // method menampilkan nip (untuk PNS) atau npwp (untuk Pengusaha)
    public void printInfoUnik(){}

    // method menampilkan nip (untuk PNS) atau npwp (untuk Pengusaha)
    public void printKotaPetani(){}

    // method menampilkan info
    public void printInfo(){
        printInfoUnik();
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal mulai kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + String.format("%.0f", pendapatan));
        printKotaPetani();
    }

    // method untuk menghitung jumlah manusia
    public static int getCounterMns(){
        return counterMns;
    }



}