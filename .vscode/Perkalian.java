import  java.util.Scanner;
public class Perkalian {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("apakah mau daftar member? (ya/tidak) ");
        String daftar = input.nextLine();
if (daftar.equalsIgnoreCase("ya")){
    System.out.println("Kamu jadi member");
}
else{ System.out.println("Anda gk daftar member");}
input.close();
    }
}