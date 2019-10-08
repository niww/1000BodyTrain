package app.one.my.oneapp;

import android.app.FragmentManager;
import android.content.Intent;

import android.os.Bundle;
import android.support.annotation.NonNull;


import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
            Fragment fragment = null;
            switch (item.getItemId ( )) {
                case R.id.navigation_home:
                    fragment = new CalendarFragment ( );
                    break;

                case R.id.navigation_dashboard:
//                    mTextMessage.setText ( R.string.title_dashboard );
//                    return true;
                    fragment = new TrainingFragment ( );
                    break;
//                case R.id.navigation_notifications:
////                    startCalendar ( this );
//                    return true;
                case R.id.navigation_siting:
                    fragment = new SittingFragment ( );
                    break;
            }
            return loadFragment ( fragment );
        }
    };

    private boolean loadFragment(Fragment fragment) {
        if ( fragment != null ) {
            getSupportFragmentManager ( )
                    .beginTransaction ( )
                    .replace ( R.id.fragmentLayout, fragment )
                    .commit ( );
        return true;
        }
        return false;
    }

//    public void startExercises(BottomNavigationView.OnNavigationItemSelectedListener view) {
//        Intent intent = new Intent ( this, ExercisesTraining.class );
//        startActivity ( intent );
//
//    }
//    public void startCalendar(BottomNavigationView.OnNavigationItemSelectedListener view) {
//        Intent intent = new Intent ( this, CalendarOfTraining.class );
//        startActivity ( intent );
//
//    }

}
