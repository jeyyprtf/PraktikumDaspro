import java.util.Scanner;
public class soalB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaTetap = 50000;
        int tarifPerKwh = 1500;
        double pajak = 0.1;
        double pemakaianKwh;
        double totalBiaya;
        System.out.print("Masukkan pemakaian listrik (dalam kWh): ");
        pemakaianKwh = input.nextDouble();
        totalBiaya = biayaTetap + (tarifPerKwh * pemakaianKwh);
        totalBiaya += totalBiaya * pajak;
        System.out.println("Total biaya listrik adalah: Rp " + totalBiaya);
        input.close();
    }
}

