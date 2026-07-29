package com.crudclientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import javax.swing.text.html.parser.Entity;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;


}
