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
        double bantuanPolinema = 0.6;
        int anggotaPerTim = 3;
        int jumlahTim;
        double totalBiaya, danaDariSponsor;

        System.out.print("Masukkan jumlah tim yang mendaftar: ");
        jumlahTim = input.nextInt();
        totalBiaya = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitia + biayaHadiah + biayaOperasional
        + (biayaKonsumsiPesertaPerOrang * anggotaPerTim * jumlahTim) + (honoriumJuriPerJudul * jumlahTim);
        danaDariSponsor = totalBiaya * (1 - bantuanPolinema);
        System.out.println("Total biaya yang diperlukan untuk menyelenggarakan lomba adalah: Rp " + totalBiaya);
        System.out.println("Dana yang harus diperoleh dari sponsor adalah: Rp " + (danaDariSponsor - (biayaPendaftaran * jumlahTim)));
        input.close();
    }
}


