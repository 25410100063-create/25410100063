import  java.util.Scanner;
public class Latihanscanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.print("Masukkan harga Barang 1");
    int harga = input.nextInt();
    System.out.print("Masukkan harga barang 2 ");
    int harga2 = input.nextInt();
    int total = harga + harga2;
    System.out.print(total);
    input.nextLine();
    //if daftar member
    System.out.println("apakah mau daftar member?");
        String daftar = input.nextLine();
if (daftar.equalsIgnoreCase("ya")){
    System.out.println("Kamu jadi member");
    int diskon = total - 20;
    System.out.println(diskon);
}
else{ System.out.println("Anda gk daftar member");
    System.out.println("Gak daftar");
}

    input.close();
    }
}

