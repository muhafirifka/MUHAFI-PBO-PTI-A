class PegawaiTetap extends Pegawai {
    double upah;

    PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    void setUpah(double upah) {
        this.upah = upah;
    }

    double getUpah() {
        return upah;
    }

    double gaji() {
        return upah;
    }

    public String toString() {
        return "Nama: " + nama + ", No KTP: " + noKTP + ", Upah: " + upah;
    }
}