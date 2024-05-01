
// testcases untuk manusia
// public class TestCases {
//     public static void main(String[] args) {

//         manusia lakiLakiMenikah = new manusia("John Doe", true, "1234567890", true);
//         manusia perempuanMenikah = new manusia("Jane Doe", false, "1234567890", true);
//         manusia belumMenikah = new manusia("Alex Smith", true, "1234567890", false);

//         System.out.println("Test Cases for Manusia:");
//         System.out.println("a. Laki-laki telah menikah:\n" + lakiLakiMenikah.toString());
//         System.out.println("b. Perempuan telah menikah:\n" + perempuanMenikah.toString());
//         System.out.println("c. Belum menikah:\n" + belumMenikah.toString());
//     }
// }

// // testcases untuk mahasaiswafilkom
// public class TestCases {
//     public static void main(String[] args) {

//         MahasiswaFILKOM ipkKurangDari3 = new MahasiswaFILKOM("John", true, "1234567890", true, "165150100000000", 2.5);
//         MahasiswaFILKOM ipk3_35 = new MahasiswaFILKOM("Doe", false, "1234567890", true, "165150200000000", 3.2);
//         MahasiswaFILKOM ipk3_54 = new MahasiswaFILKOM("Jane", true, "1234567890", false, "165150300000000", 3.8);

//         System.out.println("\nTest Cases for MahasiswaFilkom:");
//         System.out.println("a. IPK < 3:\n" + ipkKurangDari3.toString());
//         System.out.println("b. IPK 3 - 3.5:\n" + ipk3_35.toString());
//         System.out.println("c. IPK 3.5 - 4:\n" + ipk3_54.toString());
//     }
// }

// test cases untuk pekerja
// public class TestCases {
//     public static void main(String[] args) {

//         Pekerja pekerja1 = new Pekerja("John", true, "1234567890", true, 4000, LocalDate.now().minusYears(2), 2);
//         Pekerja pekerja2 = new Pekerja("Doe", false, "1234567890", true, 6000, LocalDate.now().minusYears(9), 0);
//         Pekerja pekerja3 = new Pekerja("Jane", true, "1234567890", false, 8000, LocalDate.now().minusYears(20), 10);

//         System.out.println("\nTest Cases for Pekerja:");
//         System.out.println("a. Lama bekerja 2 tahun, anak 2:\n" + pekerja1.toString());
//         System.out.println("b. Lama bekerja 9 tahun:\n" + pekerja2.toString());
//         System.out.println("c. Lama bekerja 20 tahun, anak 10:\n" + pekerja3.toString());
//     }
// }

// test cases untuk manager
public class TestCases {
    public static void main(String[] args) {
        
        Manager manager = new Manager("John Manager", true, "1234567890", true, 7500, LocalDate.now().minusYears(15), 0, "IT Department");

        System.out.println("\nTest Case for Manager:");
        System.out.println("Manager, lama bekerja 15 tahun dengan gaji $7500:\n" + manager.toString());
    }
}


