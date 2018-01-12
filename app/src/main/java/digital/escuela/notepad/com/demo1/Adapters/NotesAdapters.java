package digital.escuela.notepad.com.demo1.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import digital.escuela.notepad.com.demo1.POJOS.Note;
import digital.escuela.notepad.com.demo1.R;

/**
 * Created by martinto on 12/01/18.
 */

public class NotesAdapters extends RecyclerView.Adapter<NotesAdapters.ViewHolder> {
    Context context;
    List<Note> noteList;

    public NotesAdapters(Context context, List<Note> noteList) {
        this.context = context;
        this.noteList = noteList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.note_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id.setText(String.valueOf(noteList.get(position).getId()));
        holder.titulo.setText(noteList.get(position).getTitle());
        holder.body.setText(noteList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }


    //sirve para mantener la Vista
    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView id,titulo,body;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView) itemView.findViewById(R.id.cardView);
            id=(TextView) itemView.findViewById(R.id.id);
            titulo=(TextView) itemView.findViewById(R.id.titulo);
            body=(TextView) itemView.findViewById(R.id.body);
            imageView=(ImageView) itemView.findViewById(R.id.trash);
        }
    }
}
/*
    1 Creamos el ViewHolder
        public class ViewHolder extends RecyclerView.ViewHolder
    2 Heredamos el NoteAdapter
        NotesAdapters extends RecyclerView.Adapter<NotesAdapters.ViewHolder>
    3 Implementamos los 3 metodos
    4 Implementamos onCreateViewHolder
    5 Implementamos el onBindViewHolder
        5.1 Implementamos el ViewHolder extends RecyclerView.ViewHolder
        5.2 Seteamos las propiedades del onBindViewHolder
            holder.id.setText(String.valueOf(noteList.get(position).getId()));...
    6 Implementamos el Adapter (MainFragment)
*/