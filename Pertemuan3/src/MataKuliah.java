/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat - NIM  : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 04/03/2026
 */

public class MataKuliah {
    /************** Atribute **************/
    private String idMatkul;
    private String namaMatkul;
    private int SKS;

    /************** Method **************/
    //Konstruktor tanpa parameter
    public MataKuliah(){

    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul,String namaMatkul,int SKS) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.SKS = SKS;
    }

    //getter untuk mendapatkan idMatkul
    public String getidMatkul() {
        return idMatkul;
    }

    //setter untuk mengubah idMatkul 
    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    //getter untuk mendapatkan nama matkul
    public String getnamaMatkul() {
        return namaMatkul;
    }

     //setter untuk mengubah nama matkul 
    public void setnamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }

    //getter untuk mendapatkan keterangan jumlah SKS
    public int getSKS() {
        return SKS;
    }

     //setter untuk mengubah SKS 
    public void setSKS( int SKS){
        this.SKS = SKS;
    }
}
