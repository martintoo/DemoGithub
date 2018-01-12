package digital.escuela.notepad.com.demo1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import digital.escuela.notepad.com.demo1.R;

/**
 * Created by martinto on 08/01/18.
 */

public class MainFragment extends Fragment {
    RecyclerView recyclerView;

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
        //asignarle un linearLayoutManager para que ordene la lista
        //por defecto tiene 3 formas de mostrar, de arriba a abajo o viceversa, tabla con
        //celdas, de derecha a izquierda
        //parametros(Activity, forma de mostrar los items, reverseLayout)
        LinearLayoutManager linearLayoutManager=
                new LinearLayoutManager(getActivity().getApplicationContext(),
                        LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        initializedData();

    }

    private void initializedData() {

    }
}
