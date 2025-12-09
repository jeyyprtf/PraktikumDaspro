import java.util.Scanner;

public class RekapPenjualanCafe11 {

    static Scanner scanner = new Scanner(System.in);
    static String[] menu = {"Kopi", "Teh", "Susu", "Roti", "Kue"};
    static int[][] penjualan = new int[5][7];

    public static void inputDataPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilDataPenjualan() {
        System.out.println("=====================================================================");
        System.out.println("                        REKAP PENJUALAN KAFE                         ");
        System.out.println("=====================================================================");
        System.out.printf("% -10s", "Menu");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%10s", "Hari ke-" + (i + 1));
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("% -10s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%10d", penjualan[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================================================");
    }

    public static void tampilPenjualanTertinggi() {
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

    public static void tampilRataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu selama 7 hari:");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / penjualan[i].length;
            System.out.printf("Rata-rata penjualan % -5s: %.2f\n", menu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        inputDataPenjualan();
        System.out.println("\n");

        tampilDataPenjualan();
        System.out.println("\n");

        tampilPenjualanTertinggi();
        System.out.println("\n");

        tampilRataRataPenjualan();
    }
}