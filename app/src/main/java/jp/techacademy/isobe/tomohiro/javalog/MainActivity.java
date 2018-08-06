package jp.techacademy.isobe.tomohiro.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dog dog = new Dog("ポチ", 3);
//
//        dog.move();

        Human human = new Human("イチロー",44, "野球" );

        human.say();
        human.think();
    }


}
