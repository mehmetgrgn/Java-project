import java.util.Scanner;

public class Sayilari_Siralama {
    public static void main(String[] args){
        int sayi1,sayi2,sayi3;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        sayi3 = input.nextInt();

        if ((sayi1 > sayi2) &&(sayi1 >sayi3)){
            if (sayi2>sayi3){
                System.out.println("Birinci Sayi > İkinci Sayi > Üçüncü Sayı");
            }else{
                System.out.println("Birinci Sayi > Üçüncü Sayı > İkinci Sayi");
            }

        } else if ((sayi2 > sayi1) && (sayi2 > sayi3)) {
            if (sayi1 >sayi3){
                System.out.println("İkinci Sayi > Birinci Sayi > Üçüncü Sayı");
            }else{
                System.out.println("İkinci Sayi > Üçüncü Sayı > Birinci Sayi");
            }
        } else if ((sayi3 > sayi2) &&(sayi3 > sayi1)) {
            if (sayi2 >sayi1){
                System.out.println("Üçüncü Sayı > İkinci Sayi > Birinci Sayi");
            }else {
                System.out.println("Üçüncü Sayı > Birinci Sayi > İkinci Sayi");
            }

        }else {
            System.out.println("Sayılar Eşit Olmamalıdır!");

        }


    }
}

