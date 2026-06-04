import java.util.Scanner;

public class TugasProcedure{

    // LATIHAN NOMOR 1: Cetak Garis Pemisah sampe 30 Karakter '='
    public static void Garis() {
        for (int i = 1; i <= 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // LATIHAN NOMOR 2: Tampilkan Kartu Mahasiswa (Pake \n) Di Suruh MAMA
    public static void tampilkanMahasiswa(String nama, String nim, double ipk) {
                 Garis();             
         System.out.println("KARTU MAHASISWA"  ); 
                 Garis();
        System.out.print (" Nama\t: " + nama + "\n" +
                         " NIM\t: " + nim + "\n" +
                         " IPK\t: " + ipk + "\n" );
                         Garis();
    }

    // LATIHAN NOMOR 3: Cetak Tabel Perkalian Sampai 10
    public static void Perkalian(int angka) {
        Garis();
        System.out.println("  TABEL PERKALIAN ANGKA " + angka);
        Garis();
        for (int i = 1; i <= 10; i++) {
            int hasil = i * angka;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
        Garis();
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memanggil nomor satu (Cetak Garis)
        Garis();
        System.out.println();

        // Mengambil input user untuk nomor dua dan tiga
        System.out.println("--- INPUT DATA USER ---");
        System.out.print("Masukkan Nama: ");
        String namaUser = input.nextLine();
        
        System.out.print("Masukkan NIM : ");
        String nimUser = input.nextLine();
        
        System.out.print("Masukkan IPK : ");
        double ipkUser = input.nextDouble();
        
        System.out.println();
        Garis();
        System.out.print("Masukkan Angka Perkalian: ");
        int angkaPerkalian = input.nextInt();

        // Memanggil nomor dua dan tiga untuk menampilkan hasil
        tampilkanMahasiswa(namaUser, nimUser, ipkUser);
        Perkalian(angkaPerkalian);

        input.close();
    }
}