package javarush.level.five;

public class Four {
    String name;
    int age;
    char sex;

    public static void main(String[] args) {

    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
//Создайте геттеры и сеттеры для всех переменных класса Person.
