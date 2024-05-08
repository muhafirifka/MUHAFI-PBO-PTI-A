// // public abstract class Employee {
// //     private String name;
// //     private String noKTP;
// //     public Employee(String name, String noKTP){
// //         this.name = name;
// //         this.noKTP = noKTP;
// //     }
// //     public String getName(){
// //         return name;
// //     }
// //     public String getNoKTP(){
// //         return noKTP;
// //     }
// //     public String toString(){
// //         return String.format(" "+getName()+"\nNo. KTP:"+getNoKTP());
// //     }
// //     public abstract double earnings();//pendapatan
// // }

// // no3
// public abstract class Employee {
//     private String name;
//     private String noKTP;

//     public Employee(String name, String noKTP) {
//         this.name = name;
//         this.noKTP = noKTP;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getNoKTP() {
//         return noKTP;
//     }

//     public String toString() {
//         return String.format("Name: %s\nNo. KTP: %s", getName(), getNoKTP());
//     }

//     public abstract double earnings(); // Pendapatan
// }


// // no 4
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// public abstract class Employee {
//     private String name;
//     private String noKTP;
//     private LocalDate birthDate;

//     public Employee(String name, String noKTP, LocalDate birthDate) {
//         this.name = name;
//         this.noKTP = noKTP;
//         this.birthDate = birthDate;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getNoKTP() {
//         return noKTP;
//     }

//     public LocalDate getBirthDate() {
//         return birthDate;
//     }

//     public void setBirthDate(LocalDate birthDate) {
//         this.birthDate = birthDate;
//     }

//     public String toString() {
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//         return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), formatter.format(getBirthDate()));
//     }

//     public abstract double earnings(); // Pendapatan

//     // Method untuk mengecek apakah bulan ini adalah ulang tahun
//     public boolean isBirthdayMonth() {
//         LocalDate today = LocalDate.now();
//         return today.getMonth() == birthDate.getMonth();
//     }
// }

// // no 5
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class EmployeeProduction extends Employee {
    private double wagePerItem;
    private int itemsProduced;

    public EmployeeProduction(String name, double salary, double wagePerItem, int itemsProduced) {
        super(name, salary);
        this.wagePerItem = wagePerItem;
        this.itemsProduced = itemsProduced;
    }

    public double calculateSalary() {
        return itemsProduced * wagePerItem + super.calculateSalary();
    }
}
