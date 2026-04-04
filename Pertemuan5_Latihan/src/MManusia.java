/* Nama file : MManusia.java
Deskripsi    : Driver superclass Manusia 
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 11/03/2025
Last update  : 04/04/2025 */

import java.time.LocalDate;

public class MManusia { public static void main(String[] args){
        /* OBJEK */
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja 4 Tembalang", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Timoho 26 Tembalang", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha",LocalDate.of(1997, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri"); 
        PNS p2 = new PNS("Panji" , LocalDate.of(2001, 4, 1), null, 10000000, "198004212010041002"); 


        /* APLIKASI */
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns()); 
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha()); 
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani()); 
        System.out.println("");
        
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak()); 
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak()); 
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("");
        
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja()); 
        System.out.println("");
        
        System.out.println("Info PNS p1");
        p1.printInfo(); 
        System.out.println("");

        System.out.println("Info PNS p2");
        p2.printInfo();
        System.out.println("");

        System.out.println("Info Pengusaha pe1");
        pe1.printInfo(); 
        System.out.println("");

        System.out.println("Info Petani pt1");
        pt1.printInfo();
        System.out.println("");
    }
}