package digital.escuela.notepad.com.demo1.Fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import digital.escuela.notepad.com.demo1.Adapters.NotesAdapters;
import digital.escuela.notepad.com.demo1.POJOS.Note;
import digital.escuela.notepad.com.demo1.R;

/**
 * Created by martinto on 08/01/18.
 */

public class MainFragment extends Fragment {
    RecyclerView recyclerView;
    List<Note> noteList;
    NotesAdapters adapter;
    FloatingActionButton floatingActionButton;

    //para crear la vista
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView=inflater.inflate(R.layout.fragment_layout,container,false);
        return rootView;
    }


    //se crea inmediatamente despues del onCreatView(carga layout)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        floatingActionButton=(FloatingActionButton) view.findViewById(R.id.fab);
        //asignarle un linearLayoutManager para que ordene la lista
        //por defecto tiene 3 formas de mostrar, de arriba a abajo o viceversa, tabla con
        //celdas, de derecha a izquierda
        //parametros(Activity, forma de mostrar los items, reverseLayout)
        LinearLayoutManager linearLayoutManager=
                new LinearLayoutManager(getActivity().getApplicationContext(),
                        LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        initializedData();
        adapter=new NotesAdapters(getActivity().getApplicationContext(),noteList);
        recyclerView.setAdapter(adapter);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(getActivity());
                final EditText editText=new EditText(getActivity());
                editText.setBackgroundColor(Color.GRAY);
                alert.setMessage("Agregar Elemento");
                alert.setTitle("Coloca el nombre");
                alert.setView(editText);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        noteList.add(new Note(200,editText.getText().toString(),"Cuerpooo"));
                        adapter.notifyDataSetChanged();
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.show();
            }
        });
    }

    private void initializedData() {
        noteList=new ArrayList<>();
        noteList.add(new Note(1,"Nota 1","Este es el texto de la nota 1"));
        noteList.add(new Note(2,"Nota 2","Este es el texto de la nota 2"));
        noteList.add(new Note(3,"Nota 3","Este es el texto de la nota 3"));
        noteList.add(new Note(4,"Nota 4","Este es el texto de la nota 4"));
        noteList.add(new Note(5,"Nota 5","Este es el texto de la nota 5"));
        noteList.add(new Note(6,"Nota 6","Este es el texto de la nota 6"));
        noteList.add(new Note(7,"Nota 7","Este es el texto de la nota 7"));
        noteList.add(new Note(8,"Nota 8","Este es el texto de la nota 8"));
        noteList.add(new Note(9,"Nota 9","Este es el texto de la nota 9"));
        noteList.add(new Note(10,"Nota 10","Este es el texto de la nota 10"));
        noteList.add(new Note(11,"Nota 11","Este es el texto de la nota 11"));
        noteList.add(new Note(12,"Nota 12","Este es el texto de la nota 12"));
        noteList.add(new Note(13,"Nota 13","Este es el texto de la nota 13"));
        noteList.add(new Note(14,"Nota 14","Este es el texto de la nota 14"));
        noteList.add(new Note(15,"Nota 15","Este es el texto de la nota 15"));
        noteList.add(new Note(16,"Nota 16","Este es el texto de la nota 16"));
        noteList.add(new Note(17,"Nota 17","Este es el texto de la nota 17"));
    }
}
