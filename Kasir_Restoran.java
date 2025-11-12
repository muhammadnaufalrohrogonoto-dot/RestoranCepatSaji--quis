import java.util.Scanner;

public class Kasir_Restoran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan, jumlah;
            double total = 0;
            String ulang;
            System.out.println("=== Restoran Cepat Saji ===");
            do {
                System.out.println("\nNama Menu:");
                System.out.println("1. Paket A Ayam+Nasi  - Rp 350000");
                System.out.println("2. Paket B    - Rp 500000");
                System.out.println("3. Paket C     - Rp 700000");
                System.out.println("4. Paket D      - Rp 800000");
                System.out.println("5. Paket E - Rp 150000");
                System.out.print("Pilih barang (1-5): ");
                pilihan = input.nextInt();
                
                System.out.print("Masukkan jumlah: ");
                jumlah = input.nextInt();
                
                switch (pilihan) {
                    case 1:
                        total += 350000 * jumlah;
                        System.out.println("Anda membeli Paket A Nasi+Ayam x" + jumlah);
                        break;
                    case 2:
                        total += 500000 * jumlah;
                        System.out.println("Anda membeli Paket B x" + jumlah);
                        break;
                    case 3:
                        total += 700000 * jumlah;
                        System.out.println("Anda membeli Paket C x" + jumlah);
                        break;
                    case 4:
                        total += 800000 * jumlah;
                        System.out.println("Anda membeli Paket D x" + jumlah);
                        break;
                    case 5:
                        total += 150000 * jumlah;
                        System.out.println("Anda membeli Paket E x" + jumlah);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
                
                System.out.print("\nApakah ingin belanja lagi? (y/n): ");
                ulang = input.next();
                
            } while (ulang.equalsIgnoreCase("y"));
            
            double diskon = 150000;
            if (total > 150000) {
                diskon = total * 0.1; // 
                System.out.println("\nSelamat! Anda mendapat diskon 15%");
            }   double totalBayar = total - diskon;
            System.out.println("\n========== STRUK BELANJA ==========");
            System.out.println("Total harga sebelum diskon : Rp " + total);
            System.out.println("Diskon                     : Rp " + diskon);
            System.out.println("Total yang harus dibayar   : Rp " + totalBayar);
            System.out.print("\nMasukkan uang anda: Rp ");
            double bayar = input.nextDouble();
            double kembalian = bayar - totalBayar;
            if (kembalian < 0) {
                System.out.println("Uang anda kurang Rp " + Math.abs(kembalian));
            } else {
                System.out.println("Kembalian anda: Rp " + kembalian);
            }   System.out.println("\nSelamat menikmati hidangan anda, pelaggan spesial!");
            System.out.println("============================================");
        }
    }
}
