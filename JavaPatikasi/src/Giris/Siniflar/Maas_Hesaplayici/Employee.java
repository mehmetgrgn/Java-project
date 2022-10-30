package Siniflar.Maas_Hesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000){
            return salary;
        }else{
            double tax = salary * 0.03;
            return tax;
        }
    }
    public int bonus(){
        if (workHours > 40){
            int bonus = (workHours - 40) * 30;
            return bonus;
        }else{
            return 0;
        }
    }
    public double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Geçersiz bir çalışma yılı girdiniz, tekrar kontrol ediniz!");
        } else {
            int farkYil = 2021 - hireYear;
            double interest;

            if (farkYil > 0 && farkYil < 10) {
                interest = salary * 0.05;
                return interest;
            }
            else if (farkYil > 9 && farkYil <20){
                interest = salary * 0.10;
                return interest;
            }
            else if (farkYil > 19){
                interest = salary * 0.15;
                return interest;
            }
            else if (farkYil == 0){
                return 0;
            }
        }
        return 0;
    }
    public String toString(){

        double total = (salary -tax()) + (bonus() + raiseSalary());
        double tot = (salary +bonus()) - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);


        return null;
    }
}