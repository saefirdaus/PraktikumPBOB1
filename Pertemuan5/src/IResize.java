/* Nama File    : IResize.java
 * Deskripsi    : Berisi Method dalam interface IResize 
 * Pembuat      : Rizky Saefirdaus - 24060124120001
 * Tanggal      : 26/03/2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIN();
    
    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menakalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}