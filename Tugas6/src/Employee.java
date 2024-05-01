// import java.util.*;
// public class Employee {
//     private String name;
//     private double salary;
//     private Date hireday;
//     public Employee(String name, double salary, int year,int month, int day){
//         this.name = name;
//         this.salary = salary;
//         GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
//         this.hireday = calendar.getTime();
//     }
//     public Date getHireDay(){
//         return hireday;
//     }
//     public String getName(){
//         return name;
//     }
//     public double getSalary(){
//         return salary;
//     }
//     public void raiseSalary(double byPercent){
//         double raise = salary * byPercent/100;
//         salary+=raise;
//     }
// }

// no 6
// import java.util.*;

// public class Employee {
//     private String name;
//     private double salary;
//     private Date hireday;

//     public Employee(String name) {
//         this.name = name;
//         this.salary = 0;
//         this.hireday = new Date();
//     }
//     public Employee(String name, double salary, int year, int month, int day) {
//         this(name);
//         this.salary = salary;
//         GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
//         this.hireday = calendar.getTime();
//     }

//     public Date getHireDay() {
//         return hireday;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void raiseSalary(double byPercent) {
//         double raise = salary * byPercent / 100;
//         salary += raise;
//     }
// }

// no 8 private
// import java.util.*;

// public class Employee {
//     private String name;
//     private double salary;
//     private Date hireday;

//     public Employee(String name) {
//         this.name = name;
//         this.salary = 0;
//         this.hireday = new Date();
//     }

//     private Date getHireDay() {
//         return hireday;
//     }

//     private String getName() {
//         return name;
//     }

//     private double getSalary() {
//         return salary;
//     }

//     private void raiseSalary(double byPercent) {
//         double raise = salary * byPercent / 100;
//         salary += raise;
//     }
// }

// no 8 protcted
import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
        this.hireday = new Date();
    }

    protected Date getHireDay() {
        return hireday;
    }

    protected String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }

    protected void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

