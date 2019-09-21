package app.one.my.oneapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class UpStairsTraining extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button11;
    Button button22;
    TextView textView;
    LinearLayout linearLayout;
    LinearLayout linearLayoutVerticalUP;
    LinearLayout linearLayoutVerticalDown;
    TableRow tableRow;
    int countUp;
    int maxCountUp;
    int countDown;
    int maxCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.up_stairs );

        button1 = findViewById ( R.id.button5 );
        button2 = findViewById ( R.id.button6 );
//        textView = findViewById ( R.id.tv );
        linearLayout = findViewById ( R.id.llUpStairs );
        linearLayoutVerticalUP = findViewById ( R.id.llVerticalUp );
        linearLayoutVerticalDown = findViewById ( R.id.llVerticalDown );


        addButtonOnClickUp ( );
        addButtonOnClickDown ( );
//        setActionButton ();


    }

    private void addButtonOnClickUp() {
        button1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                button11 = new Button ( UpStairsTraining.this );
                countUp = countUp + 1;
                maxCountUp = countUp;
                button11.setText ( "Up " + countUp );

                linearLayoutVerticalUP.addView ( button11 );
//                button.setClickable ( false ); //можно следать кномку не кликабольной
//                button.callOnClick ();
//                button.setEnabled ( false );
//                button.callOnClick ( true );
//                button.setLongClickable ( true );
//                button.performClick ();

            }
        } );

    }


    private void addButtonOnClickDown() {
        button2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                button22 = new Button ( UpStairsTraining.this );
//                for (int i = countUp; i > 0; i--) {
//                    countDown = i;
//
//                }
                maxCountDown = maxCountUp;
                countDown = countDown +1;
                maxCountDown = maxCountDown - countDown;


                button22.setText ( "Down "  + maxCountDown );

//                if ( countDown > 0 ) {// todo invert down count
//                button22.setText ( "Down "  + countDown );
//
//                }

                linearLayoutVerticalDown.addView ( button22 );

            }
        } );

    }


    private void setActionButton() {
        button1.isClickable ( );
        button1.callOnClick ( );
        button1.setClickable ( false );


        if ( button1.isClickable ( ) ) {
            button1.setText ( "isClickable" );
        }
//        if ( button.isClickable ( ) ) {
//            button.setText ( "isClickable" );
//        }
//        if ( button.setClickable (  ) {
//            button1 = new Button ( this );
//            linearLayout.addView ( button1 );
//        }

    }


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//            }
//        });


//    public void startUpStairs(View view) {
//        Button button = new Button(this);
//        TextView textView = new TextView(this);
//        int numberOfApproaches;
//        numberOfApproaches = 1;
//        textView.setText("Подход "+numberOfApproaches);
//
//
//
//
//    }
}
