package com.chandu.quizz.app.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
@Entity
@Data
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToMany
    private List<Question> questions;
}
