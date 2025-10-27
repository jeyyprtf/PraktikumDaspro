import java.util.Scanner;
public class soalC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsiPanitia = 500000;
        int biayaHadiah =  4000000;
        int biayaOperasional = 500000;
        int biayaKonsumsiPesertaPerOrang = 25000;
        int honoriumJuriPerJudul = 75000;
        int biayaPendaftaran = 50000;
        double bantuanPolinema = 0;
        int anggotaPerTim = 3;
        int jumlahTim;
        double totalBiaya, danaDariSponsor;
        int PolinemaBersedia;

        System.out.print("Masukkan jumlah tim yang mendaftar: ");
        jumlahTim = input.nextInt();

        System.out.println("Apakah Polinema bersedia memberikan bantuan dana? \n1. Ya \n2. Tidak \n\nMasukkan pilihan (1 atau 2): ");
        PolinemaBersedia = input.nextInt();

        switch (PolinemaBersedia) {
            case 1:
                System.out.print("Masukkan persentase bantuan dana dari Polinema (1-100): ");
                bantuanPolinema = input.nextDouble();
                bantuanPolinema = bantuanPolinema / 100;
                System.out.println("Persentase bantuan dana dari Polinema: " + (bantuanPolinema * 100) + "%");
                break;
            case 2:
                bantuanPolinema = 0;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        totalBiaya = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitia + biayaHadiah + biayaOperasional
        + (biayaKonsumsiPesertaPerOrang * anggotaPerTim * jumlahTim) + (honoriumJuriPerJudul * jumlahTim);
        danaDariSponsor = totalBiaya * (1 - bantuanPolinema);

        System.out.println("Total biaya yang diperlukan untuk menyelenggarakan lomba adalah: Rp " + totalBiaya);

        if ((danaDariSponsor - (biayaPendaftaran * jumlahTim)) <= 0 ) {
            System.out.println("Jumlah dana sudah cukup, tidak perlu mencari sponsor.");
            System.out.println("Sisa dana: Rp " + ((biayaPendaftaran * jumlahTim) - danaDariSponsor));
        } else {
            System.out.println("Dana yang harus diperoleh dari sponsor adalah: Rp " + (danaDariSponsor - (biayaPendaftaran * jumlahTim)));
        }
        input.close();
    }
}


