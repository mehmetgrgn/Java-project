import java.util.Scanner;

public class hipotenus_hesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a,b;
        double c,u;

        System.out.println("Lütfen 1. Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.println("Lütfen 2. Kenarı Giriniz : ");
        b = input.nextInt();

        c =  Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        double perimeter = 2*u;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Hipotenus : " +c);
        System.out.println("Üçgenin Çevresi : " + perimeter);
        System.out.println("üçgenin Alanı : " + area);
    }
}