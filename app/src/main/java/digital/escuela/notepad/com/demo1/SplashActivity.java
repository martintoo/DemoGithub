package digital.escuela.notepad.com.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //tarea con tiempo
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                //Los intent sirven para pasar de activity en activity
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();//para destruir el SplashActivity y no gaste memoria
            }
        };
        //tipo cronometro que ejecutara la tarea en 2000 ms
        Timer timer=new Timer();
        timer.schedule(timerTask,SPLASH_SCREEN_DELAY);
    }
}