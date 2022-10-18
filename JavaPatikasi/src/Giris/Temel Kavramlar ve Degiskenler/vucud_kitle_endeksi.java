import java.util.Scanner;

public class vucud_kitle_endeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kilo;
        double boy;

        System.out.println("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextInt();


        double endeks = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz : " + endeks);
    }

}
