import java.util.Scanner;

public class taksimetre_programi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 2.20, total, startPrice = 10;

        System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 :total;
        System.out.println("Toplam Tutar : " +total);
    }

}
