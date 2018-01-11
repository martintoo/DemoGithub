package digital.escuela.notepad.com.demo1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import digital.escuela.notepad.com.demo1.R;

/**
 * Created by martinto on 11/01/18.
 */

public class VacacionesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView=inflater.inflate(R.layout.fragment_vacaciones,container,false);
        return rootView;
    }
}
