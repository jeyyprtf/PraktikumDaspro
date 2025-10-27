import java.util.Scanner;
public class soalA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaMobil = 300000;
        int biayaSopir = 200000;
        double biayaBBM = 1000;
        double lamaSewa, jarakTempuh, totalBiaya;

        System.out.print("Masukkan lama sewa mobil (dalam hari): ");
        lamaSewa = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (dalam km): ");
        jarakTempuh = input.nextDouble();
        totalBiaya = (biayaMobil * lamaSewa) + (biayaSopir * lamaSewa) + (biayaBBM * jarakTempuh);
        System.out.println("Total biaya sewa mobil adalah: Rp " + totalBiaya);
        input.close();
    }
}

