package javarush.level.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        double i = 0;
        while (true) {
            double a = Double.parseDouble(reader.readLine());
            if (a != -1) {
                x = x + a;
                i++;
            } else {
                x = x / i;
                System.out.println(x);
                break;
            }
        }
    }
}

//Вводить с клавиатуры числа и вычислить среднее арифметическое.
//Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//-1 не должно учитываться.
