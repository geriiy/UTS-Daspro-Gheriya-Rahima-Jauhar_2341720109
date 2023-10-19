import java.util.Scanner;

public class BeliBarang12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        String jenisBarang, namaBarang, beliKantongPlastik;
        double totalHarga = 0, hargaBarang, potonganHarga, totalSetelahPotongan, totalSetelahPpn, ppn;
        int jumlahMinuman = 0;

        System.out.println("===========================");
        System.out.println("Selamat Datang di Swalayan");
        System.out.println("    Selamat berbelanja!    ");
        System.out.println("===========================");

        while (true) {
            System.out.println("\nKetik 'done' jika tidak ada barang yang ingin dibeli lagi");
            System.out.print("Masukkan jenis barang (minuman/makanan)   : ");
            jenisBarang = input12.next();

            if (jenisBarang.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Masukkan nama barang                      : ");
            namaBarang = input12.next();

            System.out.print("Masukkan harga barang                     : ");
            hargaBarang = input12.nextDouble();

            if (jenisBarang.equalsIgnoreCase("minuman")) {
                jumlahMinuman++;
            } 

            totalHarga += hargaBarang;
        }

       
        potonganHarga = (jumlahMinuman >= 3) ? 0.05 * totalHarga : 0;

        System.out.println("______________________________________");
        System.out.println("\n             Struk Belanja            ");
        System.out.println("     Total Harga: Rp. " + totalHarga   );
        System.out.println("     Potongan Harga: Rp. " + potonganHarga );
        System.out.println("______________________________________");

        totalSetelahPotongan = totalHarga - potonganHarga;

        System.out.print("\nMau beli kantong plastik? ");
        System.out.println("\n | ya |       | tidak |    ");
        beliKantongPlastik = input12.next();
        
        if (beliKantongPlastik.equalsIgnoreCase("ya")) {
            totalSetelahPotongan += 200;
            System.out.println("Biaya kantong plastik: Rp. 200");
        }

        if (totalSetelahPotongan >= 1000000) {
            ppn = 0.07 * totalSetelahPotongan;
            totalSetelahPpn = totalSetelahPotongan + ppn;
            System.out.println("\n==============================================");
            System.out.println("PPN 7%: Rp. " + ppn);
            System.out.println("Total Pembayaran (termasuk PPN): Rp. " + totalSetelahPpn);
            System.out.println("        Terimakasih sudah berbelanja!        ");
            System.out.println("==============================================");
        } else {
            System.out.println("\n==============================================");
            System.out.println("        Total Pembayaran: Rp. " + totalSetelahPotongan);
            System.out.println("        Terimakasih sudah berbelanja!        ");
            System.out.println("==============================================");
        }

        input12.close();
    }
        
    }
    
