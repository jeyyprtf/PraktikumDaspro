import java.util.Scanner;
public class UjianSkripsiNested12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan Pembimbing 1 kurang dari 8 dan log bimbingan Pembimbing 2 kurang dari 4.";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan Pembimbing 1 kurang dari 8.";
            } else {
                pesan = "Gagal! Log bimbingan Pembimbing 2 kurang dari 4.";
            }
        } else {
            pesan = "Mahasiswa belum boleh ujian skripsi, masih ada tanggungan kompen.";
        }
        System.out.println(pesan);
        sc.close();
    }
}
