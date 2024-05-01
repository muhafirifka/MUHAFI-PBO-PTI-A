import java.time.LocalDate;

public class Pekerja extends manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja >= 0 && tahunKerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunKerja > 5 && tahunKerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getTotalIncome() {
        return gaji + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }

    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("John Doe", true, "1234567890", true, 5000, LocalDate.of(2010, 1, 1), 2);
        System.out.println(pekerja.toString());
        System.out.println("Bonus: $" + pekerja.getBonus());
        System.out.println("Total Income: $" + pekerja.getTotalIncome());
    }
}
