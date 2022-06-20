package com.pruebag1.hector.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Muebles")
public class Mueble {
    //Atributos de muebles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Definimos estos valores como PK
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String material;

    @NotNull
    private Float alturamts;

    @NotNull
    private Float anchuramts;

    @NotNull
    private Float fondomts;

    
    //Constructor vacío
    public Mueble() {
    }

    //Constructor con Parámetros
    public Mueble(Long id, @NotNull String nombre, @NotNull String material, @NotNull Float alturamts,
            @NotNull Float anchuramts, @NotNull Float fondomts) {
        this.id = id;
        this.nombre = nombre;
        this.material = material;
        this.alturamts = alturamts;
        this.anchuramts = anchuramts;
        this.fondomts = fondomts;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public Float getAlturamts() {
        return alturamts;
    }


    public void setAlturamts(Float alturamts) {
        this.alturamts = alturamts;
    }


    public Float getAnchuramts() {
        return anchuramts;
    }


    public void setAnchuramts(Float anchuramts) {
        this.anchuramts = anchuramts;
    }


    public Float getFondodmts() {
        return fondomts;
    }


    public void setFondomts(Float fondomts) {
        this.fondomts = fondomts;
    }     


}
