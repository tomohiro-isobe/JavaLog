package jp.techacademy.isobe.tomohiro.javalog;

import android.util.Log;
public class Dog extends Animal implements Movable {

    static String to_jp = "犬";

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳" + "[ワンワン]");
    }

    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った");
    }
}
