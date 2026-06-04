public class Inimaret {
    public static void main(String[] args) {
        
        String[] namaCabang = {"Cabang Rungkut ", "Cabang Sukolilo", "Cabang Gubeng  "};
        String[] hari = {"Senin", "Selasa", "Rabu"};

        // Array 2D menyimpan angka omset (3 Cabang x 3 Hari)
        int[][] penjualan = {
            {1500000, 2000000, 1800000}, // Baris 0: Rungkut (Senin, Selasa, Rabu)
            {900000,  1200000, 1100000}, // Baris 1: Sukolilo
            {2100000, 2500000, 2300000}  // Baris 2: Gubeng
        };

        System.out.println("=================================================================");
        System.out.println("                 LAPORAN OMSET TOKO JAYA ABADI                   ");
        System.out.println("=================================================================");
        
        // Cetak judul hari di atas
        System.out.print("Nama   Cabang\t\t");
        for (int h = 0; h < hari.length; h++) {
            System.out.print(hari[h] + "\t\t");
        }
        System.out.println("\n-----------------------------------------------------------------");

        // Looping untuk membongkar Array 2D
        for (int i = 0; i < penjualan.length; i++) {
            
            // Cetak nama cabang di awal baris
            System.out.print(namaCabang[i] + "\t\t");
            
            int totalOmsetCabang = 0; // Variabel untuk menampung total omset 3 hari

            for (int j = 0; j < penjualan[i].length; j++) {
                // Cetak omset per hari
                System.out.print(penjualan[i][j] + "\t\t");
                
                // Tambahkan omset hari ini ke total cabang
                totalOmsetCabang = totalOmsetCabang + penjualan[i][j];
            }
            
            // Cetak total omset di pojok setelah hari Rabu selesai
            System.out.println(" | Total: Rp " + totalOmsetCabang);
        }
        System.out.println("=================================================================");
    }
}