public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Laptop", 1, 800);
        Invoice invoice2 = new Invoice("Mouse", 3, 20);

        Invoice[] invoices = {invoice1, invoice2};

        Employee employee = new Employee(12345, "John Doe", 2000, invoices);

        System.out.println("Informasi Karyawan:");
        System.out.println("Nomor Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Nama: " + employee.getName());
        System.out.println("Gaji Per Bulan: $" + employee.getSalaryPerMonth());

        System.out.println("\nDetail Belanja:");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Nama Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga Per Item: $" + invoice.getPricePerItem());
            System.out.println("Total Harga: $" + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("Total Gaji Setelah Potongan Belanja: $" + employee.getPayableAmount());
    }
}
