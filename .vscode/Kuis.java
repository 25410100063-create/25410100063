import java.util.Scanner;
public class Kuis {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String[] nama = new String[100];
        int[] nilai = new int[100];

        int i=0;
        char ulang;

    //perulangan
    do{
        System.out.print("Masukkan Nama Anda");
        nama [i] = input.nextLine();
        System.out.print("Masukkan Nilai");
        nilai[i] = input.nextInt();
System.out.print("Apakah Masi Ada Peserta Lagi (Y/y)");
ulang = input.next().charAt(0);

    }while (ulang == 'Y' || ulang == 'y' );

    System.out.println("==== Hasil Penilaian ====");
    
        System.out.println((i + 1) + "." + nama[i]+"- Nilai: " + nilai[i]);
    
    System.out.print("Total Peserta "+i);
    input.close();
    }

     
}

    

    
    
