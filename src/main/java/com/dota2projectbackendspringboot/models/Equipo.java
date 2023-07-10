package com.dota2projectbackendspringboot.models;

import java.util.List;

import com.dota2projectbackendspringboot.models.EquipoATTR.DPC;
import com.dota2projectbackendspringboot.models.EquipoATTR.Zona;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Equipo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Zona region;
    @Enumerated(EnumType.STRING)
    private DPC puntosClasificacion;
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Zona getRegion() {
        return region;
    }
    public void setRegion(Zona region) {
        this.region = region;
    }
    public DPC getPuntosClasificacion() {
        return puntosClasificacion;
    }
    public void setPuntosClasificacion(DPC puntosClasificacion) {
        this.puntosClasificacion = puntosClasificacion;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // getters and setters
}