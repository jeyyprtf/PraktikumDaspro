import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max, min;
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        System.out.print("Masukkan nilai c: ");
        c = sc.nextInt();
        // Mencari maksimum
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;

        }
        // Mencari minimum
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        // Output:
        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
        System.out.println("Terima kasih telah menggunakan layanan kami");
    }
}
