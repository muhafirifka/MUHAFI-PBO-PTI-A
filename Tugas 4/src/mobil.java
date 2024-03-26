// public class mobil {
//     private String merk;
//     private String ban;
//     private String bahanBakar;
//     private String kecepatanMaks;

//     public mobil(String merk, String ban, String bahanBakar, String kecepatanMaks) {
//         this.merk = merk;
//         this.ban = ban;
//         this.bahanBakar = bahanBakar;
//         this.kecepatanMaks = kecepatanMaks;
//     }

//     public void mencariNafkah(String gocar) {
//         System.out.println(merk + " sedang mencari nafkah dengan menjadi driver " + gocar);
//     }

//     public void nabrak() {
//         System.out.println(merk + " telah nabrak sesuatu!");
//     }

//     public void banMeletus() {
//         System.out.println("Ban mobil " + merk + " meletus!");
//     }

//     public static void main(String[] args) {
//         mobil mobil1 = new mobil("Toyota Avanza", "Bridgestone", "Bensin", "180 km/h");
//         mobil1.mencariNafkah("GoCar");
//         mobil1.nabrak();
//         mobil1.banMeletus();

//         mobil mobil2 = new mobil("Toyota Inonova", "Michelin", "Solar", "200 km/h");
//         mobil2.mencariNafkah("Grab");
//         mobil2.nabrak();
//         mobil2.banMeletus();
//     }
// }


// praktikum lanjutan
public class mobil {
    private String merk;
    private String ban;
    private String bahanBakar;
    private String kecepatanMaks;

    // Constructor overloading
    public mobil(String merk, String ban, String bahanBakar, String kecepatanMaks) {
        this.merk = merk;
        this.ban = ban;
        this.bahanBakar = bahanBakar;
        this.kecepatanMaks = kecepatanMaks;
    }

    public mobil(String merk, String ban, String bahanBakar) {
        this.merk = merk;
        this.ban = ban;
        this.bahanBakar = bahanBakar;
        this.kecepatanMaks = "Tidak diketahui";
    }

    public mobil(String merk, String ban) {
        this.merk = merk;
        this.ban = ban;
        this.bahanBakar = "Tidak diketahui";
        this.kecepatanMaks = "Tidak diketahui";
    }

    // Method overload
    public void mencariNafkah(String gocar) {
        System.out.println(merk + " sedang mencari nafkah dengan menjadi driver " + gocar);
    }

    public void mencariNafkah() {
        System.out.println(merk + " sedang mencari nafkah.");
    }

    public void nabrak(String objek) {
        System.out.println(merk + " telah nabrak sesuatu! " + objek + " rusak.");
    }

    public void nabrak() {
        System.out.println(merk + " telah nabrak sesuatu!");
    }

    public void banMeletus() {
        System.out.println("Ban mobil " + merk + " meletus!");
    }

    // Method instance yang mengembalikan tipe data kelas itu sendiri
    public mobil getInfo() {
        return this;
    }

    public static void main(String[] args) {
        // Membuat tiga objek menggunakan constructor overloading
        mobil mobil1 = new mobil("Toyota Avanza", "Bridgestone", "Bensin", "180 km/h");
        mobil mobil2 = new mobil("Toyota Inonova", "Michelin", "Solar", "200 km/h");
        mobil mobil3 = new mobil("Honda Civic", "Dunlop");

        // Memanggil method overload dari salah satu objek
        mobil1.mencariNafkah("GoCar");
    }
}
