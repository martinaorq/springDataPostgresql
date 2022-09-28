package com.martinaprograma.springData.model;

import javax.persistence.*;

@Entity
@Table(name="PersonaTabla")
public class PersonaTabla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPersona;
    @Column(name = "nombre", length = 50)
    private String nombre;

    public PersonaTabla(){
        this.nombre="Default";
    }
    public PersonaTabla (String nombre){
        this.nombre=nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
