package digital.escuela.notepad.com.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // bundle es como una maleta
        super.onCreate(savedInstanceState);//creador de la clase padre AppCompatActivity
        setContentView(R.layout.activity_main); //setea que layout(xml,interfaz graf) se va a lanzar

        textView=(TextView) findViewById(R.id.textoo);
        button=(Button) findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui se ejecuta cuando le doy click
                textView.setText("Este texto se ha cambiado");
            }
        });
    }
}

/*
Imagenes-> formatos .png .jpg .svg
Carpeta mip map
    van los iconos
    Instala todas las carpetas
Carpeta drawable
    van imagenes
    Instala solo las images de acuerdo a las densidades del celular

 */