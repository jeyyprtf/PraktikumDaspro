import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double hargaTiket = 50000;
        double diskon1 = 0.9;
        double diskon2 = 0.85;
        double totalHarga = 0;
        double omset = 0;
        int tiketTerjual = 0;
        boolean isRun = true;

        System.out.println("Selamat datang");
        do {
            for (int i = 1; true; i++) {
                System.out.print("Pelanggan ke-" + i + " membeli berapa tiket?\n\nketik -99 untuk menutup transaksi : ");
                int jumlahTiketPerPelanggan = sc.nextInt();
               
                
                if (jumlahTiketPerPelanggan == -99) {
                    isRun = false;
                    break;
                } else if (jumlahTiketPerPelanggan < 0 && jumlahTiketPerPelanggan != -99) {
                    System.out.println("jumlah tidak valid, masukkan angka positif.");
                    i--;
                    continue;
                } else if (jumlahTiketPerPelanggan >= 4 && jumlahTiketPerPelanggan < 10) {
                    totalHarga = jumlahTiketPerPelanggan * hargaTiket * diskon1;
                } else if (jumlahTiketPerPelanggan >= 10) {
                    totalHarga = jumlahTiketPerPelanggan * hargaTiket * diskon2;
                } else {
                    totalHarga = jumlahTiketPerPelanggan * hargaTiket;
                }

                tiketTerjual += jumlahTiketPerPelanggan;
                omset += totalHarga;
                System.out.println("Total omset sementara yang didapat : " + omset);
                System.out.println("Total tiket terjual sementara sebanyak " + tiketTerjual + " tiket");
                System.out.println("");
                System.out.println("---------------------------------------------------------");
            }
        } while (isRun);
        System.out.println("Total tiket terjual sebanyak " + tiketTerjual + " tiket");
        System.out.println("Total omset yang didapat : " + omset);
        sc.close();
    }
}
