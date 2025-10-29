import java.util.Scanner;
public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai,tertinggi = 0, terendah = 100;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            if (nilai < 60) {
                mahasiswaTidakLulus++;
                mahasiswaLulus = (10-mahasiswaTidakLulus);
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Dari 10 mahasiswa, " + mahasiswaLulus + " diantaranya lulus, dan " + mahasiswaTidakLulus + " mahasiswa tidak lulus.");
        sc.close();
    }
}
