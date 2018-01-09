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

Densidades de Imagenes deberian ser en escala 3:4:6:8:12:16

192x192(escala mas grande)(192/16=12)()
3:36*36 ldpi --Puede estar extinto--
4:48*18 mdpi
6:72*72 hdpi
8:96*96 xhdpi
12:124*124 xxhdpi
16:192*192 xxxhdpi
 */