/* Nama File    : Persegi.java
 * Deskripsi    : Berisi Atribute dan Method dalam class Persegi
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 26/03/2026
 */

public class Persegi extends BangunDatar implements IResize{
    /* ATRIBUT */
    protected double sisi;

    /* METHOD */
    // konstruktor bangun datar persegi dengan jumlah sisi 4
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor bangun datar persegi dengan parameter
    public Persegi(double xSisi, String warna, String border){
        super(4, warna, border);
        if(xSisi == 4){
            this.sisi = xSisi;
        }
    }

    // method selektor sisi persegi
    public double getSisi(){
        return sisi;
    }

    // method mutator sisi persegi
    public void setSisi(double xSisi){
        this.sisi = xSisi;
    }

    // method untuk menghitung luas persegi
    public double getLuas(){
        return sisi * sisi;
    }

    // method untuk menghitung keliling persegi
    public double getKeliling(){
        return sisi * 4;
    }

    // method untuk menghitung diagonal persegi
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    // method menampilkan info persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // method menampilkan zoomIn persegi
    @Override
    public void zoomIN() {
        sisi = sisi * 1.1;
    }

    // method menampilkan zoomOut persegi
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // method menampilkan zoom persegi
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }




}