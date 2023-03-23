package com.example.onlinenotepad.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Note {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String noteName;
    @Column(columnDefinition = "TEXT")
   private String noteBody;

    @ManyToOne
    @JoinColumn(name = "userId",insertable=false, updatable=false)
    private User user;
    private Long userId;

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", noteName='" + noteName + '\'' +
                ", noteBody='" + noteBody + '\'' +
                ", user=" + user +
                ", userId=" + userId +
                '}';
    }
}
