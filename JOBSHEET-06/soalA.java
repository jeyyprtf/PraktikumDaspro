import java.util.Scanner;
public class soalA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaMobil = 300000;
        int biayaSopir = 200000;
        double lamaSewa, jarakTempuh, totalBiaya;
        double biayaBBM = 0;
        int opsiBBM;

        System.out.print("Masukkan lama sewa mobil (dalam hari): ");
        lamaSewa = input.nextDouble();

        if (lamaSewa > 30) {
            System.out.println("Lama sewa tidak boleh lebih dari 30 hari.");
            input.close();
            return;
        }

        System.out.print("Masukkan jarak tempuh (dalam km): ");
        jarakTempuh = input.nextDouble();
        System.out.print("Pilih opsi BBM \n1. Premium (Rp 1000 per km) \n2. Pertamax (Rp 1300 per km) \nMasukkan opsi (1 atau 2): ");
        opsiBBM = input.nextInt();

        switch (opsiBBM) {
            case 1:
                biayaBBM = 1000;
                break;
            case 2:
                biayaBBM = 1300;
            default:
                System.out.println("Opsi BBM tidak valid.");
                break;
        }

        totalBiaya = (biayaMobil * lamaSewa) + (biayaSopir * lamaSewa) + (biayaBBM * jarakTempuh);

        if (totalBiaya > 2000000) {
            totalBiaya *= 0.95;
            System.out.println("Anda mendapatkan diskon 5% karena total biaya melebihi Rp 2.000.000");
        }
        System.out.println("Total biaya sewa mobil adalah: Rp " + totalBiaya);
        input.close();
    }
}

