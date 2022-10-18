import java.util.Scanner;

public class manav_kasa_programı {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int armut, elma, domates, muz, patlican;

        System.out.println("Armut Kaç Kilo ? : ");
        armut = input.nextInt();
        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextInt();
        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextInt();
        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextInt();

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;


        double toplam = (armut*armutFiyat) + (elma*elmaFiyat) +(domates*domatesFiyat) +(muz*muzFiyat) + (patlican*patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplam);
    }
}
