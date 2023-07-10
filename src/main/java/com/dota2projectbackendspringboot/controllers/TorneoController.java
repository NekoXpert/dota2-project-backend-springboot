package com.dota2projectbackendspringboot.controllers;

import com.dota2projectbackendspringboot.models.Torneo;
import com.dota2projectbackendspringboot.services.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TorneoController {

    private final TorneoService torneoService;

    @Autowired
    public TorneoController(TorneoService torneoService) {
        this.torneoService = torneoService;
    }

    @GetMapping("/torneo")
    public List<Torneo> getAllTorneos() {
        return torneoService.getAllTorneos();
    }

    @GetMapping("/torneo/{id}")
    public Torneo getTorneoById(@PathVariable Long id) {
        return torneoService.getTorneoById(id);
    }

    @PostMapping("/torneo/create")
    public Torneo createTorneo(@RequestBody Torneo torneo) {
        return torneoService.createTorneo(torneo);
    }

    @PutMapping("/torneo/update/{id}")
    public Torneo updateTorneo(@PathVariable Long id, @RequestBody Torneo torneo) {
        torneo.setId(id);
        return torneoService.updateTorneo(id, torneo);
    }

    @DeleteMapping("/torneo/{id}")
    public void deleteTorneo(@PathVariable Long id) {
        torneoService.deleteTorneo(id);
    }
}
