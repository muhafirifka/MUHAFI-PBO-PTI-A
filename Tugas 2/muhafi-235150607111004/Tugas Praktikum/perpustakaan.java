import java.util.ArrayList;
import java.util.List;

public class perpustakaan {
    private List<Buku> koleksi;

    public perpustakaan() {
        this.koleksi = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public List<Buku> getKoleksi() {
        return koleksi;
    }

    public static void main(String[] args) {

        perpustakaan perpustakaan = new perpustakaan();

        penulis penulis1 = new penulis("Penulis A");
        penulis penulis2 = new penulis("Penulis B");

        Buku buku1 = new Buku("Buku 1", "teknologi");
        Buku buku2 = new Buku("Buku 2", "filsafat");
        Buku buku3 = new Buku("Buku 3", "sejarah");
        Buku buku4 = new Buku("Buku 4", "agama");
        Buku buku5 = new Buku("Buku 5", "psikologi");

        buku1.tambahPenulis(penulis1);
        buku2.tambahPenulis(penulis1);
        buku3.tambahPenulis(penulis2);
        buku4.tambahPenulis(penulis2);
        buku5.tambahPenulis(penulis1);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        perpustakaan.tambahBuku(buku5);

        List<Buku> koleksiBuku = perpustakaan.getKoleksi();
        for (Buku buku : koleksiBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Kategori: " + buku.getKategori());
            System.out.print("Penulis: ");
            List<penulis> penulisBuku = buku.getPenulis();
            for (int i = 0; i < penulisBuku.size(); i++) {
                System.out.print(penulisBuku.get(i).getNama());
                if (i < penulisBuku.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n");
        }
    }
}
