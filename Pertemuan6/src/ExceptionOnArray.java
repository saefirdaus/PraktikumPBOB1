/* Nama file : ExceptionOnArray.java
Deskripsi    : Program untuk menunjukkan exception pada array
Pembuat      : Rizky Saefirdaus - 24060124120001
Tanggal      : 26/03/2025
Last update  : 04/04/2025 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}