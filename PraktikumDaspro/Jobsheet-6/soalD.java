import java.util.Scanner;
public class soalD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaCetakPerHalaman = 200;
        int biayaCover = 0;
        double beratPerLembar = 0.003; // dalam kilogram
        double beratCover = 0; // dalam kilogram
        double beratPacking = 0.300; // dalam kilogram
        int ongkirPerKilo = 14000; // ongkir per kilogram
        int jumlahHalaman;
        double totalBiaya = 0, totalBerat = 0, ongkir = 0;
        int biayaPengiriman = 0;

        System.out.print("Masukkan jumlah halaman buku: ");
        jumlahHalaman = input.nextInt();

        System.out.print("Pilih jenis cover:\n1. Hard Cover\n2. Soft Cover\n\npilih angka 1 atau 2: ");
        int jenisCover = input.nextInt();

        switch (jenisCover) {
            case 1:
                biayaCover = 20000;
                beratCover = 0.250;
                break;
            case 2:
                biayaCover = 10000;
                beratCover = 0.100;
                break;
            default:
                break;
        }
        input.nextLine();
        System.out.print("Masukkan kota tinggal anda: ");
        String kota = input.nextLine();
        
        if (kota.trim().equalsIgnoreCase("malang") || kota.trim().equalsIgnoreCase("batu")) {
            biayaPengiriman += 20000;
        } else {
            totalBerat = (beratPerLembar * Math.ceil(jumlahHalaman / 2)) + beratCover + beratPacking;
            ongkir = Math.ceil(totalBerat) * ongkirPerKilo; 
            biayaPengiriman += ongkir;
        }

        totalBiaya = (biayaCetakPerHalaman * jumlahHalaman) + biayaCover + biayaPengiriman;
        System.out.println("Total berat buku (dalam kg): " + totalBerat);
        System.out.println("Ongkir yang harus dibayar: Rp " + biayaPengiriman);
        System.out.println("Total biaya yang diperlukan untuk mencetak dan mengirim buku adalah: Rp " + totalBiaya);
        input.close();
    }
}

