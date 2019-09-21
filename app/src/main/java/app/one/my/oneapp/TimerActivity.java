package app.one.my.oneapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class TimerActivity extends AppCompatActivity {
    myTimer timer;
    ProgressBar progressBar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.timer );
        progressBar = findViewById ( R.id.progressBarOfTimer );

        timer = new myTimer ( 5000, 1000 );
        timer.start ( );
    }


    /**
     * Onclick start
     * */
    public void startTimer(View view) {
//        myTimer = new TimerActivity ( 10000, 1000 );
//        myTimer.start ( );
//        tvProgressBar.setText ( "Pull " + countOfExercise );
        timer = new myTimer ( 1000, 1000 );
        timer.start ( );

    }

    public class myTimer extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public myTimer(long millisInFuture, long countDownInterval) {

            super ( millisInFuture, countDownInterval );
        }

        @Override
        public void onTick(long millisUntilFinished) {
            int progress = (int) (millisUntilFinished / 1000);
            progressBar.setMax ( 10000 );
            progressBar.setProgress ( progressBar.getMax ( ) - progressBar.getMax ( ) / progress ); //todo create progressbar
        }

        @Override
        public void onFinish() {

            finish ( );
        }
    }


}
