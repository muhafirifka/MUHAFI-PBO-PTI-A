public class MahasiswaFILKOM extends manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = nim.substring(0, 2);
        String prodi = "";
        switch (nim.charAt(6)) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();
    }

    public static void main(String[] args) {
        MahasiswaFILKOM mahasiswa = new MahasiswaFILKOM("John Doe", true, "1234567890", true, "175150600XXXXXX", 3.5);
        System.out.println(mahasiswa.toString());
        System.out.println("Beasiswa: $" + mahasiswa.getBeasiswa());
    }
}
