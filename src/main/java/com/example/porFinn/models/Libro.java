package com.example.porFinn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Integer fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private Integer paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)                                              //con CascadeType.REFRESH nos aseguramos al momento de persistir un libro siempre se mantenga actualizado los autores, quiere decir que si se ocurrio un cambio en autor se va actualizar en libro 
    private List<Autor> autores;

}
