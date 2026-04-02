import java.util.Scanner;
public class Latihan {
public static void main (String[] args){
    System.out.println("halo world");
    //silahkan scanner
Scanner input = new Scanner(System.in);
//tanya nama
System.out.println("masukkan nama Anda: ");
String nama = input.nextLine();
System.out.println("masukkan umur");
int umur = input.nextInt();
System.out.println("Halo " + nama + ", Selamat belajar java! Umur Anda " +umur);
System.out.println("Sekarang Belajar Perhitungan");
double sisi = input.nextDouble();
double luas = sisi * sisi;
System.out.println(sisi);

input.close();

}
    
}
