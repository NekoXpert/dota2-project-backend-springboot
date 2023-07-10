package com.dota2projectbackendspringboot.services;

import com.dota2projectbackendspringboot.models.Jugador;
import com.dota2projectbackendspringboot.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    private final JugadorRepository jugadorRepository;

    @Autowired
    public JugadorService(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    public List<Jugador> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    public Jugador getJugadorById(Long id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    public Jugador createJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador updateJugador(Long id, Jugador updatedJugador) {
        Jugador existingJugador = jugadorRepository.findById(id).orElse(null);
        if (existingJugador != null) {
          
            existingJugador.setFirstName(updatedJugador.getFirstName());
            existingJugador.setDniDotero(updatedJugador.getDniDotero());
            existingJugador.setMedallaRank(updatedJugador.getMedallaRank());
            existingJugador.setMmr(updatedJugador.getMmr());
            existingJugador.setEdad(updatedJugador.getEdad());
            existingJugador.setNacionalidad(updatedJugador.getNacionalidad());
            existingJugador.setTelefono(updatedJugador.getTelefono());
            existingJugador.setCorreo(updatedJugador.getCorreo());
            existingJugador.setEquipo(updatedJugador.getEquipo());
            existingJugador.setTorneos(updatedJugador.getTorneos());

            return jugadorRepository.save(existingJugador);
        }
        return null;
    }

    public void deleteJugador(Long id) {
        jugadorRepository.deleteById(id);
    }
}
