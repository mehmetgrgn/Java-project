package Donguler;

import java.util.Scanner;

public class Armstrong_Sayilari {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num,total=0,variable;

            System.out.print("Sayı Giriniz : ");
            num = scn.nextInt();
            while (num != 0) {
                variable = num % 10;
                total += variable;
                num /= 10;
            }
            System.out.println("Toplam= " + total);


        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Değer Giriniz : ");
        int number =input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;


        while (tempNumber !=0){
            tempNumber /=10;
            basNumber++;

        }
        tempNumber = number;
        while (tempNumber !=0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;

            }
            tempNumber /= 10;
            result += basPow;
        }


        System.out.println(result);




        int a = 2451, basamakSayisi = 0, numberCounter = 0;
        //Basamak sayısı bulma
        //2451 / 10 = 245
        //245 / 10 = 24
        //24 / 10 = 2
        // 2 / 10 = 0
        //0 / 10 = 0

        while (a != 0){
            a /= 10;
            numberCounter++;
        }
        // Bir sayının son basamağını bulma
        //2451 % 10 = 1
        int b = 2451;
        int c = b % 10;
        System.out.println(c);
*/
    }
}
