package app.one.my.oneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

//import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    Calendar c = Calendar.getInstance(Locale.getDefault());
    int startDay;
    int today = c.get(Calendar.DAY_OF_YEAR);// получаем текущий день в году



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createStartButton();
        createNextButton();


    }

    private void createNextButton() { //todo создать новые кнопки в зависимости от того сколько дней прошло

        for (int i = 0; i < 5; i++) { // сравнение текущего для и начаьного
            TableLayout tableLayout = findViewById(R.id.tableLayout);
            final Button button1 = new Button(this);


            button1.setText("Day "+ today +i);
            button1.setId(startDay);
            tableLayout.addView(button1);
        }



    }

    private void createStartButton() {
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        final Button button = new Button(this);

        button.setText("GO");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                trangingOfDay(); // не понимаю какой нужен параметр
                startDay = c.get(Calendar.DAY_OF_YEAR); // todo  каждый раз будет перезаписываться
                button.setText("Day "+startDay);
            }
        });
        tableLayout.addView(button);
    }


    public void trangingOfDay(View view) {
        Intent intent = new Intent(this, TraningOfDay.class);
        startActivity(intent);
    }

    public void startUpStairsActivity(View view) {
        Intent intent = new Intent(this, UpStairsActivity.class);
        startActivity(intent);

    }
}
