// class KuePesanan extends Kue {
//     private double berat;
    
//     public KuePesanan(String nama, double harga, double berat) {
//         super(nama, harga);
//         this.berat = berat;
//     }

//     public double hitungHarga() {
//         return harga * berat;
//     }

//     public double getBerat() {
//         return this.berat;
//     }
    

//     public void getHarga(){
//         this.harga = harga;
//     }
// }

class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double hitungHarga() {
        return harga * berat;
    }

    public double getBerat() {
        return this.berat;
    }
}
