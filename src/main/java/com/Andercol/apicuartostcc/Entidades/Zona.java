package com.Andercol.apicuartostcc.Entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zona")

public class Zona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zona")

    private Integer idZona;
    @Column(name = "nombre_zona")
    private String nombreZona;
    @Column(name = "capacidad_zona")
    private  Double capacidadZona;
    @Column(name = "disponible_zona")
    private  Double disponibleZona;

    @OneToMany(mappedBy = "zona")
    @JsonManagedReference

    private List <Mercancia> mercancias=new ArrayList<Mercancia>();

    public Zona() {
    }

    public List<Mercancia> getMercancias() {
        return mercancias;
    }

    public void setMercancias(List<Mercancia> mercancias) {
        this.mercancias = mercancias;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Double getCapacidadZona() {
        return capacidadZona;
    }

    public void setCapacidadZona(Double capacidadZona) {
        this.capacidadZona = capacidadZona;
    }

    public Double getDisponibleZona() {
        return disponibleZona;
    }

    public void setDisponibleZona(Double disponibleZona) {
        this.disponibleZona = disponibleZona;
    }
}