package com.andesdigital.plataformaprimavera.controllers;

import com.andesdigital.plataformaprimavera.entity.Artista;
import com.andesdigital.plataformaprimavera.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaServiceImpl;

    @GetMapping
    @RequestMapping(value = "consultarArtistas", method = RequestMethod.GET)
    public ResponseEntity<?> consultarArtista() {
        List<Artista> artistasConsultados = artistaServiceImpl.consultarArtistas();

        return ResponseEntity.ok(artistasConsultados);
    }
}
