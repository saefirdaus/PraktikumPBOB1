/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Teman.java
 * Tanggal      : 6 Mei 2026
 * Deskripsi    : Class Teman, class yang memiliki atribut Nama dan method untuk mengelola daftar teman
*/


import java.util.ArrayList;

public class Teman {
    // Atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    // Mengembalikan jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Mengembalikan nama pada indeks tertentu
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // Mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // Menambah nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Menghapus nama
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // Mengecek apakah nama ada dalam list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Mengganti nama lama dengan nama baru
    public void gantiNama(String nama, String namabaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namabaru);
        }
    }

    // Menghitung jumlah kemunculan nama
    public int countNama(String nama) {
        int count = 0;
        for (String teman : Lnama) {
            if (teman.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // Menampilkan semua nama teman
    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}