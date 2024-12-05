import java.util.Random;
import java.util.Scanner;

public class uklsedan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean lanjutkankuis = true;

        while (lanjutkankuis) {
            // bilangan acak
            int bilanganPertama = random.nextInt(10) + 1; // Bilangan 1-10
            int bilanganKedua = random.nextInt(10) + 1;   // Bilangan 1-10

            // acak operatorr
            String operator;
            int hasil = 0;
            int jenisOperator = random.nextInt(3); // 0 = perkalian, 1 = pembagian, 2 = modulus

            switch (jenisOperator) {
                case 0:
                    operator = "*";
                    hasil = bilanganPertama * bilanganKedua;
                    break;
                case 1:
                    operator = "/";
                    // Menghindari pembagian dengan nol
                    hasil = bilanganPertama / bilanganKedua;
                    break;
                case 2:
                    operator = "%";
                    // Menghindari modulus dengan nol
                    hasil = bilanganPertama % bilanganKedua;
                    break;
                default:
                    operator = "";
                    break;
            }

            // Menampilkan soal kuis 
            String soalKuis = bilanganPertama + " " + operator + " " + bilanganKedua + " = ? (ketik -1 untuk berhenti)";
            System.out.println(soalKuis);
            int jawabanUser  = input.nextInt();

            // Memeriksa apakah ingin berhenti
            if (jawabanUser  == -1) {
                lanjutkankuis = false;
                System.out.println("Kuis dihentikan. Terima kasih!");
            } else {
                // Memeriksa jawaban pengguna
                if (jawabanUser  == hasil) {
                    System.out.println("Jawaban Anda betul!");
                } else {
                    System.out.println("Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
                }
            }
        }

       
    }
}