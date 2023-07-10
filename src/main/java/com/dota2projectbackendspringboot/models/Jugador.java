package com.dota2projectbackendspringboot.models;

import com.dota2projectbackendspringboot.models.JugadorATTR.Medalla;
import com.dota2projectbackendspringboot.models.JugadorATTR.Pais;
import jakarta.persistence.*;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private Integer dniDotero;
    @Enumerated(EnumType.STRING)
    private Medalla medallaRank;
    private Integer mmr;
    private Integer edad;
    @Enumerated(EnumType.STRING)
    private Pais nacionalidad;
    private String telefono;
    private String correo;
    @ManyToOne
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipo equipo;
    @ManyToOne
    @JoinColumn(name = "torneo_id", nullable = false)
    private Torneo torneos;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Integer getDniDotero() {
        return dniDotero;
    }
    public void setDniDotero(Integer dniDotero) {
        this.dniDotero = dniDotero;
    }
    public Medalla getMedallaRank() {
        return medallaRank;
    }
    public void setMedallaRank(Medalla medallaRank) {
        this.medallaRank = medallaRank;
    }
    public Integer getMmr() {
        return mmr;
    }
    public void setMmr(Integer mmr) {
        this.mmr = mmr;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Pais getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public Torneo getTorneos() {
        return torneos;
    }
    public void setTorneos(Torneo torneos) {
        this.torneos = torneos;
    }

    // getters and setters
}
