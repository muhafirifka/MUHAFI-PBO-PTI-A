public class Sales extends Pegawai {
    int penjualan;
    double komisi;

    Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    int getPenjualan() {
        return penjualan;
    }

    double getKomisi() {
        return komisi;
    }

    double gaji() {
        return penjualan * komisi;
    }

    public String toString() {
        return "Nama: " + nama + ", No KTP: " + noKTP + ", Penjualan: " + penjualan + ", Komisi: " + komisi;
    }
}