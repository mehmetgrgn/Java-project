import java.util.Scanner;

public class kullaniciAdi_sifre_sifirlama {

    public static void main(String[] args){

        String userName, password,newPassword;
        int cevap;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if(userName.equals("JavaPatika") && password.equals("java12345")){
            System.out.println("Giriş Yapıldı!");
        }else{
            System.out.println("Giriş Yapılamadı.\nŞifrenizi Sıfırlamak İsterseniz =>\n 1-Şifremi Sıfırla\n2-Çıkış Yap");
            cevap = input.nextInt();

            switch (cevap){
                case 1:
                    System.out.println("Lütfen Yeni Şifreyi Giriniz : ");
                    Scanner input2 = new Scanner(System.in);
                    newPassword = input2.nextLine();
                    if (newPassword.equals("java12345")||newPassword.equals(password)){
                    System.out.println("Sifre Aynı Olamaz");
                }else {
                    System.out.println("Sifre olusturuldu");
                }
                    break;
                case 2:
                    System.out.println("Çıkış Yapıldı!\nİyi Günler Dileriz!");
                    break;
                default:
                    System.out.println("Lütfen Doğru Seçeneği Giriniz!");
                    break;
            }
        }


    }
}
