package com.dota2projectbackendspringboot.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Torneo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer premio;
 
    @OneToMany(mappedBy = "torneos")
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
    public Integer getPremio() {
        return premio;
    }
    public void setPremio(Integer premio) {
        this.premio = premio;
    }
  
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // getters and setters
}

