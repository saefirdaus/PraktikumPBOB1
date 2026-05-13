/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : Piaraan.java
 * Tanggal      : 6 Mei 2026
 * Deskripsi    : Class Piaraan, untuk mengelola antrean Anabul dengan berbagai method seperti enqueue, dequeue, isMember, dan lainnya.
*/


import java.util.*;

public class Piaraan {
    //Atribut
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    //Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<Anabul>();
        nbelm = 0;
    }

    // Mengembalikan banyak anabul dalam list
    public int getNbelm() {
        return nbelm;
    }

    //Menambahkan Anabul ke dalam list
    public void enqueueAnabul(Anabul anabul){
        Lanabul.addLast(anabul); // Menambahkan anabul ke akhir list(tail)
        nbelm = nbelm + 1;
    }

    //Mengecek apakah ada anabul dalam list 
    public boolean isMember(Anabul anabul){
        for (Anabul a : Lanabul) { // iterasi setiap anabul dalam list (foreach)
            if(a.equals(anabul)){
                return true;
            }            
        }
        return false;
    }

    //getter anabul
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    //Menghapus Anabul ke dalam list
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }

        return null;
    }

    //Menampilkan anabul yang tersimpan
    public void showAnabul() {
        for (Anabul a : Lanabul) { // iterasi setiap anabul dalam list (foreach)
            System.out.println("Nama: " + a.getPanggilan());
        }
    }

    //Menghitung Kucing 
    public int countKucing() {
        int count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    //Menghitung bobot kucing
    public int bobotKucing() {
        // Kamus lokal
        int totalBobot = 0;
        // Algoritma
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                Kucing k = (Kucing) a; // Downcasting dari Anabul ke Kucing
                totalBobot += k.getBobot(); // Menambahkan bobot kucing ke total
            }
        }
        return totalBobot;
    }


    //Menampilkan jenis anabul
    public void showJenisAnabul(){
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                System.out.println(a.getPanggilan() + " adalah Kucing");
            } else if (a instanceof Anjing) { // Jika ada subclass lain selain Kucing, bisa ditambahkan di sini
                System.out.println(a.getPanggilan() + " adalah Anjing");
            } else if (a instanceof Burung) {
                System.out.println(a.getPanggilan() + " adalah Burung");
            } else {
                System.out.println(a.getPanggilan() + " adalah jenis anabul lainnya"); // Harusnya tidak ada karena subclass hanya ada kucing anjing burung.
            }
        }
    }
}