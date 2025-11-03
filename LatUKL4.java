import java.util.Scanner;

public class LatUKL4 {

    public static double hitungVolumeTabung(double jari, double tinggi) {
       
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = input.nextDouble();

        
        double volume = hitungVolumeTabung(jariJari, tinggiTabung);

       
        System.out.println("Volume tabung adalah: " + volume);

        input.close();
    }
}