public class bus {

    private String merkBus;
    private String kecepatanMin;
    private String bahanBakar;

    public bus(String merkBus, String kecepatanMin, String bahanBakar) {
        this.merkBus = merkBus;
        this.kecepatanMin = kecepatanMin;
        this.bahanBakar = bahanBakar;
    }

    public void mencariNafkah(String kopaja) {
        System.out.println("Bus " + merkBus + " sedang mencari nafkah dengan cara " + kopaja);
    }

    public void mogok() {
        System.out.println("Bus " + merkBus + " mogok!");
    }

    public void kecelakaan() {
        System.out.println("Bus " + merkBus + " mengalami kecelakaan!");
    }

    public void habisBensin() {
        System.out.println("Bus " + merkBus + " habis solar!");
    }

    public static void main(String[] args) {

        bus bus = new bus("Kopaja", "30 km/h", "Solar");
        bus.mencariNafkah("mengangkut penumpang");
        bus.mogok();
        bus.kecelakaan();
        bus.habisBensin();
    }
}
