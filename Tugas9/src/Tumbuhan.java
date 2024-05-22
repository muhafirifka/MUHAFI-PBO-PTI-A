public class Tumbuhan implements MakhlukHidup {
    private String nama;
    private String jenis;

    // Konstruktor dengan parameter nama dan jenis
    public Tumbuhan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    public void makan() {
        System.out.println(nama + " melakukan fotosintesis");
    }

    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak berjalan");
    }

    @Override
    public void bersuara() {
        System.out.println("Tumbuhan tidak bersuara");
    }

    public void tampilkanJenis() {
        System.out.println("Jenis tumbuhan ini: " + jenis);
    }
}
