package com.example.adel.simplenotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.adel.simplenotes.model.Note;

import static com.example.adel.simplenotes.NotesRepository.getNotesRepository;

/**
 * Created by Adelin_Ghanayem on 19-Jul-17.
 */

public class NotesListAdapter extends BaseAdapter {


    private Context context;

    public NotesListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return getNotesRepository().count();
    }

    @Override
    public Object getItem(int i) {
        return getNotesRepository().getById(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.note_list_item, viewGroup, false);
        }
        Note note =  getNotesRepository().getById(i);

        TextView noteTitle = view.findViewById(R.id.note_title);
        noteTitle.setText(note.getTitle());
        TextView noteText = view.findViewById(R.id.note_title);
        noteText.setText(note.getText());
        return view;
    }
}
