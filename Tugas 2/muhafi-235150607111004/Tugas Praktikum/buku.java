import java.util.ArrayList;
import java.util.List;

public class buku {
    private String judul;
    private List<penulis> penulis;
    private String kategori;

    public buku(String judul, String kategori) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = new ArrayList<>();
    }

    public void tambahPenulis(penulis penulis) {
        this.penulis.add(penulis);
    }

    public String getJudul() {
        return judul;
    }

    public List<penulis> getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }
}
