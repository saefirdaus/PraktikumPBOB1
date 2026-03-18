/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam superclass BangunDatar
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(5, "merah", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "biru", "hitam");
        BangunDatar  bangunan= new BangunDatar();
        
        Persegi1.printInfo();
        System.out.println("");
        Lingkaran1.printInfo();
        System.out.println("");

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi1 : " + Persegi1.getLuas());

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
        System.out.println("");

        bangunan.printCounterBD();
        
    }
}