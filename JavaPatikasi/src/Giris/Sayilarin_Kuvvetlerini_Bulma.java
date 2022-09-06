import java.util.Scanner;

public class Sayilarin_Kuvvetlerini_Bulma {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();
        System.out.println("===============Dördün Kuvvetleri================");
        for (int i = 1; i <= n; i*=4){
            System.out.println(i + " ");
        }
        System.out.println("===============Beşin Kuvvetleri================");
        for (int i = 1; i <= n; i*=5){
            System.out.println(i + " ");
        }
    }
}
