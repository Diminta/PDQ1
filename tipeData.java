import java.util.Scanner; // 1. Wajib ada untuk bisa terima input

public class tipeData {
    public static void main(String[] args) {
        // 2. Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("=== FORM INPUT TOKO SMART MERR ===");

        // --- PROSES INPUT ---
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine(); // Mengambil input teks

        System.out.print("Masukkan Harga Barang: ");
        int hargaBarang = input.nextInt(); // Mengambil input angka bulat

        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = input.nextInt(); // Mengambil input angka bulat

        // --- PROSES PERHITUNGAN ---
        int totalBayar = hargaBarang * jumlahBeli;

        // --- PROSES OUTPUT (NOTA) ---
        System.out.println("\n----------------------------");
        System.out.println("--- NOTA TOKO SMART MERR ---");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp " + hargaBarang);
        System.out.println("Jumlah      : " + jumlahBeli);
        System.out.println("----------------------------");
        System.out.println("TOTAL BAYAR : Rp " + totalBayar);
        System.out.println("----------------------------");
        
        input.close(); // Menutup scanner
    }
}