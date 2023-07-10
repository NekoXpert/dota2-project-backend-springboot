package com.dota2projectbackendspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dota2projectbackendspringboot.models.Jugador;
import com.dota2projectbackendspringboot.services.JugadorService;

import java.util.List;

@RestController

public class JugadorController {

    private final JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @GetMapping("/jugador")
    public List<Jugador> getAllJugadores() {
        return jugadorService.getAllJugadores();
    }

    @GetMapping("/jugador/{id}")
    public Jugador getJugadorById(@PathVariable Long id) {
        return jugadorService.getJugadorById(id);
    }

    @PostMapping("/jugador/create")
    public Jugador createJugador(@RequestBody Jugador jugador) {
        return jugadorService.createJugador(jugador);
    }

    @PutMapping("/jugador/update/{id}")
    public Jugador updateJugador(@PathVariable Long id, @RequestBody Jugador jugador) {
        jugador.setId(id);
        return jugadorService.updateJugador(id, jugador);
    }

    @DeleteMapping("/jugador/{id}")
    public void deleteJugador(@PathVariable Long id) {
        jugadorService.deleteJugador(id);
    }
}
