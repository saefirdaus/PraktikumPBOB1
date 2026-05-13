public class MTeman {
    public static void main(String[] args) {
        // Membuat objek Teman
        Teman t1 = new Teman();
        // Menambahkan nama teman
        t1.addNama("Zilong");
        t1.addNama("Miya");
        t1.addNama("Lukas");
        // Menampilkan jumlah teman
        System.out.println("Jumlah teman: " + t1.getNbelm());
        // Menampilkan nama teman ke-2
        System.out.println("Teman ke-2: " + t1.getNama(1));
        // Mengubah nama teman ke-2
        t1.setNama(1, "Cici");
        // Menampilkan nama teman ke-2 setelah diubah
        System.out.println("Teman ke-2 setelah diubah: " + t1.getNama(1));
        // Mengecek apakah "Zilong" adalah teman
        System.out.println("Apakah Zilong adalah teman? " + t1.isMember("Zilong"));
        // Delete teman nama "Zilong"
        t1.delNama("Zilong");
        // Menampilkan jumlah teman setelah penghapusan
        System.out.println("Jumlah teman setelah penghapusan: " + t1.getNbelm());
        // Banyak teman bernama "Lukas"
        System.out.println("Banyak teman bernama Lukas: " + t1.countNama("Lukas"));
    }
}