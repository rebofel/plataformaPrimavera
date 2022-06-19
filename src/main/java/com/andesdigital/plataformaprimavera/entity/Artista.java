package com.andesdigital.plataformaprimavera.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArtista")
    private Long idArtista;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Pais")
    private String pais;
}
