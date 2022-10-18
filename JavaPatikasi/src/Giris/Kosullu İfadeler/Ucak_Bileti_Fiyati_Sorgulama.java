import java.util.Scanner;

public class Ucak_Bileti_Fiyati_Sorgulama {
    public static void main(String[] args){
        int KM,yolculukTipi,yas;
        double ucret=0.10,total,yasDiscount,discountTotal,gidisDonus,grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Kilometre Türünden Belirtiniz : ");
        KM = input.nextInt();
        if (KM < 1) {
            System.out.print("Hatalı bir değer girdiniz!");
        } else {
            System.out.print("Yolcunun yaşını giriniz: ");
        }
        yas = input.nextInt();
        if(yas<1){
            System.out.println("Hatalı Giriş Yaptınız. Lütfen Yaşı Doğru Giriniz!");
        } else if (yas >= 1 && yas <= 12) {
            System.out.println("Yolculuk Tipi Nedir?\n1-Tek Yön\n2-Gidiş-Dönüş ");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1 -> {
                    total = KM * ucret;
                    yasDiscount = total * 0.50;
                    discountTotal = total - yasDiscount;
                    System.out.println("Ödenecek Tutar : " + discountTotal);
                }
                case 2 -> {
                    total = KM * 0.10;
                    yasDiscount = total * 0.50;
                    discountTotal = total - yasDiscount;
                    gidisDonus = discountTotal * 0.20;
                    grandTotal = (discountTotal - gidisDonus) * 2;
                    System.out.println("Ödenecek Tutar : " + grandTotal);
                }
                default -> System.out.println("Hatalı Bir Değer Girdiniz!");
            }
        }else if (yas>=13 && yas <= 24) {
            System.out.print("Yolculuk Tipi Nedir?\n1-Tek Yön\n2-Gidiş-Dönüş ");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1 -> {
                    total = KM * ucret;
                    yasDiscount = total * 0.10;
                    discountTotal = total - yasDiscount;
                    System.out.println("Ödenecek Tutar : " + discountTotal);
                }
                case 2 -> {
                    total = KM * 0.10;
                    yasDiscount = total * 0.10;
                    discountTotal = total - yasDiscount;
                    gidisDonus = discountTotal * 0.20;
                    grandTotal = (discountTotal - gidisDonus) * 2;
                    System.out.println("Ödenecek Tutar : " + grandTotal);
                }
                default -> System.out.println("Hatalı Bir Değer Girdiniz!");
            }
        }else if (yas >= 25 && yas <= 65) {
            System.out.print("Yolculuk Tipi Nedir?\n1-Tek Yön\n2-Gidiş-Dönüş ");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1 -> {
                    total = KM * ucret;
                    System.out.println("Ödenecek Tutar : " + total);
                }
                case 2 -> {
                    total = KM * 0.10;
                    grandTotal = (total) * 2;
                    System.out.println("Ödenecek Tutar : " + grandTotal);
                }
                default -> System.out.println("Hatalı Bir Değer Girdiniz!");
            }
        }else if (yas > 65) {
            System.out.print("Yolculuk Tipi Nedir?\n1-Tek Yön\n2-Gidiş-Dönüş ");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1 -> {
                    total = KM * ucret;
                    yasDiscount = total * 0.30;
                    discountTotal = total - yasDiscount;
                    System.out.println("Ödenecek Tutar : " + discountTotal);
                }
                case 2 -> {
                    total = KM * 0.10;
                    yasDiscount = total * 0.30;
                    discountTotal = total - yasDiscount;
                    gidisDonus = discountTotal * 0.20;
                    grandTotal = (discountTotal - gidisDonus) * 2;
                    System.out.println("Ödenecek Tutar : " + grandTotal);
                }
                default -> System.out.println("Hatalı Bir Değer Girdiniz!");
            }
        }else{
            System.out.print("Hatalı bir değer girdiniz!");
        }
    }
}
