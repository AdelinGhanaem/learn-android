package com.example.adel.simplenotes.model;

import java.util.Date;

/**
 * Created by Adelin_Ghanayem on 19-Jul-17.
 */

public class Note {

    private int id;
    private String title;
    private String text;
    private Date createdOn;
    private NoteType noteType;

    public Note(int id, String title, String text, Date createdOn, NoteType noteType) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.createdOn = createdOn;
        this.noteType = noteType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}



