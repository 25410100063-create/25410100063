 import java.util.Scanner;

public class Mencarinilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;

        // 1. Meminta input jumlah data (minimal 5)
        do {
            System.out.print("Masukkan jumlah data (minimal 5): ");
            jumlahData = input.nextInt();
            if (jumlahData < 5) {
                System.out.println("Peringatan: Jumlah data minimal harus 5!");
            }
        } while (jumlahData < 5);

        // 2. Deklarasi array 1 dimensi
        int[] dataArray = new int[jumlahData];

        // 3. Mengisi data ke dalam array
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            dataArray[i] = input.nextInt();
        }

        // 4. Algoritma mencari nilai terendah dan indeksnya
        int nilaiTerendah = dataArray[0];
        int indeksTerendah = 0;

        for (int i = 1; i < dataArray.length; i++) {
            if (dataArray[i] < nilaiTerendah) {
                nilaiTerendah = dataArray[i];
                indeksTerendah = i;
            }
        }

        // 5. Menampilkan hasil
        System.out.println("\n--- Hasil ---");
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Posisi Indeks  : " + indeksTerendah);
        
        input.close();
    }
}

