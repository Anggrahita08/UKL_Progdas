import java.util.Scanner;
public class uklsulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka dalam array: ");
        int n = scanner.nextInt();

        //mendeklarasikan 
        int[] array = new int[n];

        // Meminta pengguna untuk memasukkan jumlah array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Menghitung frekuensi setiap elemen
        // Menggunakan array untuk menyimpan frekuensi
        int[] frekuensi = new int[n];

        for (int i = 0; i < n; i++) {
            // Jika elemen sudah dihitung, lewati
            if (frekuensi[i] != 0) {
            }

            // Hitung frekuensi elemen array
            int hitung = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    hitung++;
                    frekuensi[j] = -1; // memberi tanda elemen yang sudah dihitung
                }
            }
            frekuensi[i] = hitung; // Simpan frekuensi elemen

            // Menampilkan hasil
            System.out.println(array[i] + " muncul " + hitung + " kali");
        }

        
        
    }
}