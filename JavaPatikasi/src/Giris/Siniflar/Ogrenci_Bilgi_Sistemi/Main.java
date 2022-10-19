package Siniflar.Ogrenci_Bilgi_Sistemi;

public class Main {
    public static void main(String[] Args){
        Teacher t1 = new Teacher("Mehmet Girgin", "TRH", "+905555555555");
        Teacher t2 = new Teacher("Ahmet Girgin", "MATH", "+905565565656");
        Teacher t3 = new Teacher("Ayşe Girgin", "BYO", "+905666666666");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course matematik = new Course("Matematik", "102", "MATH");
        matematik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BYO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Selma Girgin", "123", "4", tarih,matematik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkQuizNote(70,60,70);
        s1.isPass();

        Student s2 = new Student("Ali Girgin", "124", "4", tarih,matematik,biyo);
        s2.addBulkExamNote(80,70,60);
        s2.addBulkQuizNote(50,40,60);
        s2.isPass();


    }
}
