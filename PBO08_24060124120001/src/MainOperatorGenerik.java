/**
 * NIM          : 24060124120001
 * Nama         : Rizky Saefirdaus
 * file         : MainOperatorGenerik.java
 * Tanggal      : 6 Mei 2026
 * Keterangan   : MainOperatorGenerik, untuk menjalankan program utama
 */
public class MainOperatorGenerik {
    public static void main(String[] args) {

        // =====================
        // 1. INTEGER
        // =====================
        Datum<Integer> a = new Datum<>();
        Datum<Integer> b = new Datum<>();

        a.setIsi(3);
        b.setIsi(6);

        OperatorGenerik.tukar(a, b);

        System.out.println("Integer setelah tukar:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());

        // =====================
        // 2. STRING
        // =====================
        Datum<String> s1 = new Datum<>();
        Datum<String> s2 = new Datum<>();

        s1.setIsi("Hello");
        s2.setIsi("World");

        OperatorGenerik.tukar(s1, s2);

        System.out.println("\nString setelah tukar:");
        System.out.println("s1 = " + s1.getIsi());
        System.out.println("s2 = " + s2.getIsi());

        // =====================
        // 3. ANABUL
        // =====================
        Datum<Anabul> x = new Datum<>();
        Datum<Anabul> y = new Datum<>();

        x.setIsi(new Anggora("Milo", 3.0, "Putih"));
        y.setIsi(new KembangTelon("Tom", 4.5, 2));

        OperatorGenerik.tukar(x, y);

        System.out.println("\nAnabul setelah tukar:");
        x.getIsi().bersuara();
        y.getIsi().bersuara();

        // =====================
        // 4. BOBOT
        // =====================
        Anggora k1 = new Anggora("A", 3.0, "Hitam");
        KembangTelon k2 = new KembangTelon("B", 4.5, 2);

        double total = OperatorGenerik.bobot2(k1, k2);

        System.out.println("\nTotal bobot: " + total);
    }
}