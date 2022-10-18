import java.util.Scanner;

public class Tek_Sayilarin_Toplamini_Bulan_Program {
    public static void main(String[] args){
       int n;
       int total = 0;
       do{
           Scanner inp = new Scanner(System.in);
           System.out.print("Sayı Giriniz : ");
           n = inp.nextInt();
           if (n%2== 0 && n%4 == 0){
               total += n;
           }
       }while (n%2 == 0);
        System.out.println("Toplam : " + total);

    }
    }

