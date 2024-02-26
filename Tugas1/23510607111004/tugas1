
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Program Fitur Aplikasi!");
        System.out.print("Masukkan jumlah data yang ingin dimasukkan: ");
        int jumlahData = input.nextInt();
        
        int[] data = new int[jumlahData];
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            data[i] = input.nextInt();
        }
        
        System.out.println("\nData yang telah dimasukkan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i+1) + ": " + data[i]);
        }
        
        System.out.println("\nMenghitung rata-rata data...");
        double rataRata = hitungRataRata(data);
        System.out.println("Rata-rata data: " + rataRata);
    }
    
    public static double hitungRataRata(int[] data) {
        int total = 0;
        
        for (int nilai : data) {
            total += nilai;
        }
        
        return (double) total / data.length;
    }
}
