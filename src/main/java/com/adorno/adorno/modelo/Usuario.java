package com.adorno.adorno.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class Usuario {
    @Id
    private String nombreUsuario;
    private String email;
}
