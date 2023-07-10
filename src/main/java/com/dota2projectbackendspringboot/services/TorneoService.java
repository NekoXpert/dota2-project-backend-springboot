package com.dota2projectbackendspringboot.services;

import com.dota2projectbackendspringboot.models.Torneo;
import com.dota2projectbackendspringboot.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneoService {

    private final TorneoRepository torneoRepository;

    @Autowired
    public TorneoService(TorneoRepository torneoRepository) {
        this.torneoRepository = torneoRepository;
    }

    public List<Torneo> getAllTorneos() {
        return torneoRepository.findAll();
    }

    public Torneo getTorneoById(Long id) {
        return torneoRepository.findById(id).orElse(null);
    }

    public Torneo createTorneo(Torneo torneo) {
        return torneoRepository.save(torneo);
    }

    public Torneo updateTorneo(Long id, Torneo updatedTorneo) {
        Torneo existingTorneo = torneoRepository.findById(id).orElse(null);
        if (existingTorneo != null) {
            // Actualizar los campos del torneo existente con los valores del torneo actualizado
            existingTorneo.setName(updatedTorneo.getName());
            existingTorneo.setPremio(updatedTorneo.getPremio());
   
            existingTorneo.setJugadores(updatedTorneo.getJugadores());

            return torneoRepository.save(existingTorneo);
        }
        return null;
    }

    public void deleteTorneo(Long id) {
        torneoRepository.deleteById(id);
    }
}

