package Siniflar.Boks_Oyunu;

public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Mehmet",15, 100, 100, 35);
        Fighter f2 = new Fighter("Ali", 15, 100, 85, 35);

        Ring match = new Ring(f1,f2, 85, 100 );
        match.run();
    }
}
