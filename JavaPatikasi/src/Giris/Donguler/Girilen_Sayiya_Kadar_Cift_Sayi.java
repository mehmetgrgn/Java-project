import java.util.Scanner;

public class Girilen_Sayiya_Kadar_Cift_Sayi {
    public static void main(String[] args){
        int k,toplam = 0,n =0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        k = inp.nextInt();

        for (int i =0; i<= k; i++){
            if (i%3==0 && i%4==0){
                toplam+=i;
                n++;
            }
        }
        ortalama = toplam/(n-1);
        System.out.print("0'dan Girilen Sayıya Kadar Olan Sayılardan 3 ve 4'e Tam Bölünen Sayıların Ortalaması  :"+ortalama);
        inp.close();
    }
}
