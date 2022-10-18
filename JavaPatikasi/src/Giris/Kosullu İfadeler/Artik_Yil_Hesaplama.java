import java.util.Scanner;

public class Artik_Yil_Hesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner input= new Scanner(System.in);


        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        double yuzunKati = yil % 100;

        if (yuzunKati == 0) {
            double bolunme1 = yil % 400;

            if (bolunme1 == 0) {
                System.out.println(yil + " Artik Yıldır!");
            } else {
                System.out.println(yil + " Artik Yıl Değildir!");
            }
        }else {
            double bolunme2 = yil % 4;
            if (bolunme2 == 0) {
                System.out.println(yil + " Artık Yıldır!");
            } else {
                System.out.println(yil + " Artık Yıl Değildir!");
            }
        }
    }
}
