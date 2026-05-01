import java.util.Scanner;

public class Inimaret {
    public static void main (String[]args) {
        //progam
        Scanner input = new Scanner (System.in);
        char ulang;
        do{
         System.out.println("===============================");
         System.out.println("Selamat Datang Di Toko Seperpat");
         System.out.println("===============================");
         System.out.println("Daftar Menu");
         System.out.println("1. V-belt");
         System.out.println("2. Karbu");
         System.out.println("3. Busi");
         System.out.println("===============================");
         System.out.print("Pilih Menu: ");
          int pilih = input.nextInt();
          int harga = 0;
if (pilih == 1) {
    System.out.print("V-belt :");
    System.out.println(" 200.000,00");
    harga = 20000000;
}else if (pilih == 2) {
System.out.print("Karbu :");
System.out.println(" 75.000,00");
harga = 7500000;
}else if (pilih == 3) {
    System.out.print("Busi :");
    System.out.println(" 12.000,00");
    harga = 1200000;
}else {
    System.out.println("Pilihan Tidak Terdaftar");
}
System.out.print("Beli Berapa: ");
int jumlah = input.nextInt();
int Total = jumlah * harga;
System.out.println("===============================");
System.out.println ("Jumlah : "+ jumlah);
System.out.println("Total Harga : " +Total);
System.out.println("===============================");
System.out.print("Ulang? (y/n):");
ulang = input.nex().charAt(0);
        }while(ulang == 'y');
    }
}