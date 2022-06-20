package com.andesdigital.plataformaprimavera.service;

import com.andesdigital.plataformaprimavera.entity.Artista;

import java.util.List;

public interface ArtistaService {

    List<Artista> consultarArtistas();

    Artista guardarArtista(Artista artista);

    Artista actualizarArtista(Artista artista);

    void eliminarArtista(Long id);
}
