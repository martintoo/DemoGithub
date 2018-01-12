package digital.escuela.notepad.com.demo1.Activities;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import digital.escuela.notepad.com.demo1.Fragments.MainFragment;
import digital.escuela.notepad.com.demo1.Fragments.PendientesFragment;
import digital.escuela.notepad.com.demo1.Fragments.SupermercadoFragment;
import digital.escuela.notepad.com.demo1.Fragments.VacacionesFragment;
import digital.escuela.notepad.com.demo1.R;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        navigationView=(NavigationView) findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        if(item.isChecked()){
                            item.setChecked(false);
                        }
                        else {
                            item.setChecked(true);
                        }
                        drawerLayout.closeDrawers();
                        switch(item.getItemId()){
                            case R.id.item_principal:
                                setFragment(0);
                                //Toast.makeText(getApplicationContext(),"Principal",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.item_pendientes:
                                setFragment(1);
                                break;
                            case R.id.item_supermercado:
                                setFragment(2);
                                break;
                            case R.id.item_vacaciones:
                                setFragment(3);
                                break;


                        }
                        return false;
                    }
                });
        ActionBarDrawerToggle actionBarDrawerToggle=
                new ActionBarDrawerToggle(this,drawerLayout,R.string.open,
                        R.string.close){
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        super.onDrawerClosed(drawerView);
                    }
                };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        setFragment(0);

    }

    public void setFragment(int pos){
        FragmentManager fragmentManager=getSupportFragmentManager();
        //iniciamos transaccion del fragmentManager
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        switch (pos){
            case 0:
                MainFragment fragment=new MainFragment();
                transaction.replace(R.id.fragment,fragment);
                transaction.commit();
                break;
            case 1:
                PendientesFragment fragmentPendientes=new PendientesFragment();
                transaction.replace(R.id.fragment,fragmentPendientes);
                transaction.commit();
                break;
            case 2:
                SupermercadoFragment fragmentSupermercado=new SupermercadoFragment();
                transaction.replace(R.id.fragment,fragmentSupermercado);
                transaction.commit();
                break;
            case 3:
                VacacionesFragment fragmentVaciones=new VacacionesFragment();
                transaction.replace(R.id.fragment,fragmentVaciones);
                transaction.commit();
                break;
        }
    }
}
/*

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
*/

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