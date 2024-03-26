package InstanceMethod;

// soal
// public class Rasional{
//     private int pembilang, penyebut;
//     public Rasional(){
//     pembilang=0;
//     penyebut=0;
//     }
//     public Rasional(int pbl, int pyb){
//     pembilang=pbl;
//     penyebut=pyb;
//     }
//     //mengecek suatu bilangan adalah rasional atau bukan
//     public boolean isRasional(){
//     return (penyebut!= 0);
//     }
//     //menyederhanakan bilangan rasional
//     public void Sederhana(){
//     int temp, A, B;
//     if (penyebut ==0){
//     return;
//     }
//     A = (pembilang<penyebut) ? penyebut:pembilang;
//     B = (pembilang<penyebut) ? pembilang:penyebut;

//     while (B != 0){
//     temp= A % B;
//     A = B;
//     B = temp;
//     }

//     pembilang /=A;
//     penyebut /=A;
//     }
//     public double Cast(){
//     return (penyebut==0.0) ? 0.0 : (double)pembilang /
//     (double)penyebut;
//     }
//     //oprator >
//     public boolean moreThan (Rasional A){
//     return (pembilang * A.penyebut > penyebut * A.pembilang);
//     }
//     //operator Unary- ---> A = -A
//     public void negasi(){
//     pembilang = - pembilang;
//     }
//     //operator unary += \
//     public void unaryPlus(Rasional A){
//     pembilang = pembilang * A.penyebut + penyebut *
//     A.pembilang;
//     penyebut *=A.penyebut;
//     }
//     public void cetak(){
//     System.out.println(pembilang + "/" + penyebut);
//     }
//     }

// no 2
// public class Rasional {
//     private int pembilang, penyebut;

//     public Rasional() {
//         pembilang = 0;
//         penyebut = 0;
//     }

//     public Rasional(int pbl, int pyb) {
//         pembilang = pbl;
//         penyebut = pyb;
//     }

//     public boolean lessThan(Rasional A) {
//         return (pembilang * A.penyebut < penyebut * A.pembilang);
//     }

//     public boolean lessThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut <= penyebut * A.pembilang);
//     }

//     public boolean greaterThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut >= penyebut * A.pembilang);
//     }
// }

// no 3
// public class Rasional {
//     private int pembilang, penyebut;

//     public Rasional() {
//         pembilang = 0;
//         penyebut = 0;
//     }

//     public Rasional(int pbl, int pyb) {
//         pembilang = pbl;
//         penyebut = pyb;
//     }

//     public boolean lessThan(Rasional A) {
//         return (pembilang * A.penyebut < penyebut * A.pembilang);
//     }

//     public boolean lessThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut <= penyebut * A.pembilang);
//     }

//     public boolean greaterThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut >= penyebut * A.pembilang);
//     }

//     public int factorial(int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= i;
//         }
//         return result;
//     }
// }

// no 4
// public class Rasional {
//     private int pembilang, penyebut;

//     public Rasional() {
//         pembilang = 0;
//         penyebut = 0;
//     }

//     public Rasional(int pbl, int pyb) {
//         pembilang = pbl;
//         penyebut = pyb;
//     }

//     public boolean lessThan(Rasional A) {
//         return (pembilang * A.penyebut < penyebut * A.pembilang);
//     }

//     public boolean lessThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut <= penyebut * A.pembilang);
//     }

//     public boolean greaterThanOrEqual(Rasional A) {
//         return (pembilang * A.penyebut >= penyebut * A.pembilang);
//     }

//     // Method untuk penjumlahan
//     public Rasional tambah(Rasional A) {
//         int newPembilang = (pembilang * A.penyebut) + (penyebut * A.pembilang);
//         int newPenyebut = penyebut * A.penyebut;
//         return new Rasional(newPembilang, newPenyebut);
//     }

//     // Method untuk pengurangan
//     public Rasional kurang(Rasional A) {
//         int newPembilang = (pembilang * A.penyebut) - (penyebut * A.pembilang);
//         int newPenyebut = penyebut * A.penyebut;
//         return new Rasional(newPembilang, newPenyebut);
//     }

//     // Method untuk perkalian
//     public Rasional kali(Rasional A) {
//         int newPembilang = pembilang * A.pembilang;
//         int newPenyebut = penyebut * A.penyebut;
//         return new Rasional(newPembilang, newPenyebut);
//     }

//     // Method untuk pembagian
//     public Rasional bagi(Rasional A) {
//         int newPembilang = pembilang * A.penyebut;
//         int newPenyebut = penyebut * A.pembilang;
//         return new Rasional(newPembilang, newPenyebut);
//     }
// }

