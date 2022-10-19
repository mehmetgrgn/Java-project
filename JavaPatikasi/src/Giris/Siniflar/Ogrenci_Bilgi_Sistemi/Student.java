package Siniflar.Ogrenci_Bilgi_Sistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average=0.0;
        this.isPass =false;
    }
    void addBulkQuizNote(int tarih, int math, int biyo){
        if(tarih >= 0 && tarih <=100){
            c1.quiz = tarih;
        }
        if(math >= 0 && math <=100){
            c2.quiz = math;
        }
        if(biyo >= 0 && biyo <=100){
            c3.quiz = biyo;
        }
    }
    void addBulkExamNote(int tarih, int math, int biyo){
        if(tarih >= 0 && tarih <=100){
            c1.note = tarih;
        }
        if(math >= 0 && math <=100){
            c2.note = math;
        }
        if(biyo >= 0 && biyo <=100){
            c3.note = biyo;
        }
    }

    void isPass(){
        this.average = (((this.c1.note * 0.80) + (c1.quiz * 0.20)) + ((this.c2.note * 0.80) + (c2.quiz * 0.20)) + ((this.c3.note * 0.80) + (c3.quiz * 0.20))) / 3.0;
        if(this.average > 55){
            System.out.println("Sınıfı Başarılı Bir Şekilde Geçtiniz!");
            this.isPass = true;
        }else {
            System.out.println("Sınıfta Kaldınız!");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name + " Sınav Notu\t : " + c1.note);
        System.out.println(c2.name + " Sınav Notu\t : " + c2.note);
        System.out.println(c3.name + " Sınav Notu\t : " + c3.note);
        System.out.println(c1.name + " Quiz Notu\t : " + c1.quiz);
        System.out.println(c2.name + " Quiz Notu\t : " + c2.quiz);
        System.out.println(c3.name + " Quiz Notu\t : " + c3.quiz);
        System.out.println("Ortalamanız : " + this.average);
        System.out.println("=======================");
    }

}
