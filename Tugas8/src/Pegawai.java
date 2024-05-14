
abstract class Pegawai {
    String nama;
    String noKTP;

    Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    abstract double gaji();

    String getNama() {
        return nama;
    }

    String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return "Nama: " + nama + ", No KTP: " + noKTP;
    }
}
