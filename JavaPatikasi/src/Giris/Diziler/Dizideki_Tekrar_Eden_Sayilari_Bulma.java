package Diziler;
import java.util.Arrays;

import java.lang.reflect.Array;

public class Dizideki_Tekrar_Eden_Sayilari_Bulma {
    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={10, 20, 30, 40, 50, 10, 15, 20, 35, 15, 50, 60, 70, 60, 20};
        int[] cift = new int[list.length];
        int[] tek = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length ; i++) {
            if (list[i] % 2 == 0) {
                cift[i] = list[i];
            }else {
                tek[i] = list[i];
                System.out.print(tek[i] + ", ");
            }


        }
        System.out.println();
        for (int value : cift) {
            if (value != 0){
                System.out.print(value + ", ");
            }
        }
    }
}
