import java.util.Scanner;
public class ujianuklsoalmudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int jarakmax = 10;
        int volumemax = 100;

        System.out.println("Masukan Berat Barang: ");
        int Berat = input.nextInt();
        System.out.println("Masukan Panjang Barang: ");
        int P = input.nextInt();
        System.out.println("Masukan Tinggi Barang: ");
        int T = input.nextInt();
        System.out.println("Masukan jarak tempuh: ");
        int jaraktempuh = input.nextInt();
        System.out.println("Masukan Lebar Barang");
        int L = input.nextInt();

        int hasilvolume = P*L*T;

        if (jarakmax <= jaraktempuh){
           int hasil1 = Berat*harga1;
         if (hasilvolume > volumemax) {
            int result1 = hasil1 * harga3;
            System.out.println("Biaya yang harus dibayarkan RP." + result1);
        } else {
            System.out.println("Biaya yang harus dibayarkan RP." + hasil1);
        }
        }  else if (jaraktempuh > jarakmax) {
            int hasil2 = Berat*harga2;
            if (hasilvolume > volumemax) {
                int result2 = hasil2 * harga3;
                System.out.println("Biaya yang harus dibayarkan RP." + result2);
            } else {
                System.out.println("Biaya yang harus dibayarkan RP." + hasil2);
            }
        }
    

        
        
    }
    
}
