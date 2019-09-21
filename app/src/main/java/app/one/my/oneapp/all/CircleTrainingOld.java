package app.one.my.oneapp.all;

import android.os.Bundle;
import android.os.CountDownTimer;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import app.one.my.oneapp.R;

public class CircleTrainingOld extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView tvCircle2;
    TextView textView2;
    TextView tvProgressBar;
    EditText editText;
    LinearLayout linearLayout;
    ProgressBar progressBar;
    MyTimer myTimer;
    int countOfExercise;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.circle );
        progressBar = findViewById ( R.id.progressBarCircle );
        editText = findViewById ( R.id.editText );
        tvCircle2 = findViewById ( R.id.tvCirlce2 );
        tvProgressBar = findViewById ( R.id.tvProgressBar );
        spinner = findViewById ( R.id.spinner );


    }


    public void startCircleTraining(View view) {
        myTimer = new MyTimer ( 10000, 1000 );
        myTimer.start ( );
        tvProgressBar.setText ( "Pull " + countOfExercise );

    }

    public void minusButton(View view) {

        if ( countOfExercise > 0 ) {
            countOfExercise = countOfExercise - 1;
            editText.setText ( " " + countOfExercise ); //todo i dnt known who its work
        }


    }

    public void plusButton(View view) {
        countOfExercise = countOfExercise + 1;
        editText.setText ( " " + countOfExercise ); //todo i dnt known who its work
    }

    public void chooseExersice(View view) {
        String selected = spinner.getSelectedItem ( ).toString ( );
        Toast.makeText ( this, selected, Toast.LENGTH_SHORT ).show ( );
    }

    public class MyTimer extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public MyTimer(long millisInFuture, long countDownInterval) {

            super ( millisInFuture, countDownInterval );
        }

        @Override
        public void onTick(long millisUntilFinished) {
            int progress = (int) (millisUntilFinished / 1000);
            progressBar.setProgress ( progressBar.getMax ( ) - progressBar.getMax ( ) / progress ); //todo create progressbar
        }

        @Override
        public void onFinish() {

            finish ( );
        }
    }

}
