import java.util.Scanner;

public class Hava_Sicakligina_Etkinlik_Onerisi {
    public static void main(String[] args){
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat >5 && heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (heat >15 && heat <=25) {
            System.out.println("Piknik Yapmaya Gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }

}
