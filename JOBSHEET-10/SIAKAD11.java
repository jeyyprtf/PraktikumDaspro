import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai[][] = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + "Nilai mata kuliah" + (j+1) + ": ");
                nilai[i][j] = scanner.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + (totalPerSiswa / 3));
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMataKuliah = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMataKuliah += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j+1) + ": " + (totalPerMataKuliah / 4));
        }
        scanner.close(); 
    }
}
