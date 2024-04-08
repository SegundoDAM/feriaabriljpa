package com.adorno.adorno.modelo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String campo;
    private boolean likes;
    @ManyToOne
    private Usuario usuario;


    public Mensaje(String campo, boolean likes, Usuario usuario) {
        this.campo = campo;
        this.likes = likes;
        this.usuario = usuario;
    }
}
