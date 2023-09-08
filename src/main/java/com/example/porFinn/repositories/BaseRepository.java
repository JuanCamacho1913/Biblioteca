package com.example.porFinn.repositories;

import com.example.porFinn.models.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean                                                                           //@NoRepositoryBean Hace de que de este repositorio "Interface" no se puedan crear instancias
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {                            //<E extends Base, ID extends Serializable> Esto es un generico Aqui le indico los tipos "Long,String,Integer, etc" que puede recibir

}
