import java.util.Scanner;
public class Perkalian {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("===Menghitung===");
        System.out.println("   Masukkan Angka 1   ");
        int x = input.nextInt();
System.out.println("   Masukkan Angka   ");
int y = input.nextInt();
int z = x * y;
System.out.println(z);


        input.close();
    }
}