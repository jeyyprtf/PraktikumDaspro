public class PengunjungCafe11 {
    public static void main(String[] args) {
        // daftarPengunjung("Ali","Budi","Citra");
        // daftarPengunjung("Andi");
        // daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();
    }

    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Pengunjung Cafe:");
        int i = 1;
        for (String nama : namaPengunjung) {
            System.out.println((i++) + "- " + nama);
        }
    }
}
