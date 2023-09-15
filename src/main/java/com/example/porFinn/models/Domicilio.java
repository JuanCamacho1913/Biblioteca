package com.example.porFinn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    @ManyToOne(optional = false)                                                           //optional = false significa que localidad no puede ser nula "vacia"
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
