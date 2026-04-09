import java.util.ArrayList;
import java.util.Scanner;
 
public class looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menggunakan ArrayList agar jumlah barang dinamis (bisa > 5 tanpa batas fix)
        ArrayList<String> daftarBarang = new ArrayList<>();
        ArrayList<Integer> daftarHarga = new ArrayList<>();
        ArrayList<Integer> daftarJumlah = new ArrayList<>();
        ArrayList<Integer> daftarSubTotal = new ArrayList<>();

        double totalBelanja = 0;
        String lanjut;

        System.out.println("    Sistem Entri Penjualan INIMARET    ");

        // 1. Fitur Entri Data Penjualan (dengan perulangan)
        do {
            System.out.print("Masukkan nama barang  : ");
            String nama = input.nextLine();

            System.out.print("Masukkan harga barang : Rp ");
            int harga = input.nextInt();

            System.out.print("Masukkan jumlah beli  : ");
            int jumlah = input.nextInt();
            input.nextLine(); // Membersihkan buffer newline agar tidak error saat looping

            int subTotal = harga * jumlah;
            totalBelanja += subTotal;

            // Menyimpan data ke list
            daftarBarang.add(nama);
            daftarHarga.add(harga);
            daftarJumlah.add(jumlah);
            daftarSubTotal.add(subTotal);

            // Validasi perulangan
            System.out.print("\nTambah barang lagi? (y/t): ");
            lanjut = input.nextLine();
            System.out.println("---------------------------------------");

        } while (lanjut.equalsIgnoreCase("y"));

        // 2. Fitur Print Data & Total Belanja
        System.out.println("        STRUK BELANJA INIMARET         ");
        
        for (int i = 0; i < daftarBarang.size(); i++) {
            // Format print agar sejajar dan rapi
            System.out.printf("%-15s %2d x %-7d = Rp %d\n", 
                    daftarBarang.get(i), 
                    daftarJumlah.get(i), 
                    daftarHarga.get(i), 
                    daftarSubTotal.get(i));
        }
        
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL BELANJA                  = Rp %.0f\n", totalBelanja);
        System.out.println("      Terima kasih telah berbelanja!   ");

        input.close();
    }
}