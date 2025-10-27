import java.util.Scanner;
public class soalD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaCetakPerHalaman = 200;
        int biayaHardCover = 20000;
        double beratPerLembar = 0.003; // dalam kilogram
        double beratHardCover = 0.250; // dalam kilogram
        double beratPacking = 0.300; // dalam kilogram
        int ongkirPerKilo = 15000; // ongkir per kilogram
        int jumlahHalaman;
        double totalBiaya, totalBerat, ongkir;

        System.out.print("Masukkan jumlah halaman buku: ");
        jumlahHalaman = input.nextInt();
        totalBerat = (beratPerLembar * Math.ceil(jumlahHalaman / 2)) + beratHardCover + beratPacking;
        ongkir = Math.ceil(totalBerat) * ongkirPerKilo; // pembulatan ke atas
        totalBiaya = (biayaCetakPerHalaman * jumlahHalaman) + biayaHardCover + ongkir;
        System.out.println("Total berat buku (dalam kg): " + totalBerat);
        System.out.println("Ongkir yang harus dibayar: Rp " + ongkir);
        System.out.println("Total biaya yang diperlukan untuk mencetak dan mengirim buku adalah: Rp " + totalBiaya);
        input.close();
    }
}

