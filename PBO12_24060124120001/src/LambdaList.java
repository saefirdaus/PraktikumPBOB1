/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * File         : LambdaList.java
 * Deskripsi    : Class LambdaList, class yang menggunakan lambda expression untuk mengoperasikan list
**/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}