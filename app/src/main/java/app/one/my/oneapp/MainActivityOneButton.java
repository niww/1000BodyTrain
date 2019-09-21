package app.one.my.oneapp;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivityOneButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );


    }


    public void trangingOfDay(View view) {
        Intent intent = new Intent(this, TraningOfDay.class);
        startActivity(intent);

    }
}
