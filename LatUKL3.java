import java.util.Scanner;

public class LatUKL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif untuk dihitung faktorialnya: ");
        int n = input.nextInt();

    
        long hasilFaktorial = 1;

        if (n < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else {
          
            for (int i = 1; i <= n; i++) {
                hasilFaktorial = hasilFaktorial * i;
            }
            System.out.println("Hasil faktorial dari " + n + " (atau " + n + "!) adalah: " + hasilFaktorial);
        }

        input.close();
    }
}