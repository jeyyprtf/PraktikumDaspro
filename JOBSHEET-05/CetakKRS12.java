import java.util.Scanner;
public class CetakKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah dibayar? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        String message = uktLunas ? "Pembayaran UKT terverifikasi!\nSilahkan cetak KRS dan minta tanda tangan DPA" : "“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”";
        System.out.println(message);
        sc.close();
    }
}