public class montor {

    private String merkMotor;
    private String bahanBakar;
    private int kapasitasMesin;


    public montor(String merkMotor, String bahanBakar, int kapasitasMesin) {
        this.merkMotor = merkMotor;
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void mencariNafkah(String gojek) {
        System.out.println(merkMotor + " sedang mencari nafkah dengan menjadi driver " + gojek);
    }


    public void kecelakaan() {
        System.out.println(merkMotor + " mengalami kecelakaan!");
    }

    public void habisBensin() {
        System.out.println(merkMotor + " kehabisan bahan bakar!");
    }


    public static void main(String[] args) {
        montor montor1 = new montor("Honda Beat", "Bensin", 110);
        montor1.mencariNafkah("Gojek");
        montor1.kecelakaan();
        montor1.habisBensin();

        montor motor2 = new montor("Yamaha NMAX", "Pertamax", 155);
        motor2.mencariNafkah("Grab");
        motor2.kecelakaan();
        motor2.habisBensin();
    }
}
