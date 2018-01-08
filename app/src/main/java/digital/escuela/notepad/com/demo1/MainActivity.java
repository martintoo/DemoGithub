package digital.escuela.notepad.com.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // bundle es como una maleta
        super.onCreate(savedInstanceState);//creador de la clase padre AppCompatActivity
        setContentView(R.layout.activity_main); //setea que layout(xml,interfaz graf) se va a lanzar

    }
}
