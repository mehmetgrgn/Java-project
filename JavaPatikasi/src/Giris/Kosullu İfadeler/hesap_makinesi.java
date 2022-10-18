import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args){
        double n1,n2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        n1 = input.nextDouble();
        System.out.print("2. Sayıyı Giriniz  :");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        double toplam = n1+n2;
        double cikarma = n1-n2;
        double carpma = n1*n2;
        double bolme = n1/n2;

        switch (select){
            case 1 :
                System.out.println("Toplama : " + toplam);
                break;
            case 2 :
                System.out.println("Çıkarma : " + cikarma);
                break;
            case 3 :
                System.out.println("Çarpma : " + carpma);
                break;
            case 4 :
                System.out.println("Bölme : " + bolme);
                break;
            default:
                System.out.println("Lütfen Yukarıdaki Değerlerden Birini Giriniz");
                break;
        }
    }
}
