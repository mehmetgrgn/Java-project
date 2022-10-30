package Metotlar;

import java.util.Scanner;

public class Asal_Sayi_Bulan_Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:  ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " Asal Sayıdır.");
            return;
        } else if (sayi % i == 0) {
            System.out.print(sayi + " Asal Sayı Değildir.");
            return;
        }

        asal(sayi, i + 1);

    }

}
