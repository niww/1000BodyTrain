package app.one.my.oneapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.*;

public class ExercisesTraining extends AppCompatActivity {
    Button button1;
    Button button2;
    Button buttonMinus;
    Button buttonPlus;
    Button buttonForExercises;
    TextView textView;
    EditText editText;
    TextInputEditText textInputEditText;
    LinearLayout linearLayout;
    LinearLayout llBody;
    LinearLayout verticalLinearLayoutForExercises;
    LinearLayout horizontalLinearLayoutForExercises;
    ProgressBar progressBar;
    Dialog dialog;
    AppCompatSpinner appCompatSpinner;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.exercises_training );
        progressBar = findViewById ( R.id.progressBarCircle );
        editText = findViewById ( R.id.editText );
        appCompatSpinner = findViewById ( R.id.spinnerOfExercises );
        textInputEditText = findViewById ( R.id.textInputNewExercises );
        verticalLinearLayoutForExercises = findViewById ( R.id.verticalLayoutForExercises );
//        horizontalLinearLayoutForExercises = findViewById ( R.id.horizontalLayoutForExercises );
        llBody = findViewById ( R.id.llBody );
        buttonForExercises = findViewById ( R.id.bottomForAddExercises );


    }

//
    /**
     *start timer
     *
     */
    //    public void startCircleTraining(View view) {
//        myTimer = new MyTimer ( 10000, 1000 );
//        myTimer.start ();
//
//    }

    public void minusButton(View view) {


    }

    public void plusButton(View view) {
//        editText.getText ();
        editText.getText ();
        editText.setText ( "1" );
    }

    public void functionForAddNewExercises(View view) {

        dialog = new Dialog ( ExercisesTraining.this);
        dialog.setTitle ( "Insert new training" );
        dialog.setContentView ( R.layout.dialog_view );
        dialog.show ();

    }

    public void AddNewExercisesToList(View view) {
// добаление нового упражнения в выпадающий список spinner

//        Toast.makeText ( ExercisesTraining.this, textInputEditText.getEditableText ().toString () , Toast.LENGTH_LONG ).show ();
        Toast.makeText ( this, textInputEditText.getText (), Toast.LENGTH_LONG ).show ();





    }
//add exercises to list

    public void functionForAddExercises(View view) {
        int id =0;


        buttonForExercises.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                horizontalLinearLayoutForExercises = new LinearLayout ( ExercisesTraining.this );
                textView = new TextView ( ExercisesTraining.this );
                buttonMinus = new Button ( ExercisesTraining.this );
                buttonMinus.setTag ( appCompatSpinner.getSelectedItem ().toString () );

                buttonPlus = new Button ( ExercisesTraining.this );
                textInputEditText = new TextInputEditText ( ExercisesTraining.this );
                final int i = 0;

                if ( textInputEditText.getTag ( ) == null ) {

                    textInputEditText.setTag ( appCompatSpinner.getSelectedItem ().toString () );
                }
                textInputEditText.setText ( "5" );
                textView.setText ( appCompatSpinner.getSelectedItem ().toString () );
                textView.setTag ( appCompatSpinner.getSelectedItem ().toString ()  );


                buttonMinus.setText ( "-" );
//                buttonMinus.setId ( i );
                Button buttonMinus1 = buttonMinus.findViewWithTag ( buttonMinus.getTag () );
                buttonMinus1.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View v) {

                        TextInputEditText textInputEditText1;
                        textInputEditText1 = textInputEditText.findViewWithTag ( textInputEditText.getTag () );
                        textInputEditText1.setText ( textInputEditText.getTag ().toString () );


                    }
                } );

                buttonPlus.setText ( "+" );

                    verticalLinearLayoutForExercises.addView ( horizontalLinearLayoutForExercises );
                    horizontalLinearLayoutForExercises.addView ( textView );
                    horizontalLinearLayoutForExercises.addView ( buttonMinus );
                    horizontalLinearLayoutForExercises.addView ( textInputEditText );
                    horizontalLinearLayoutForExercises.addView ( buttonPlus );

//скрыть item при выборе его
                if ( textView.getTag () == appCompatSpinner.getSelectedItem ().toString () ) {
//                    appCompatSpinner.removei


                }

            }
        } );
    }
    public void timer(View view) {
        Intent intent = new Intent ( this, TimerActivity.class );
        startActivity ( intent );

    }
}
