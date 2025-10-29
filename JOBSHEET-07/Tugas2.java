import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        
        do {
            System.out.println("---------------------------------------------------------");
            System.out.print("Pilih jenis kendaraan\n\n1. Mobil\n2. Motor\n0. Keluar\nMasukkan input : ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }

                System.out.println("total sementara: " + total);
            }
            
        } while (jenis != 0);

        System.out.println("Total : " + total);

        sc.close();
    }
}
