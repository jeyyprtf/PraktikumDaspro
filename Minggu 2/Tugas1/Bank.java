import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tabunganAwal, bunga, tabunganAkhir, persentaseBunga;
        int lamaMenabung;
        persentaseBunga = 0.0002;
        System.out.print("Masukkan jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.print("Masukkan lama menabung (dalam bulan): ");
        lamaMenabung = sc.nextInt();
        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;
        System.out.println("bunga : " + bunga);
        System.out.println("Jumlah tabungan akhir: " + tabunganAkhir);
        sc.close();
    }
}

