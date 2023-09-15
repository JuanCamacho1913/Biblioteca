package com.example.porFinn.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private Integer dni;

    @OneToOne(cascade = CascadeType.ALL)                                                            //De esta forma nos permite hacer la persistencia, la actualizacion y la eliminacion a traves de la misma persona
    @JoinColumn(name = "fk_domicilio")                                                              //Indicamos que esa columna sera la foreign key de domicilio
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)                                     //Con orphanRemoval = true nos aseguramos que a la hora de eliminar una persona tambien se eliminen todos los libros que le pertenecen
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();

}
