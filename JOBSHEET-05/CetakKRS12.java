import java.util.Scanner;
public class CetakKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah dibayar? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi!");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
        sc.close();
    }
}
