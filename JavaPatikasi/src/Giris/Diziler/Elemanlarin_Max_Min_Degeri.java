package Diziler;

public class Elemanlarin_Max_Min_Degeri {
    public static void main (String[] args){
        int[] list = {56,34,1,8,6,87,-23,-32};
        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (i < min ){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println("Minimum Değer : " +min);
        System.out.println("Maximum Değer : " +max);
    }
}
