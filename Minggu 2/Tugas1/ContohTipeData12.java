public class ContohTipeData12 {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        short jumlahPenduduk = 1025;
        float suhu = 60.50f;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t: "+ (byte) golonganDarah);
        System.out.println("Jumlah Penduduk\t: "+ jumlahPenduduk);
        System.out.println("Suhu\t\t: " + suhu);
        System.out.println("Berat\t\t: "+ (float) berat);
        System.out.println("Saldo\t\t: "+ saldo);
        System.out.println("Angka desimal\t: " + angkaDesimal);
    }
}
