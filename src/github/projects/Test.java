package github.projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static sun.swing.MenuItemLayoutHelper.max;

public class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        list.remove(2);

        for (int i = 3; i >=0; i--) {
            String list2 = list.get(i);
            System.out.println(list2);
        }
    }
}

