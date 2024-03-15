public class mobil {
    private String merk;
    private String ban;
    private String bahanBakar;
    private String kecepatanMaks;

    public mobil(String merk, String ban, String bahanBakar, String kecepatanMaks) {
        this.merk = merk;
        this.ban = ban;
        this.bahanBakar = bahanBakar;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void mencariNafkah(String gocar) {
        System.out.println(merk + " sedang mencari nafkah dengan menjadi driver " + gocar);
    }

    public void nabrak() {
        System.out.println(merk + " telah nabrak sesuatu!");
    }

    public void banMeletus() {
        System.out.println("Ban mobil " + merk + " meletus!");
    }

    public static void main(String[] args) {
        mobil mobil1 = new mobil("Toyota Avanza", "Bridgestone", "Bensin", "180 km/h");
        mobil1.mencariNafkah("GoCar");
        mobil1.nabrak();
        mobil1.banMeletus();

        mobil mobil2 = new mobil("Toyota Inonova", "Michelin", "Solar", "200 km/h");
        mobil2.mencariNafkah("Grab");
        mobil2.nabrak();
        mobil2.banMeletus();
    }
}

