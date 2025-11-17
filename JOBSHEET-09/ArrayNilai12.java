import java.util.Scanner;
public class ArrayNilai12 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir untuk mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = scanner.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70)  {       
                System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " adalah: " + nilaiAkhir[i] + " dinyatakan lulus");
            } else {
                System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " adalah: " + nilaiAkhir[i] + " dinyatakan tidak lulus");
            }
        }
    }
}

