import java.util.Scanner;

public class RekapPenjualanCafe11 {

    static Scanner scanner = new Scanner(System.in);

    public static void inputDataPenjualan(String[] menu, int[][] penjualan) {
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilDataPenjualan(String[] menu, int[][] penjualan) {
        if (menu.length == 0) return;
        int jumlahHari = penjualan[0].length;
        
        System.out.println("=====================================================================");
        System.out.println("                        REKAP PENJUALAN KAFE                         ");
        System.out.println("=====================================================================");
        System.out.printf("%-15s", "Menu");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.printf("%10s", "Hari ke-" + (i + 1));
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("% -15s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%10d", penjualan[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================================================");
    }

    public static void tampilPenjualanTertinggi(String[] menu, int[][] penjualan) {
        if (menu.length == 0) {
            System.out.println("Tidak ada data penjualan untuk ditampilkan.");
            return;
        }

        int maxTotal = -1;
        String menuTerlaris = "";
        
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualanMenu = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualanMenu += penjualan[i][j];
            }
            
            if (totalPenjualanMenu > maxTotal) {
                maxTotal = totalPenjualanMenu;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah: " + menuTerlaris);
        System.out.println("Total penjualan: " + maxTotal);
    }

    public static void tampilRataRataPenjualan(String[] menu, int[][] penjualan) {
        if (menu.length == 0) {
            System.out.println("Tidak ada data penjualan untuk dihitung.");
            return;
        }
        int jumlahHari = penjualan[0].length;
        System.out.println("Rata-rata penjualan per menu selama " + jumlahHari + " hari:");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / penjualan[i].length;
            System.out.printf("Rata-rata penjualan %-10s: %.2f\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = scanner.nextInt();
        scanner.nextLine(); 

        String[] menu = new String[jumlahMenu];
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        for(int i = 0; i < jumlahMenu; i++){
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = scanner.nextLine();
        }
        System.out.println();

        inputDataPenjualan(menu, penjualan);
        System.out.println();

        tampilDataPenjualan(menu, penjualan);
        System.out.println();

        tampilPenjualanTertinggi(menu, penjualan);
        System.out.println();

        tampilRataRataPenjualan(menu, penjualan);
    }
}
