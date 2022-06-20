package com.andesdigital.plataformaprimavera.controllers;

import com.andesdigital.plataformaprimavera.entity.Artista;
import com.andesdigital.plataformaprimavera.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

@PostMapping
@RequestMapping(value = "guardarArtista", method = RequestMethod.POST)
    public ResponseEntity<?> guardarArtista(@RequestBody Artista artista) {
        Artista artistaGuardado = this.artistaServiceImpl.guardarArtista(artista);

        return ResponseEntity.status(HttpStatus.CREATED).body(artistaGuardado);
    }

    @PutMapping
    @RequestMapping(value = "actualizarArtista", method = RequestMethod.PUT)
    public ResponseEntity<?> actualizarArtista(@RequestBody Artista artista) {
        Artista artistaActualizado = this.artistaServiceImpl.actualizarArtista(artista);

        return ResponseEntity.status(HttpStatus.OK).body(artistaActualizado);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarArtista/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarArtista(@PathVariable Long id) {
        this.artistaServiceImpl.eliminarArtista(id);

        return ResponseEntity.ok().build();
    }
}
