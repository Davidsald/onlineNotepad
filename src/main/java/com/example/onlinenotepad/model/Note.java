package com.example.onlinenotepad.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    String noteName;

    @Column(columnDefinition = "TEXT")
    String noteBody;


}
