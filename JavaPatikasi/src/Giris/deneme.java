import java.util.Scanner;

public class deneme {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Değer Giriniz :");
        n = input.nextInt();

        if (n < 25){
            System.out.println("Girilen sayi 25 ten kucuktur.");
        }else {
        }
        System.out.println("Girilen sayı 25 den büyüktür");

    }

}
