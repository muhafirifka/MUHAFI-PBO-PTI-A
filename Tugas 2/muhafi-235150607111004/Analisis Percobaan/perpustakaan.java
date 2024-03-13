import java.util.List;

public class perpustakaan {
    private String judul;
    private List<String> penulis;

    public perpustakaan(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public List<String> getPenulis() {
        return penulis;
    }
}
