
class PegawaiHarian extends Pegawai {
    double upahPerJam;
    int totalJam;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    double gaji() {
        return upahPerJam * totalJam;
    }
}

