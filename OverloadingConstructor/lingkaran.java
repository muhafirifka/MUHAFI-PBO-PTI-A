package OverloadingConstructor;

// public class lingkaran {
//         int alas, tinggi;
//         public lingkaran(int alas){
//             this.alas = alas;
//         }
    
//         public lingkaran(int alas, int tinggi){
//             this.alas = alas;
//             this.tinggi = tinggi;
//         }
//         public void setAlas(int alas){
//             this.alas = alas;
//         }
    
//         public void setTinggi(int tinggi){
//             this.tinggi = tinggi;
//         }
    
//         public int getAlas(){
//             return alas;
//         }
    
//         public int getTinggi(){
//             return tinggi;
//         }
    
//         public double hitungLuas(){
//             double hasil = (double)(getTinggi()*getAlas())/2;
//             return hasil;
//         }
        
//         public void displayMessage(){
//             System.out.println("Hitung Luas : "+hitungLuas());
//         }
// }

// no 2
// public class lingkaran {
//     int alas, tinggi;
    

//     public lingkaran(int alas, int tinggi) {
//         this.alas = alas;
//         this.tinggi = tinggi;
//     }
    
//     public lingkaran(int alas) {
//         this.alas = alas;
//         this.tinggi = 0;
//     }

//     public void setAlas(int alas) {
//         this.alas = alas;
//     }
    
//     public void setTinggi(int tinggi) {
//         this.tinggi = tinggi;
//     }
    
//     public int getAlas() {
//         return alas;
//     }
    
//     public int getTinggi() {
//         return tinggi;
//     }
    
//     public double hitungLuas() {
//         double hasil;
//         if (tinggi == 0) {
//             hasil = (double) (alas * alas * Math.PI);
//         } else {
//             hasil = (double) (tinggi * alas) / 2;
//         }
//         return hasil;
//     }
    
//     public void displayMessage() {
//         if (tinggi == 0) {
//             System.out.println("Hitung Luas Lingkaran : " + hitungLuas());
//         } else {
//             System.out.println("Hitung Luas Segitiga : " + hitungLuas());
//         }
//     }
// }

// no 3
public class lingkaran {
    int alas, tinggi;
    
    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public lingkaran(int alas) {
        this.alas = alas;
        this.tinggi = 0;
    }
    
    public lingkaran(String alas, String tinggi) {
        this.alas = parseInt(alas);
        this.tinggi = parseInt(tinggi);
    }

    private int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.err.println("Error: Format tidak valid. Menggunakan nilai default (0).");
            return 0;
        }
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getAlas() {
        return alas;
    }
    
    public int getTinggi() {
        return tinggi;
    }
    
    public double hitungLuas() {
        double hasil;
        if (tinggi == 0) {
            hasil = (double) (alas * alas * Math.PI);
        } else {
            hasil = (double) (tinggi * alas) / 2;
        }
        return hasil;
    }
    
    public void displayMessage() {
        if (tinggi == 0) {
            System.out.println("Hitung Luas Lingkaran : " + hitungLuas());
        } else {
            System.out.println("Hitung Luas Segitiga : " + hitungLuas());
        }
    }

    public static void main(String[] args) {
        lingkaran lingkaran1 = new lingkaran("5", "10");
        lingkaran lingkaran2 = new lingkaran("7", "0");

        lingkaran1.displayMessage();
        lingkaran2.displayMessage();
    }
}

