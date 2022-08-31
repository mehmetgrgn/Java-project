import java.util.Scanner;

public class circle_area {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int r;
        double a, pi = 3.14;

        System.out.println("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        System.out.println("Merkez Açısının Ölçüsünü Giriniz : ");
        a = inp.nextDouble();

        double area = pi * r * r;
        double circle = 2 * pi * r;
        double areaPiece = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı : " + area);
        System.out.println("Dairenin Çevresi : " + circle);
        System.out.println("Daire Diliminin Alanı : " + areaPiece);
    }
}
