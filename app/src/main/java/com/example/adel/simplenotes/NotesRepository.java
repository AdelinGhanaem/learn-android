package com.example.adel.simplenotes;

import com.example.adel.simplenotes.model.Note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adelin_Ghanayem on 19-Jul-17.
 */

public class NotesRepository {


    private Map<Integer, Note> noteList = new HashMap<>();
    private static final NotesRepository NOTES_REPOSITORY = new NotesRepository();

    public Note getById(int id) {
        return noteList.get(id);
    }

    public void save(Note note) {
        noteList.put(note.getId(), note);
    }

    public static NotesRepository getNotesRepository() {
        return NOTES_REPOSITORY;
    }


    public int count() {
        return noteList.size();
    }
}
