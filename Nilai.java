import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = input.nextInt();

        double totalPoin = 0;
        int totalSKS = 0;

        for (int i = 1; i <= jmlMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Masukkan bobot SKS: ");
            int sks = input.nextInt();
            
            System.out.print("Masukkan nilai angka (0.0 - 4.0): ");
            double nilai = input.nextDouble();

            totalPoin += (nilai * sks);
            totalSKS += sks;
        }

        double ips = totalPoin / totalSKS;
        int bebanSKS;

        // Logika penentuan SKS sesuai tabel tugas
        if (ips >= 3.50) {
            bebanSKS = 24;
        } else if (ips >= 3.00) {
            bebanSKS = 22;
        } else if (ips >= 2.00) {
            bebanSKS = 20;
        } else {
            bebanSKS = 18;
        }

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("IPS Anda: %.2f\n", ips);
        System.out.println("Beban SKS maksimal semester depan: " + bebanSKS);
    }
}