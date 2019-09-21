package app.one.my.oneapp;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DataTime extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.data_time );

        Date date = new Date ( );
        Calendar calendar = new GregorianCalendar ();
        Button button;

        TextView textView = findViewById ( R.id.textView5 );
        TableLayout tableLayout = findViewById ( R.id.tableLayout );

//        date.getTime ();
//        date.toString ();

        textView.setText ( calendar.toString () );
//        textView.setText ( calendar.get ( Calendar.DAY_OF_MONTH ) );




//        textView.setText ( toString (date.getTime ()) );


    }

}
