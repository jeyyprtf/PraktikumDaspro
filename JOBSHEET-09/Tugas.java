import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        String daftarMenu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        double daftarHarga[] = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("-------- SELAMAT DATANG --------");
        System.out.println("");
        System.out.print("berapa pesanan kamu ?\nketik 0 untuk keluar : ");
        int jumlahPesanan = 0; 
        if (jumlahPesanan == 0) {
            System.out.println("Terima kasih telah berkunjung!");
            scanner.close();
            return;
        }
        int menuDipilih[] = new int[jumlahPesanan];
        int porsiDipilih[] = new int[jumlahPesanan];
        int totalBayar = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("");
            for (int q = 0; q < daftarMenu.length; q++) {
                System.out.println((q + 1) + ". " + daftarMenu[q] + " - Rp" + String.format("%.0f", daftarHarga[q]));
            }
            System.out.println("");
            System.out.print("silahkan pilih menu (1-7) \nketik 0 untuk keluar : ");
            menuDipilih[i] = (scanner.nextInt()-1);
            if (menuDipilih[i] < 0 || menuDipilih[i] >= daftarMenu.length) {
                System.out.println("Menu tidak tersedia. Silahkan pilih kembali antara 1-7.");
                i--; 
                continue;
            }
            System.out.print("pesan " + daftarMenu[menuDipilih[i]] + " berapa porsi? ");
            porsiDipilih[i] = scanner.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < jumlahPesanan; i++) {
            int indexMenu = menuDipilih[i];
            int porsi = porsiDipilih[i];
            double hargaSatuan = daftarHarga[indexMenu];
            double totalHarga = hargaSatuan * porsi;
            System.out.println("Anda memesan " + porsi + " porsi " + daftarMenu[indexMenu] + " dengan total harga Rp" + String.format("%.0f", totalHarga));
            totalBayar += totalHarga;
        }

        System.out.print("Total yang harus dibayar: Rp" + totalBayar);
        System.out.println("");
        scanner.close();
    }
}
