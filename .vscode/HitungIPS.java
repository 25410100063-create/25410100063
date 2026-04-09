import java.util.Scanner;

public class HitungIPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("===========");
        System.out.println(" Program Hitung IPS Sederhana ");
        
        // 1. Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        System.out.println("Masukkan Nama");
        String nama = input.nextLine();
        System.out.println("Masukkan Prodi");
String prodi = input.nextLine();
        double totalPoin = 0;
        int totalSKS = 0;

        // 2. Perulangan untuk input tiap matkul
        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            
            System.out.print("SKS: ");
            int sks = input.nextInt();
            
            System.out.print("Nilai Angka (4.0, 3.5, 3.0, dst): ");
            double bobot = input.nextDouble();

            // Hitung poin per matkul dan tambahkan ke total
            totalPoin += (sks * bobot);
            totalSKS += sks;
        }

        // 3. Hitung IPS
        double ips = totalPoin / totalSKS;

        // 4. Cek Beban SKS Maksimal (IF-ELSE)
        int bebanSksMaks;
        if (ips >= 3.50) {
            bebanSksMaks = 24;
        } else if (ips >= 3.00) {
            bebanSksMaks = 22;
        } else if (ips >= 2.00) {
            bebanSksMaks = 20;
        } else {
            bebanSksMaks = 18;
        }

        // 5. Output Hasil
        System.out.println("\n============================");
        System.out.println(nama);
        System.out.println(prodi);
        System.out.printf("IPS Semester ini: %.2f\n", ips);
        System.out.println("Beban SKS Maksimal Anda: " + bebanSksMaks);
        System.out.println("============================");
    }
}
    
    
