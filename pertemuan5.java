import java.util.Scanner;

public class Inimaret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
System.out.print("Nama: Achmad Naufal Zaidan M");
System.out.print("Nim : 25410100063");
        do {
            System.out.println("\n=== Selamat Datang di Inimaret ===");
            
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int jumlahBarang = input.nextInt();
            
            double totalBelanja = 0;

            // Menggunakan FOR untuk input barang sesuai jumlah
            for (int i = 1; i <= jumlahBarang; i++) {
                System.out.println("\nBarang ke-" + i);
                input.nextLine(); // Membersihkan buffer
                
                System.out.print("Nama Barang  : ");
                String nama = input.nextLine();
                
                System.out.print("Harga Barang : ");
                double harga = input.nextDouble();
                
                totalBelanja += harga;
            }

            // Output Akhir Transaksi
            System.out.println("\n-----------------------------");
            System.out.println("Total Belanja : Rp " + totalBelanja);
            System.out.println("-----------------------------");

            // Tanya user apakah ingin mengulang transaksi lagi
            System.out.print("Apakah ada transaksi lain? (ya/tidak): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y'); // Mengulang jika input 'y'

        System.out.println("Terima kasih telah menggunakan layanan Inimaret!");
        input.close();
    }
}