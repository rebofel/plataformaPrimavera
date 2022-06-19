package com.andesdigital.plataformaprimavera.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlbum")
    private Long idAlbum;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Año")
    private String anio;
    @Column(name = "Artista_idArtista")
    private long artistaIdArtista;
}
