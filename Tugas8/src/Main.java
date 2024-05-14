
public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap("John Doe", "1234567890", 5000000);
        PegawaiHarian pegawai2 = new PegawaiHarian("Jane Doe", "0987654321", 10000, 40);
        Sales pegawai3 = new Sales("Alice Smith", "1357924680", 1000000, 0.1);

        System.out.println("Detail Pegawai 1:");
        System.out.println(pegawai1.toString());
        System.out.println("Gaji Pegawai 1: $" + pegawai1.gaji());
        System.out.println();

        System.out.println("Detail Pegawai 2:");
        System.out.println(pegawai2.toString());
        System.out.println("Gaji Pegawai 2: $" + pegawai2.gaji());
        System.out.println();

        System.out.println("Detail Pegawai 3:");
        System.out.println(pegawai3.toString());
        System.out.println("Gaji Pegawai 3: $" + pegawai3.gaji());
        System.out.println();
    }
}
