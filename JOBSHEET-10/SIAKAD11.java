import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahSiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();

        int nilai[][] = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mata kuliah ke-" + (j+1) + ": ");
                nilai[i][j] = scanner.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + (totalPerSiswa / jumlahMatkul));
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMataKuliah = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMataKuliah += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j+1) + ": " + (totalPerMataKuliah / jumlahSiswa));
        }
        scanner.close();
    }
}