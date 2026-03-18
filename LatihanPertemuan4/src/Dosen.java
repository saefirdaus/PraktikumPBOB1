/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 18/03/2026
 */

import java.time.LocalDate;


public class Dosen extends Pegawai{
     /* ATRIBUT */
    private String Fakultas;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Dosen() {
        super(); // memanggil konstruktor kosong Pegawai
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.Fakultas = fakultas;
    }

    // mutator untuk atribut Fakultas
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    // selektor untuk atribut Fakultas
    public String getFakultas(){
        return Fakultas;
    }


    /* METHOD LAINNYA */
    // method untuk menampilkan info fakultas
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + Fakultas);
    }
}