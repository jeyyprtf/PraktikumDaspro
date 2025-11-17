import java.util.Scanner;

public class SearchNilai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = input.nextInt();

        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        int hasil = -1; 

        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        System.out.println();
    }
}
