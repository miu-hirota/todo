package com.example.todo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    private boolean completed=false;
}

