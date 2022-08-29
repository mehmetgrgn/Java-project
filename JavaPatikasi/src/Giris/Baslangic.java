import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        System.out.println(ortalama);
    }
}
