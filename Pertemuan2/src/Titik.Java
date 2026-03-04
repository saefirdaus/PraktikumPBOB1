/* Nama File : Titik.java
 * Deskripsi  : Berisi atribut dan method dalam class Titik
 * Pembuat    : Rizky Saefirdaus - 24060124120001
 * Tanggal    : 25/02/2026
 */

public class Titik {

    /********* ATRIBUT *********/
    private double absis;      // Koordinat X
    private double ordinat;    // Koordinat Y
    private static int counterTitik = 0; // Menghitung jumlah objek Titik

    /************ KONSTRUKTOR ************/

    // Konstruktor dengan parameter
    // Membuat titik dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor default
    // Membuat titik di (0,0)
    public Titik(){
        this(0,0);
    }

    /************ METHOD ************/

    // Mengembalikan jumlah objek Titik yang sudah dibuat
    public static int getCounterTitik() {
        return counterTitik; 
    }

    // Mengembalikan nilai absis (X)
    public double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat (Y)
    public double getOrdinat(){
        return ordinat;
    }

    // Mengubah nilai absis
    public void setAbsis(double x){
        absis = x;
    }

    // Mengubah nilai ordinat
    public void setOrdinat(double y){
        ordinat = y;
    }

    // Mengembalikan kuadran titik
    // 1 = Kuadran I
    // 2 = Kuadran II
    // 3 = Kuadran III
    // 4 = Kuadran IV
    // 0 = Jika berada di sumbu
    public int getKuadran() {
        if (absis > 0 && ordinat > 0)
            return 1;
        else if (absis < 0 && ordinat > 0)
            return 2;
        else if (absis < 0 && ordinat < 0)
            return 3;
        else if (absis > 0 && ordinat < 0)
            return 4;
        else
            return 0; // berada di sumbu
    }

    // Menghitung jarak titik ke pusat (0,0)
    public double jarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    // Menghitung jarak antara dua titik
    public double getJarak(Titik t) {
        return Math.sqrt(
            (absis - t.absis) * (absis - t.absis) +
            (ordinat - t.ordinat) * (ordinat - t.ordinat)
        );
    }

    // Menggeser titik sejauh x dan y
    public void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Refleksi terhadap sumbu X (mengubah tanda Y)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi terhadap sumbu Y (mengubah tanda X)
    public void refleksiY() {
        absis = -absis;
    }

    // Menghasilkan objek baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX () {
        return new Titik(absis, -ordinat);
    }

    // Menghasilkan objek baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY () {
        return new Titik(-absis, ordinat);
    }

}// end class