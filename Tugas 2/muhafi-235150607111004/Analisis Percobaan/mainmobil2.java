public class mainmobil2 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public mainmobil2(String noPlat, String warna, String manufaktur, int kecepatan) {
        this.noPlat = noPlat;
        this.warna = warna;
        this.manufaktur = manufaktur;
        this.kecepatan = kecepatan;
    }
    
    public void setWaktu(double waktu) {
        double sekon = waktu * 3600;
        kecepatan = (int) sekon;
    }

    public void rubahSekon(double sekon) {
        double jam = sekon / 3600;
        kecepatan = (int) jam;
    }
    public static void main(String[] args) {
        mainmobil2 mobil = new mainmobil2("AE 1234 CD", "Merah", "Toyota", 0);
        mobil.setWaktu(1.5);
        System.out.println("Kecepatan mobil setelah setWaktu: " + mobil.kecepatan);
        mobil.rubahSekon(7200);
        System.out.println("Kecepatan mobil setelah rubahSekon: " + mobil.kecepatan);
    }
}
