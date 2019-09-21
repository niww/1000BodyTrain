package app.one.my.oneapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Date;

public class TraningOfDay extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    Button button4;
    TextView textView;
    CountDownTimer timer;
    ProgressBar progressBar;
    Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traing_of_day);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);
        getDay();



//   first version onClick with privet class
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Timer timer = new Timer(60000, 1000);
//                timer.start();
//                button.setText("Done");
//
//            }
//        });

    }


    private void getDay() { // получить текущий день, при нажатии на клавищу запустить метод, который считывает текущий день и день когда кнопку нажали и вывожит новые кнопки
        date = new Date();
        textView.setText(date.toString());


//        Calendar.getInstance(Calendar.DAY_OF_MONTH);


    }

    private void vibrateOnce() {
        android.os.Vibrator vibrator = (android.os.Vibrator) getApplication().getSystemService(Service.VIBRATOR_SERVICE);
        vibrator.vibrate(3000);
    }

    public void setTimer(View view) {
        Timer timer = new Timer(6000, 1000);
        timer.start();
//        this.button.setText("Done"); todo make set "Done" on this button or other
    }

    public void openNewWindowsTimer(View view) {
        Intent intent = new Intent(this, Timer.class);
        try {
            startActivity(intent);
        //todo it is not works(

        } catch (Exception e) {
            textView.setText("5 button is not work");

        }

    }

    public class Timer extends CountDownTimer {

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public Timer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            int progress = (int) millisUntilFinished/1000;
            textView.setText("time "+progress);
            progressBar.setProgress(progress);

        }

        @Override
        public void onFinish() {
            textView.setText("Go");
            vibrateOnce();
        }
    }

    //Date






}
