public class buku {
    
        private int jumlahHalaman;
        private int kataPerHari;
    
        public buku(int jumlahHalaman, int kataPerHari) {
            this.jumlahHalaman = jumlahHalaman;
            this.kataPerHari = kataPerHari;
        }
    
        public int hitungLamaMenulis() {
            int kataPerHalaman = 200;
            int totalKata = jumlahHalaman * kataPerHalaman;
            int hari = totalKata / kataPerHari;
            return hari;
        }
    
        public static void main(String[] args) {
            buku buku = new buku(50, 100);
            int lamaMenulisBuku = buku.hitungLamaMenulis();
            System.out.println("Mahasiswa A akan menghabiskan buku tersebut dalam " + lamaMenulisBuku + " hari.");
        }

        public int getJumlahHalaman() {
            return jumlahHalaman;
        }

        public void setJumlahHalaman(int jumlahHalaman) {
            this.jumlahHalaman = jumlahHalaman;
        }

        public int getKataPerHari() {
            return kataPerHari;
        }

        public void setKataPerHari(int kataPerHari) {
            this.kataPerHari = kataPerHari;
        }
    
}
