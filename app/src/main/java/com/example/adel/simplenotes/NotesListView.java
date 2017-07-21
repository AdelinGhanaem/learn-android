package com.example.adel.simplenotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 *
 * Created by Adelin_Ghanayem on 19-Jul-17.
 */

public class NotesListView extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_list);
        NotesListAdapter notesListAdapter = new NotesListAdapter(this);
        ((ListView)findViewById(R.id.note_list)).setAdapter(notesListAdapter);
    }


}
