import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai, rataNilaiTertinggi = 0;
        int kelompokTertinggi = 0;
        
        for (int i = 1;i <= 6; i++) {
            System.out.println();
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }
    
            rataNilai = totalNilai / 5;

            if (rataNilai > rataNilaiTertinggi) {
                rataNilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            
            System.out.println("Rata-rata: " + rataNilai);
        }
    
        System.out.println("Kelompok dengan nilai rata rata tertinggi adalah kelompok " + kelompokTertinggi);
        System.out.println("Dengan perolehan nilai rata rata sebesar " + rataNilaiTertinggi);
        sc.close();
    }
}