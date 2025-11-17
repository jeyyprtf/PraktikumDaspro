import java.util.Scanner;
public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus;
        double rata2TidakLulus = 0;
        int mhsLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = scanner.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
                if (nilaiMhs[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[i];
                }
            } else {
                totalTidakLulus += nilaiMhs[i];
                if (nilaiMhs[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiMhs[i];
                }
            }
        }
        rata2Lulus = totalLulus / nilaiMhs.length;
        rata2TidakLulus = totalTidakLulus / nilaiMhs.length;
        System.out.println("Rata-rata nilai lulus: " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rata2TidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus: " + mhsLulus);
        System.out.println("Nilai tertinggi dari mahasiswa yang lulus: " + nilaiTertinggi);
        System.out.println("Nilai terendah dari mahasiswa yang tidak lulus: " + nilaiTerendah);
    }
}