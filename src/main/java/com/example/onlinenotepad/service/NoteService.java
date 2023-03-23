package com.example.onlinenotepad.service;

import com.example.onlinenotepad.model.Note;

import java.util.List;

public interface NoteService {

    void addNote(Note note);

    void DeleteNote(Long id);

    List <Note> getNotesByUserId(Long userId);

}
