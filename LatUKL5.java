import java.util.Scanner;

public class LatUKL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            input.close();
            return; 
        }

        double totalNilai = 0;


        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai = totalNilai + nilai; 
        }

       
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n--- Hasil Rekapitulasi ---");
        System.out.println("Total nilai dari " + jumlahSiswa + " siswa adalah: " + totalNilai);
        System.out.println("Nilai rata-rata kelas adalah: " + rataRata);

        input.close();
    }
}