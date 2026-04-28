/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : MAnabul.java
 * Tanggal      : 29 April 2026
 * Keterangan   : Main Driver untuk implementasi abstract class Anabul dan subclassnya
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing("starla"),
            new Anjing("browny"),
            new Burung("crunch")
        };

        for (Anabul a : hewan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }

    }
}