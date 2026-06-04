import java.util.Scanner;

public class PemesananTiketZoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi array 1 dimensi (asumsi menampung 5 kategori tiket)
        String[] kategori = new String[5];
        double[] harga = new double[5];
        int[] jumlahBeli = new int[5];
        
        int menu;
        int dataCount = 0; // Untuk melacak jumlah kategori yang sudah diinput

        do {
            System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (menu) {
                case 1:
                    System.out.print("Berapa kategori tiket yang ingin diinput? ");
                    dataCount = input.nextInt();
                    input.nextLine();
                    
                    for (int i = 0; i < dataCount; i++) {
                        System.out.println("Data ke-" + (i + 1));
                        System.out.print("Nama Kategori: ");
                        kategori[i] = input.nextLine();
                        System.out.print("Harga Tiket: ");
                        harga[i] = input.nextDouble();
                        input.nextLine();
                    }
                    break;

                case 2:
                    if (dataCount == 0) {
                        System.out.println("Silakan input kategori di menu 1 terlebih dahulu!");
                    } else {
                        for (int i = 0; i < dataCount; i++) {
                            System.out.print("Jumlah beli untuk " + kategori[i] + ": ");
                            jumlahBeli[i] = input.nextInt();
                        }
                    }
                    break;

                case 3:
                    if (dataCount == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        double grandTotal = 0;
                        System.out.println("\n--- Rincian Pembayaran ---");
                        for (int i = 0; i < .length; i++) {
                            double subTotal = harga[i] * jumlahBeli[i];
                            System.out.println(kategori[i] + " x " + jumlahBeli[i] + " = Rp " + subTotal);
                            grandTotal += subTotal;
                        }
                        System.out.println("--------------------------");
                        System.out.println("Total Keseluruhan: Rp " + grandTotal);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 4);

        input.close();
    }
}