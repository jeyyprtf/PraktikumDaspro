import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baris, kolom;
        String nama;

        String penonton[][] = new String[4][2];
        boolean running = true;
        
        while (running) { 
            System.out.print("\n--- MENU BIOSKOP ---\n1. Input Data Penonton\n2. Tampilkan Daftar Penonton\n3. Exit\n Pilih menu: ");

            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\n--- Input Data ---");
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = scanner.nextLine();
                        
                        System.out.print("Masukkan baris (1-4): ");
                        baris = scanner.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = scanner.nextInt();
                        scanner.nextLine(); 

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Data penonton berhasil disimpan");
                            } else {
                                System.out.println("Maaf, kursi tersebut sudah terisi");
                            }

                        } else {
                            System.out.println("Nomor baris/kolom tidak tersedia");
                        }

                        System.out.print("Ingin menambah penonton lagi? (y/n): ");
                        String next = scanner.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break; 
                        }
                    }
                    break;
            
                case 2:
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j];

                            if (namaPenonton == null) {
                                namaPenonton = "***";
                            }

                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + namaPenonton);
                        }
                    }
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }
        scanner.close();
    }
}