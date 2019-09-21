package app.one.my.oneapp;

import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MakePhoto extends AppCompatActivity {
    Button button1;
    TableRow tableRow;
    Intent intent = new Intent ( );
    CameraDevice cameraDevice ;
    CameraManager cameraManager ;

    public CameraManager getCameraManager() {
        return cameraManager;
    }

    int countUp;
    int maxCountUp;
    int countDown;
    int maxCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.make_photo );

        button1 = findViewById ( R.id.buttonForMakeFoto );


        createFoto ( );



    }

    private void createFoto() {

        button1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                intent.setAction ( Intent.ACTION_CAMERA_BUTTON );
                intent.putExtra ( Intent.EXTRA_KEY_EVENT,
                        new KeyEvent ( KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_CAMERA ) );
                sendOrderedBroadcast ( intent, null );

            }
        } );

    }

//    private void addButtonOnClickUp() {
//        button1.setOnClickListener ( new View.OnClickListener ( ) {
//            @Override
//            public void onClick(View v) {
//
//                button11 = new Button ( TakeFoto.this );
//                countUp = countUp + 1;
//                maxCountUp = countUp;
//                button11.setText ( "Up " + countUp );
//
//                linearLayoutVerticalUP.addView ( button11 );
////                button.setClickable ( false ); //можно следать кномку не кликабольной
////                button.callOnClick ();
////                button.setEnabled ( false );
////                button.callOnClick ( true );
////                button.setLongClickable ( true );
////                button.performClick ();
//
//            }
//        } );
//
//    }

}
