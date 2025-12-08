import java.util.Scanner;

public class Kafe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();
        System.out.print("Apakah pelanggan adalah member? (true/false): ");
        boolean isMember = input.nextBoolean();
        System.out.print("Masukkan kode promo (DISKON50/DISKON30): ");
        String kodePromo = input.next();
        System.out.println(kodePromo);

        System.out.println("");

        Menu(namaPelanggan, isMember, kodePromo);
        System.out.print("Masukkan pilihan menu (1-6): ");
        int pilihanMenu = input.nextInt();
        System.out.print("Masukkan banyak item: ");
        int banyakItem = input.nextInt();

        int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga: Rp " + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat kamu dapat diskon sebesar 50% !");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat kamu dapat diskon sebesar 30% !");
        } else {
            System.out.println("Maaf, kode promo tidak valid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga11(int pilihanMenu, int banyakItem, String kodePromo) {
        int hargaItems[] = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            totalHarga *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga *= 0.7;
        }
        return totalHarga;
    }
}