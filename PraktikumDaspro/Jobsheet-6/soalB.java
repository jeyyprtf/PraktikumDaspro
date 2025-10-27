import java.util.Scanner;
public class soalB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaTetap = 50000;
        int tarifPerKwh = 0;
        double pajak = 0.1;
        double pemakaianKwh;
        double totalBiaya;
        int daya;

        System.out.print("Masukkan daya listrik \n1. 900 VA \n2. 1300 VA \n3. 2200 VA \n4. 3500 VA \n5. 5500 VA \n\nMasukkan daya (dalam VA): ");
        daya = input.nextInt();

        if (daya == 1) {
            tarifPerKwh = 1300;
        } else if (daya == 2 || daya == 3) {
            tarifPerKwh = 1500;
        } else if (daya == 4 || daya == 5) {
            tarifPerKwh = 1700;
        }
        else {
            System.out.println("Daya listrik tidak valid.");
            input.close();
            return;
        }

        System.out.print("Masukkan pemakaian listrik (dalam kWh): ");
        pemakaianKwh = input.nextDouble();
        totalBiaya = biayaTetap + (tarifPerKwh * pemakaianKwh);
        totalBiaya += totalBiaya * pajak;
        System.out.println("Total biaya listrik adalah: Rp " + totalBiaya);
        input.close();
    }
}

