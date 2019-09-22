package app.one.my.oneapp;

import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

//import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity2 extends AppCompatActivity {


    public static final String STRING_TXT = null;
    public static final String DAYOFSTART = null;
    public static final String TEXTSTARTBUTTON = "GO";
    public static final boolean STARTBUTTONSETCLICKABLE = true;
    int start;
    Calendar c = Calendar.getInstance ( Locale.getDefault ( ) );
    int today = c.get ( Calendar.DAY_OF_YEAR );// получаем текущий день в году


//    SharedPreferences sharedPreferences = getSharedPreferences ( STRING_TXT, MODE_PRIVATE );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        createStartButton ( );
        createNextButton ( );


    }

    //для сохранея данных нужно переопределить методы в onPause
    @Override
    protected void onPause() {
        super.onPause ( );
        SharedPreferences sharedPreferences = getSharedPreferences ( STRING_TXT, MODE_PRIVATE );
        SharedPreferences.Editor box = sharedPreferences.edit ( );
//        box.putInt ( startDay , today);
        box.putInt ( DAYOFSTART, start );
        box.putBoolean ( String.valueOf ( STARTBUTTONSETCLICKABLE ), false );
        box.putString ( TEXTSTARTBUTTON, "Start" );


        box.commit ( );
        Toast.makeText ( this, "Save start day", Toast.LENGTH_SHORT ).show ( );


    }

    //todo создать новые кнопки в зависимости от того сколько дней прошло
    private void createNextButton() {

        for (int i = 0; i < 5; i++) { // сравнение текущего для и начаьного
            TableLayout tableLayout = findViewById ( R.id.tableLayout );
            final Button button1 = new Button ( this );


            button1.setText ( "Day " + today );
//            button1.setId(startDay);
            tableLayout.addView ( button1 );
        }


    }

    private void createStartButton() {
        TableLayout tableLayout = findViewById ( R.id.tableLayout );
        final Button button = new Button ( this );

        button.setText ( TEXTSTARTBUTTON );
        button.setClickable ( STARTBUTTONSETCLICKABLE );

        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                start = today;
                button.setText ( "Start day " + start );
                button.setClickable ( false );
//                  button.setVisibility ( View.INVISIBLE ); // делает кнопку не видимой

//                trangingOfDay(); // не понимаю какой нужен параметр
//                startDay = c.get(Calendar.DAY_OF_YEAR); // todo  каждый раз будет перезаписываться
//                button.setText("Day "+startDay);
//                button.set

            }
        } );
        tableLayout.addView ( button );
    }


    public void trangingOfDay(View view) {
        Intent intent = new Intent ( this, TraningOfDay.class );
        startActivity ( intent );
    }

    public void startUpStairsActivity(View view) {
        Intent intent = new Intent ( this, UpStairsTraining.class );
        startActivity ( intent );

    }

    public void startCircleActivity(View view) {
        Intent intent = new Intent ( this, CircleTraining.class );
        startActivity ( intent );

    }

    public void startExercises(View view) {
        Intent intent = new Intent ( this, ExercisesTraining.class );
        startActivity ( intent );

    }

    public void dataTime(View view) {
        Intent intent = new Intent ( this, DataTime.class );
        startActivity ( intent );

    }

    public void makeFoto(View view) {
        Intent intent = new Intent ( this, MakePhoto.class );
        startActivity ( intent );

    }

}
