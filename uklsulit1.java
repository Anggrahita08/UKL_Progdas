import java.util.Scanner;
public class uklsulit1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        // Membuat array untuk menyimpan nilai siswa
        double[] nilaiSiswa = new double[jumlahSiswa];

        // Memasukkan nilai ujian untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
        }

        // Menghitung rata-rata nilai
        double total = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            total += nilaiSiswa[i];
        }
        double rataRata = total / jumlahSiswa;

        // Menampilkan hasil rata-rata
        System.out.printf("Rata-rata nilai ujian: " + rataRata);

       
    }
}

