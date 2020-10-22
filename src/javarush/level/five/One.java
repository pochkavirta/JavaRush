package javarush.level.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) {

        String[] list = new String[5];

        list[1] = "Mama";
        String s = list[1];

        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);

    }
}

//Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).