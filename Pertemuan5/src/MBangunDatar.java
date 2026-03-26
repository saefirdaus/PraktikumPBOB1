/* Nama File    : MBangunDatar.java
 * Deskripsi    : Driver class BangunDatar
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 26/03/2026
 */

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        BangunDatar  bangunan= new BangunDatar();
        
        Persegi1.printInfo();
        System.out.println("");
        Lingkaran1.printInfo();
        System.out.println("");

        // keliling dan luas persegi
        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi1 : " + Persegi1.getLuas());

        //keliling dan luas lingkaran
        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
        System.out.println("");

        // uji interface persegi
        Persegi1.zoomIN(); // +10%
        System.out.println("Persegi1 setelah zoomIn: " + Persegi1.getLuas());

        Persegi1.zoomOut(); // -10%
        System.out.println("Persegi1 setelah zoomOut: " + Persegi1.getLuas());

        // zoom custom
        Persegi1.zoom(50); // +50%
        System.out.println("Persegi1 setelah zoom 50%: " + Persegi1.getLuas());

        // uji interface lingkaran
        Lingkaran1.zoomIN(); // +10%
        System.out.println("Lingkaran1 setelah zoomIn: " + Lingkaran1.getLuas());

        Lingkaran1.zoomOut(); // -10%
        System.out.println("Lingkaran1 setelah zoomOut: " + Lingkaran1.getLuas());

        // zoom custom
        Lingkaran1.zoom(50); // +50%
        System.out.println("Lingkaran1 setelah zoom 50%: " + Lingkaran1.getLuas());

        bangunan.printCounterBD();
        
    }
}