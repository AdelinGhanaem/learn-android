package com.example.adel.simplenotes;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adel.simplenotes.model.Note;
import com.example.adel.simplenotes.model.NoteType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private static final NotesRepository NOTES_REPOSITORY = new NotesRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onPostCreate");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        System.out.println("onPostCreate");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notes_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getTitle().equals(getResources().getString(R.string.save))) {
            String noteText = ((EditText) findViewById(R.id.note_text)).getText().toString();
            String noteTitle = ((EditText) findViewById(R.id.note_title)).getText().toString();
            Random random = new Random();
            Note note = new Note(random.nextInt(), noteTitle, noteText, new Date(), NoteType.SIMPLE_NOTE);
            NOTES_REPOSITORY.save(note);
        }
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        System.out.println("onPostResume");
    }


    public void confirm() {


    }



}
