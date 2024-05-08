
public class Main {
    public static void main(String[] args) {

        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Kue A", 10.0, 0.5);
        kueArray[1] = new KuePesanan("Kue B", 15.0, 0.7);
        kueArray[2] = new KueJadi("Kue C", 20.0, 3);
        kueArray[3] = new KueJadi("Kue D", 25.0, 4);

        System.out.println("Daftar Kue:");
        for (Kue kue : kueArray) {
            if (kue != null) {
                System.out.println(kue.toString() + " (" + kue.getClass().getSimpleName() + ")");
            }
        }

        double totalHargaSemuaKue = 0;
        for (Kue kue : kueArray) {
            if (kue != null) {
                totalHargaSemuaKue += kue.hitungHarga();
            }
        }
        System.out.println("Total harga semua kue: " + totalHargaSemuaKue);

        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHargaKuePesanan);
        System.out.println("Total berat KuePesanan: " + totalBeratKuePesanan);

        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total harga KueJadi: " + totalHargaKueJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlahKueJadi);

        Kue kueTerbesar = null;
        double hargaTerbesar = 0;
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                kueTerbesar = kue;
                hargaTerbesar = kue.hitungHarga();
            }
        }
        if (kueTerbesar != null) {
            System.out.println("Informasi kue dengan harga terbesar: " + kueTerbesar.toString());
        }
    }
}