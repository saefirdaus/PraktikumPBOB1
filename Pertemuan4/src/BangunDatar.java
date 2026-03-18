/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */


public class BangunDatar {
    /* ATRIBUT */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBD = 0;

    /* METHOD */
    // Konstruktor
    public BangunDatar(){
        counterBD++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBD++;
    }

    // method selektor jumlah sisi
    public int getJumlSisi(){
        return jmlSisi;
    }

    // method mutator jumlah sisi
    public void setJmlSisi(int xSisi){
        this.jmlSisi = xSisi;
    }

    // method selektor warna
    public String getWarna(){
        return warna;
    }

    // method mutator warna
    public void setWarna(String xWarna){
        this.warna = xWarna;
    }

    // method selektor border
    public String getBorder(){
        return border;
    }

    // method mutator border
    public void setBorder(String xBorder){
        this.border = xBorder;
    }

    // method menampilkan info bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBD(){
        System.out.println("Jumlah objek bangun datar: " + counterBD);
    }
}