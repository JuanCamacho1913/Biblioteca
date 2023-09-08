package com.example.porFinn.repositories;

import com.example.porFinn.models.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
