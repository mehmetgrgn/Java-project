import java.util.Scanner;

public class Faktoriyel_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, C, totaln = 1, totalr = 1, totalnr = 1;

        System.out.print("C(n,r) Kombinasyonundaki n Degerini Giriniz: ");
        n = input.nextInt();
        System.out.print("C(n,r) Kombinasyonundaki r Degerini Giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            totaln = totaln * i;
        }

        for (int j = 1; j <= r; j++){
            totalr = totalr * j;
        }

        double nFarkR = n - r;

        for (int k = 1; k <= nFarkR; k++){
            totalnr = totalnr * k;
        }

        C = totaln / (totalr * totalnr);

        System.out.println("C(" + n + "," + r + ") = " + C);
    }
}
