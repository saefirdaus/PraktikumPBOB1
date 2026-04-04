/* Nama file : AngkaSialException.java
Deskripsi    : Exception untuk angka sial
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 26/03/2025
Last update  : 04/04/2025 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}