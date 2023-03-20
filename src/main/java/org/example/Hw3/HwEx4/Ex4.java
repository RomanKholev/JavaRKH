package org.example.Hw3.HwEx4;
/**
 * ри входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Ex4 {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3"};
        ArrayList<String[]> variants = new ArrayList<>();
        int count = fuctorial(arr.length);
        int shift = arr.length - 1;
        String temp;
        for (int i = count; i > 0; i--) {
            temp = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = temp;
            System.out.println(Arrays.toString(arr));
            variants.add(arr);
            if (shift < 2) {
                shift = arr.length - 1;
            } else {
                shift--;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(Arrays.toString(variants.get(i)));
        }


    }



    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
}
}
