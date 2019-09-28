package app.one.my.oneapp;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;


import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_with_navigation );

        mTextMessage = (TextView) findViewById ( R.id.message );
        BottomNavigationView navigation = (BottomNavigationView) findViewById ( R.id.navigation );
        navigation.setOnNavigationItemSelectedListener ( mOnNavigationItemSelectedListener );


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener ( ) {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId ( )) {
                case R.id.navigation_home:
                    mTextMessage.setText ( R.string.title_home );

                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText ( R.string.title_dashboard );
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText ( R.string.title_notifications );
//                    if ( onSaveInstanceState (  ); ) {
//                    }
                    return true;
                case R.id.navigation_siting:
                    startExercises ( this );
                    return true;
            }
            return false;
        }
    };

    public void startExercises(BottomNavigationView.OnNavigationItemSelectedListener view) {
        Intent intent = new Intent ( this, ExercisesTraining.class );
        startActivity ( intent );

    }

}
