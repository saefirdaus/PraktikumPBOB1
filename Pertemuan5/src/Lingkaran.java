/* Nama File    : Lingkaran.java
 * Deskripsi    : Berisi Atribute dan Method dalam class Lingkaran 
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 26/03/2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    /* ATRIBUT */
    protected double jari;

    /* METHOD */
    // konstruktor bangun data lingkaran tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    // konstruktor bangun datar lingkaran dengan parameter
    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter / 2;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    // method selektor jari-jari lingkaran
    public double getJari(){
        return jari;
    }

    // method mutator jari-jari lingkaran
    public void setJari(double jari){
        this.jari = jari;
    }

    // method menghitung luas lingkaran
    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    // method menghitung keliling lingkaran
    public double getKeliling(){
        return Math.PI * (jari * 2);
    }

    // method untuk menampilkan info lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari); 
    }

    // method menampilkan zoomIn lingkaran
    @Override
    public void zoomIN() {
        jari = jari * 1.1;
    }

    // method menampilkan zoomOut lingkaran

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // method menampilkan zoom lingkaran
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

}