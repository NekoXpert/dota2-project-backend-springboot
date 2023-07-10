package com.dota2projectbackendspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dota2projectbackendspringboot.repository.EquipoRepository;
import com.dota2projectbackendspringboot.models.Equipo;

import java.util.List;
@Service
public class EquipoService {

    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public List<Equipo> getAllEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo getEquipoById(Long id) {
        return equipoRepository.findById(id).orElse(null);
    }

    public Equipo createEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public Equipo updateEquipo(Long id, Equipo updatedEquipo) {
        Equipo existingEquipo = equipoRepository.findById(id).orElse(null);
        if (existingEquipo != null) {
            // Actualizar los campos del equipo existente con los valores del equipo actualizado
            existingEquipo.setName(updatedEquipo.getName());
            existingEquipo.setJugadores(updatedEquipo.getJugadores());

            return equipoRepository.save(existingEquipo);
        }
        return null;
    }

    public void deleteEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}

