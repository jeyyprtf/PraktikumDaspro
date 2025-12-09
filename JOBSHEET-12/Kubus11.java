import java.util.Scanner;

public class Kubus11 {
    public static void main(String[] args) {
        int sisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = input.nextInt();
        int luas = 6 * sisi * sisi;
        int volume = sisi * sisi * sisi;
        System.out.println("Luas kubus: " + luas);
        System.out.println("Volume kubus: " + volume);
        input.close();
    }
}
