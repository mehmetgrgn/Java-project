import java.util.Scanner;

public class sinif_gecme_durumu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        int toplamDers = 0;
        int toplamNot = 0;
        int average;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if (!(mat < 0 || mat > 100)){
            toplamNot += mat;
            toplamDers ++;
        }else{
            System.out.print("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (!(fizik < 0 || fizik > 100)){
            toplamNot += fizik;
            toplamDers += 1;
        }else{
            System.out.print("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (!(kimya < 0 || kimya > 100)){
            toplamNot += kimya;
            toplamDers += 1;
        }else{
            System.out.println("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if (!(turkce < 0 || turkce > 100)){
            toplamNot += turkce;
            toplamDers += 1;
        }else{
            System.out.print("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();
        if (!(tarih < 0 || tarih > 100)){
            toplamNot += tarih;
            toplamDers += 1;
        }else{
            System.out.print("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (!(muzik < 0 || muzik > 100)){
            toplamNot += muzik;
            toplamDers += 1;
        }else{
            System.out.print("Notunuz 0 ile 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }

        average = toplamNot / toplamDers;
        if (average >= 55 ){
            System.out.println("Tebrikler sınıfı geçtiniz! Başarılar...");
        }else{
            System.out.println("Üzgünüz, sınıfta kaldınız! Seneye Görüşürüz...");
        }
        System.out.println("Toplam Ders : " + toplamDers);
        System.out.println("Ortalamanız: " + average);
    }
}
