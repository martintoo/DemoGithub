package digital.escuela.notepad.com.demo1.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import digital.escuela.notepad.com.demo1.R;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //generamos el archivo usuario, modo privado
        SharedPreferences sharedPreferences=getSharedPreferences("usuarios",MODE_PRIVATE);
        //generamos un editor para modificar el archivo
        SharedPreferences.Editor editor=sharedPreferences.edit();
        //registramos los datos
        editor.putString("usuario","ed");
        editor.putString("password","ed");
        //Guardamos en el sharedPreferences usuarios DE VITAL IMPORTANCIA
        editor.commit();

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        register=(Button) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this,"Le diste click",Toast.LENGTH_SHORT).show();
                String user=username.getText().toString();
                String pass=password.getText().toString();
                SharedPreferences preferences=getSharedPreferences("usuarios",MODE_PRIVATE);
                if(user.equals(preferences.getString("usuario","x"))){
                    if(pass.equals(preferences.getString("password","x"))){
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong Username",Toast.LENGTH_LONG).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}