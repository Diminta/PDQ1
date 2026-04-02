import java.util.Scanner;
import java.text.DecimalFormat;

public class KasirInimaret {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        // Format angka untuk mata uang
        DecimalFormat kursIndonesia = new DecimalFormat("###,###.00");

        System.out.println("=== SISTEM KASIR INIMARET ===");

        // 1. Proses Input
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Total Belanja: Rp ");
        double totalBelanja = input.nextDouble();

        System.out.print("Apakah Pelanggan Member? (true/false): ");
        boolean isMember = input.nextBoolean();

        // 2. Variabel Penampung Diskon
        double persenDiskon = 0;

        // 3. Percabangan Nominal Belanja (If-Else If)
        if (totalBelanja > 300000) {
            persenDiskon = 10;
        } else if (totalBelanja > 100000) {
            persenDiskon = 5;
        }

        // 4. Percabangan Membership (If Tunggal)
        if (isMember) {
            persenDiskon += 2;
        }

        // 5. Perhitungan Akhir
        double nominalDiskon = (persenDiskon / 100) * totalBelanja;
        double totalAkhir = totalBelanja - nominalDiskon;

        // 6. Output Struk
        System.out.println("\n==============================");
        System.out.println("       STRUK INIMARET         ");
        System.out.println("==============================");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Status Member   : " + (isMember ? "Ya" : "Tidak"));
        System.out.println("Total Belanja   : Rp " + kursIndonesia.format(totalBelanja));
        System.out.println("Total Diskon    : " + (int)persenDiskon + "%");
        System.out.println("Potongan Harga  : Rp " + kursIndonesia.format(nominalDiskon));
        System.out.println("------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + kursIndonesia.format(totalAkhir));
        System.out.println("==============================");
        
        input.close();
    }
}