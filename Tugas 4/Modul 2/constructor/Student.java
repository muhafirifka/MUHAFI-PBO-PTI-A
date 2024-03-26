// no 2
// public class Student {
//     private static int jumlahObjek = 0;
//     private String name;
//     private String address;
//     private int age;
//     private double mathGrade;
//     private double englishGrade;
//     private double scienceGrade;
//     private double average;

//     public Student() {
//         jumlahObjek++;
//     }

//     public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
//         this.name = name;
//         this.address = address;
//         this.age = age;
//         this.mathGrade = mathGrade;
//         this.englishGrade = englishGrade;
//         this.scienceGrade = scienceGrade;
//         jumlahObjek++;
//     }

//     public void displayMessage() {
//         System.out.println("Siswa dengan nama " + name);
//         System.out.println("beramalat di " + address);
//         System.out.println("berumur " + age);
//         System.out.println("Memiliki nilai matematika: " + mathGrade);
//         System.out.println("Memiliki nilai bahasa Inggris: " + englishGrade);
//         System.out.println("Memiliki nilai ilmu pengetahuan: " + scienceGrade);
//         System.out.println("Memiliki nilai rata-rata " + getAverage());
//         System.out.println("Status Akhir: " + statusAkhir());
//     }

//     private double getAverage() {
//         return (mathGrade + scienceGrade + englishGrade) / 3;
//     }

//     private String statusAkhir() {
//         return getAverage() >= 61 ? "Lolos" : "Remidi";
//     }

//     public static int getJumlahObjek() {
//         return jumlahObjek;
//     }
// }

// no 3
// public class Student {
//     private static int jumlahObjek = 0;
//     private String name;
//     private String address;
//     private int age;
//     private double mathGrade;
//     private double englishGrade;
//     private double scienceGrade;
//     private double average;

//     public Student() {
//         jumlahObjek++;
//     }

//     public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
//         this.name = name;
//         this.address = address;
//         this.age = age;
//         this.mathGrade = mathGrade;
//         this.englishGrade = englishGrade;
//         this.scienceGrade = scienceGrade;
//         jumlahObjek++;
//     }

//     public void displayMessage() {
//         System.out.println("Siswa dengan nama " + name);
//         System.out.println("beramalat di " + address);
//         System.out.println("berumur " + age);
//         System.out.println("Memiliki nilai matematika: " + mathGrade);
//         System.out.println("Memiliki nilai bahasa Inggris: " + englishGrade);
//         System.out.println("Memiliki nilai ilmu pengetahuan: " + scienceGrade);
//         System.out.println("Memiliki nilai rata-rata " + getAverage());
//         System.out.println("Status Akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
//     }

//     private double getAverage() {
//         return (mathGrade + scienceGrade + englishGrade) / 3;
//     }

//     private boolean statusAkhir() {
//         return getAverage() >= 61;
//     }

//     public static int getJumlahObjek() {
//         return jumlahObjek;
//     }

//     public static void main(String[] args) {
//         Student siswaBaru = new Student("Budi", "Jl. Merdeka No. 123", 16, 80, 75, 85);
//         siswaBaru.displayMessage();
//     }
// }

// no 4
// import java.util.Scanner;

// public class Student {
//     private static int jumlahObjek = 0;
//     private String name;
//     private String address;
//     private int age;
//     private double mathGrade;
//     private double englishGrade;
//     private double scienceGrade;
//     private double average;

//     public Student() {
//         jumlahObjek++;
//     }

//     public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
//         this.name = name;
//         this.address = address;
//         this.age = age;
//         this.mathGrade = mathGrade;
//         this.englishGrade = englishGrade;
//         this.scienceGrade = scienceGrade;
//         jumlahObjek++;
//     }

//     public void displayMessage() {
//         System.out.println("Siswa dengan nama " + name);
//         System.out.println("beramalat di " + address);
//         System.out.println("berumur " + age);
//         System.out.println("Memiliki nilai matematika: " + mathGrade);
//         System.out.println("Memiliki nilai bahasa Inggris: " + englishGrade);
//         System.out.println("Memiliki nilai ilmu pengetahuan: " + scienceGrade);
//         System.out.println("Memiliki nilai rata-rata " + getAverage());
//         System.out.println("Status Akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
//     }

//     private double getAverage() {
//         return (mathGrade + scienceGrade + englishGrade) / 3;
//     }

//     private boolean statusAkhir() {
//         return getAverage() >= 61;
//     }

//     public static int getJumlahObjek() {
//         return jumlahObjek;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan nama siswa: ");
//         String name = scanner.nextLine();

//         System.out.print("Masukkan alamat siswa: ");
//         String address = scanner.nextLine();

//         System.out.print("Masukkan umur siswa: ");
//         int age = scanner.nextInt();

//         System.out.print("Masukkan nilai matematika siswa: ");
//         double mathGrade = scanner.nextDouble();

//         System.out.print("Masukkan nilai bahasa Inggris siswa: ");
//         double englishGrade = scanner.nextDouble();

//         System.out.print("Masukkan nilai ilmu pengetahuan siswa: ");
//         double scienceGrade = scanner.nextDouble();

//         Student siswaBaru = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);

//         siswaBaru.displayMessage();

//         scanner.close();
//     }
// }

// no 5
// import java.util.Scanner;

// public class Student {
//     private static int jumlahObjek = 0;
//     private String nama;
//     private String alamat;
//     private int umur;
//     private double nilaiMatematika;
//     private double nilaiBahasaInggris;
//     private double nilaiIlmuPengetahuan;
//     private double rataRataNilai;

//     public Student() {
//         jumlahObjek++;
//     }

//     public Student(String nama, String alamat, int umur, double nilaiMatematika, double nilaiBahasaInggris, double nilaiIlmuPengetahuan) {
//         this.nama = nama;
//         this.alamat = alamat;
//         this.umur = umur;
//         this.nilaiMatematika = nilaiMatematika;
//         this.nilaiBahasaInggris = nilaiBahasaInggris;
//         this.nilaiIlmuPengetahuan = nilaiIlmuPengetahuan;
//         jumlahObjek++;
//     }

//     public void tampilkanInfo() {
//         System.out.println("Siswa dengan nama " + nama);
//         System.out.println("beralamat di " + alamat);
//         System.out.println("berumur " + umur);
//         System.out.println("Memiliki nilai matematika: " + nilaiMatematika);
//         System.out.println("Memiliki nilai bahasa Inggris: " + nilaiBahasaInggris);
//         System.out.println("Memiliki nilai ilmu pengetahuan: " + nilaiIlmuPengetahuan);
//         System.out.println("Memiliki nilai rata-rata " + hitungRataRata());
//         System.out.println("Status Akhir: " + (cekStatusAkhir() ? "Lolos" : "Remidi"));
//     }

//     private double hitungRataRata() {
//         return (nilaiMatematika + nilaiBahasaInggris + nilaiIlmuPengetahuan) / 3;
//     }

//     private boolean cekStatusAkhir() {
//         return hitungRataRata() >= 61;
//     }

//     public static int jumlahObjek() {
//         return jumlahObjek;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan nama siswa: ");
//         String nama = scanner.nextLine();

//         System.out.print("Masukkan alamat siswa: ");
//         String alamat = scanner.nextLine();

//         System.out.print("Masukkan umur siswa: ");
//         int umur = scanner.nextInt();

//         System.out.print("Masukkan nilai matematika siswa: ");
//         double nilaiMatematika = scanner.nextDouble();

//         System.out.print("Masukkan nilai bahasa Inggris siswa: ");
//         double nilaiBahasaInggris = scanner.nextDouble();

//         System.out.print("Masukkan nilai ilmu pengetahuan siswa: ");
//         double nilaiIlmuPengetahuan = scanner.nextDouble();

//         Student siswaBaru = new Student(nama, alamat, umur, nilaiMatematika, nilaiBahasaInggris, nilaiIlmuPengetahuan);

//         siswaBaru.tampilkanInfo();

//         System.out.println("Jumlah objek Student yang telah dibuat: " + jumlahObjek());

//         scanner.close();
//     }
// }

// soal student
// public class Student {
//     private static int jumlahObjek = 0; //menyimpan jumlah objek yang dibuat
//     private String name;
//     private String address;
//     private int age;
//     private double mathGrade;
//     private double englishGrade;
//     private double scienceGrade;
//     private double average;
//     public Student() { //awalan public student = seharusnya S nya besar public Student, harus sesuai nama kelas
//     name = "";
//     address = "";
//     age = 0;
//     }
//     public Student(String n, String a, int ag){
//     name = n;
//     address = a;
//     age = ag;
//     }

    
//     public Student(String n, String a, int ag, double math, double english, double science) {
//         this.name = n; //tambahin "this." untuk merujuk kepada variabel instance dari objek yang sedang dibuat.
//         this.address = a;
//         this.age = ag;
//         this.mathGrade = math;
//         this.englishGrade = english;
//         this.scienceGrade = science;
//         jumlahObjek++;
//     }
//     public static void jumlahObjek() {
//         System.out.println("Jumlah objek Student yang dibuat: " + jumlahObjek);
//     }

//     public void setName(String n){
//     name = n;
// }
// public void setAddress(String a){
//     address = a;
// }
// public void setAge(int ag){
//     age = ag;
// }
// public void setMath(int math){
//     mathGrade = math;
// }
// public void setEnglish(int english){
//     englishGrade = english;
// }
// public void setScience(int science){
//     scienceGrade = science;
// }
// private double getAverage(){
// // double result = 0;
// // result = (mathGrade+scienceGrade+englishGrade)/3;
// // return result;
// // }
// if ((mathGrade + scienceGrade + englishGrade) == 0) {
//     return 0; // Menghindari pembagian oleh nol
// }
// return (mathGrade + scienceGrade + englishGrade) / 3;
// }

// public boolean statusAkhir() {
//     return getAverage() >= 61;
// }

// public void displayMessage(){
// System.out.println("Siswa dengan nama "+name);
// System.out.println("beramalat di "+address);
// System.out.println("berumur "+age);
// System.out.println("Memiliki nilai matematika: " + mathGrade);
// System.out.println("Memiliki nilai bahasa Inggris: " + englishGrade);
// System.out.println("Memiliki nilai ilmu pengetahuan: " + scienceGrade);
// System.out.println("mempunyai nilai rata rata "+getAverage());

// if (statusAkhir()) {
//     System.out.println("Status Akhir: Lolos");
// } else {
//     System.out.println("Status Akhir: Remidi");
// }
// }
// }

