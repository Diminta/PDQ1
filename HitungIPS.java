import java.util.Scanner;

public class HitungIPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("  Program Penghitung IPS & SKS Maksimal");
        
        // Input Data Mahasiswa
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan jumlah mata kuliah semester ini: ");
        int jumlahMK = input.nextInt();
        
        double totalNilaiKaliSks = 0;
        int totalSKS = 0;
        
        // Loop untuk memasukkan nilai dan SKS setiap mata kuliah
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Masukkan Nilai Huruf (A/B/C/D/E): ");
            String nilaiHuruf = input.next().toUpperCase();
            
            System.out.print("Masukkan bobot SKS: ");
            int sks = input.nextInt();
            
            // Konversi nilai huruf ke angka
            double bobotNilai = 0;
            switch (nilaiHuruf) {
                case "A": bobotNilai = 4.0; break;
                case "B": bobotNilai = 3.0; break;
                case "C": bobotNilai = 2.0; break;
                case "D": bobotNilai = 1.0; break;
                case "E": bobotNilai = 0.0; break;
                default:
                    System.out.println("Format nilai salah, dianggap 0.");
                    bobotNilai = 0.0;
            }
            
            totalNilaiKaliSks += (bobotNilai * sks);
            totalSKS += sks;
        }
        
        // Menghitung IPS
        double ips = 0;
        if (totalSKS > 0) {
            ips = totalNilaiKaliSks / totalSKS;
        }
        
        // Menentukan Maksimal SKS
        int sksMaksimal = 0;
        if (ips >= 3.50) {
            sksMaksimal = 24;
        } else if (ips >= 3.00 && ips < 3.50) {
            sksMaksimal = 22;
        } else if (ips >= 2.00 && ips < 3.00) {
            sksMaksimal = 20;
        } else {
            sksMaksimal = 18;
        }

        // Menentukan Predikat Kelulusan
        String predikat;
        if (ips >= 3.50) {
            predikat = "Sangat Baik";
        } else if (ips >= 3.00) {
            predikat = "Baik";
        } else if (ips >= 2.00) {
            predikat = "Cukup";
        } else {
            predikat = "Kurang";
        }
        
        // Menampilkan Hasil Akhir
        System.out.println("                 HASIL AKHIR                 ");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("---------------------------------------------");
        System.out.println("Total SKS yang diambil : " + totalSKS);
        System.out.printf("Indeks Prestasi Semester (IPS) : %.2f\n", ips);
        System.out.println("Predikat : " + predikat);
        System.out.println("Beban Belajar Maksimal (SKS) yang dapat diambil semester depan: " + sksMaksimal + " SKS");
        System.out.println("=============================================");
        
        input.close();
    }
}