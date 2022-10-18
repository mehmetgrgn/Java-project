import java.util.Scanner;

public class Uslu_Sayi_Hesaplama {
    public static void main(String[] args){
        int n,k, total =1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı : ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = input.nextInt();

        for (int i =1; i <= k; i++){
            total *=n;
        }
        System.out.println("Cevap : " + total);
    }
}
