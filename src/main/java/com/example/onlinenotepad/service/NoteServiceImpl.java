package com.example.onlinenotepad.service;

import com.example.onlinenotepad.model.Note;
import com.example.onlinenotepad.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{
    @Autowired
    NoteRepository noteRepo;
    @Override
    public void addNote(Note note) {
        noteRepo.save(note);
    }

    @Override
    public void DeleteNote(Long id) {
        noteRepo.deleteById(id);

    }

    @Override
    public List<Note> getNotesByUserId(Long userId) {
        return noteRepo.findByUserId(userId);
    }
}
