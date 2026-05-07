import java.util.Scanner;
public class Loopingfor {
    public static void main (String[] args){
     Scanner input = new Scanner(System.in);
     String[] nama = new String[100];
     int[] nilai = new int[100];
     int i = 0;
     int w = 0;
     char ulang;
     do{
     System.out.println("=======================");
     System.out.println("Program Survei Workshop");
     System.out.print("Masukkan Nama:");
     nama[i] = input.nextLine();
     System.out.println("=======================");
      System.out.print("Masukkan Nilai Kepuasan:");
      nilai[i] = input.nextInt();
      System.out.println("1- Tidak Puas");
      System.out.println("2 - Kurang Puas");
      System.out.println("3 - Biasa");
      System.out.println("4 - Puasa");
      System.out.println("5 - Sangat Puas");
      nilai[i] = input.nextInt();
System.out.print("Masih ada peserta lain? (Y/y): ");
ulang = input.next().charAt(0);
     }while (ulang == 'Y' || ulang == 'y');


     //Hasil
     System.out.println("\n=== HASIL SURVEI ===");
     for (int j = 0; j < i; j++){
        System.out.println("\n=== HASIL SURVEI ===");
System.out.println((j + 1) + "." + nama[j] + "- Nilai " + nilai[j]);
     }
        input.close   ();
    }
}