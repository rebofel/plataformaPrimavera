package com.andesdigital.plataformaprimavera.service.impl;

import com.andesdigital.plataformaprimavera.entity.Artista;
import com.andesdigital.plataformaprimavera.repository.ArtistaRepository;
import com.andesdigital.plataformaprimavera.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArtistaServiceImpl implements ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> consultarArtistas() {

        List<Artista> artistasDataSource = StreamSupport.stream(
                this.artistaRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return artistasDataSource;
    }
}

