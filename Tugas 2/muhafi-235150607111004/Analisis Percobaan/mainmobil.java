import java.util.Scanner;

public class mainmobil {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                System.out.println("================");
                System.out.println("================");
                System.out.println("Masukkan nomor plat mobil: ");

                String noPlat = scanner.nextLine();
                System.out.println("Masukkan warna mobil: ");
                String warna = scanner.nextLine();

                System.out.println("Masukkan manufaktur mobil: ");
                String manufaktur = scanner.nextLine();
                
                System.out.println("Masukkan kecepatan mobil: ");
                int kecepatan = scanner.nextInt();

                Mobil m1 = new Mobil(noPlat, warna, manufaktur, kecepatan);
                
                System.out.println("Mobil	anda	adalah	bermerek"+manufaktur);
                System.out.println("mempunyai nomor plat "+noPlat);
                System.out.println("serta memililki warna "+warna);
                System.out.println("dan	mampu	menempuh	kecepatan"+kecepatan);
        
    }
}
