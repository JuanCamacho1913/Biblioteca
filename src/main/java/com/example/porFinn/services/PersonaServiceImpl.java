package com.example.porFinn.services;

import com.example.porFinn.models.Persona;
import com.example.porFinn.repositories.BaseRepository;
import com.example.porFinn.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired                                                             //@Autowired Es una inyección automatica de dependencias, Hay varias formas en las que se usa @Autowired en las que se encuentran, las propiedas, los constructores y los setters.
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
