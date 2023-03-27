package com.example.onlinenotepad.repositories;

import com.example.onlinenotepad.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUserId(Long userId);
    Note findFirstByUserIdOrderByIdAsc(Long userId);

}
