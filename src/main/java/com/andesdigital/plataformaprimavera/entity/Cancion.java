package com.andesdigital.plataformaprimavera.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cancion")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCancion")
    private Long idCancion;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Duracion")
    private String duracion;
    @Column(name = "Album_idAlbum")
    private Long albumIdAlbum;
}
