// class KueJadi extends Kue {
//     private double jumlah;
    
//     public KueJadi(String nama, double harga, double jumlah) {
//         super(nama, harga);
//         this.jumlah = jumlah;
//     }

//     public double getJumlah() {
//         return this.jumlah;
//     }

//     public double hitungHarga() {
//         return harga * jumlah * 2;
//     }
// }

class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return harga * jumlah;
    }

    public int getJumlah() {
        return this.jumlah;
    }
}
