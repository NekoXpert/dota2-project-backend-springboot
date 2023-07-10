package com.dota2projectbackendspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dota2projectbackendspringboot.models.Equipo;
import com.dota2projectbackendspringboot.services.EquipoService;

import java.util.List;

@RestController

public class EquipoController {

    private final EquipoService equipoService;

    @Autowired
    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @GetMapping("/equipo")
    public List<Equipo> getAllEquipos() {
        return equipoService.getAllEquipos();
    }

    @GetMapping("/equipo/{id}")
    public Equipo getEquipoById(@PathVariable Long id) {
        return equipoService.getEquipoById(id);
    }55

    @PostMapping("/equipo/create")
    public Equipo createEquipo(@RequestBody Equipo equipo) {
        return equipoService.createEquipo(equipo);
    }

    @PutMapping("/equipo/update/{id}")
    public Equipo updateEquipo(@PathVariable Long id, @RequestBody Equipo equipo) {
        equipo.setId(id);
        return equipoService.updateEquipo(id, equipo);
    }

    @DeleteMapping("/equipo/{id}")
    public void deleteEquipo(@PathVariable Long id) {
        equipoService.deleteEquipo(id);
    }
}
