package Diziler;

public class Dizideki_Elemanlarin_Ortalamasi {
    public static void main (String[] args){
        int[] list = {1,4,5,6,7,12,23};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++){
        sum  += list[i];

        }
        double average = sum / list.length;
        System.out.println(average);
    }
}
