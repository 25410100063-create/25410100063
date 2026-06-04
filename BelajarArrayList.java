import java.util.ArrayList;
import java.util.Scanner;
public class BelajarArrayList {
public static void main(String[] args) {

Scanner input = new Scanner (System.in);
ArrayList<String> siswa = new ArrayList<>();
ArrayList<Integer> nilai = new ArrayList<>();

System.out.println("==============================");
System.out.println("         PROGRAM SISWA        ");
System.out.println("  KETIK 'STOP' JIKA BERHENTI  ");
System.out.println("==============================");

while (true) {
    System.out.print("Masukkan Nama Siswa\t: ");
    String nama = input.nextLine();
    if (nama.equalsIgnoreCase("stop")){
    break;//keluar dari if
}
    System.out.print("Masukkan nilai Siswa\t: ");
    int nilaisiswa = input.nextInt();
      input.nextLine();


    siswa.add(nama);
    nilai.add(nilaisiswa);
}
System.out.println("==============================");
System.out.println("             HASIL            ");
System.out.println("==============================");
for(int i=0; i<siswa.size(); i++){
System.out.println("Siswa ke "+(i+1)+" : "+siswa.get(i));
System.out.println("nilainya   "+": "+nilai.get(i));
}
String pilih = input.nextLine();
if(pilih=="ya"){
System.out.println("\n=== FITUR EDIT NILAI ===");
System.out.print("Masukkan nomor urut siswa yang mau diganti nilainya: ");
int nomorSiswa = input.nextInt();
int indeksYangDicari = nomorSiswa - 1; // Dikurangi 1 karena indeks komputer mulai dari 0

System.out.print("Masukkan NILAI BARU: ");
int nilaiBaru = input.nextInt();
input.nextLine(); // Bersihkan buffer enter

// Proses mengganti nilai di dalam ArrayList memakai .set()
nilai.set(indeksYangDicari, nilaiBaru);

System.out.println("Data berhasil diperbarui!");}
input.close();
}
}