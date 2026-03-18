/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam subclass BangunDatar
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */

public class Persegi extends BangunDatar{
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
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4); 
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


}