package javarush.level.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class One {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Mama");


        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}

//создание массива, заполнение, вывод массива