
import java.util.Scanner;

public class LatUKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        
        double biayaJarak = 0;
        double biayaVolume = 0;
        double totalBiaya = 0;

        
        if (jarak <= 10) {
            biayaJarak = 4250 * berat;
        } else {
            biayaJarak = 6000 * berat;
        }

        
        double volume = panjang * lebar * tinggi;
        if (volume > 100) {
            biayaVolume = 50000;
        }

       
        totalBiaya = biayaJarak + biayaVolume;

        
        System.out.println("\n--- Detail Biaya ---");
        System.out.println("Volume Paket: " + volume + " cm^3");
        System.out.println("Biaya Jarak (Rp): " + biayaJarak);
        System.out.println("Biaya Volume (Rp): " + biayaVolume);
        System.out.println("-------------------------");
        System.out.println("Total Biaya Pengiriman (Rp): " + totalBiaya);

        input.close();
    }
}