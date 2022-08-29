import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double tutar;

        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        double kdvOran = (tutar <= 1000)? 0.18 : 0.08;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı : " + kdvliTutar);
}
}