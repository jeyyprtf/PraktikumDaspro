import java.util.Scanner;

public class NilaiMahasiswa11 {

    static Scanner sc = new Scanner(System.in);

    public static void isianArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] arr) {
        System.out.println("Nilai mahasiswa yang telah diinputkan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        System.out.println();
        tampilArray(nilaiMahasiswa);
        System.out.println();

        int totalNilai = hitTot(nilaiMahasiswa);
        
        System.out.println("Total nilai seluruh mahasiswa adalah: " + totalNilai);
    }
}