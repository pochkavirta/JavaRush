package javarush.level.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
