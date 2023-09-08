package com.example.porFinn.services;

import com.example.porFinn.models.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception;               //Nos trae una lista de las entidades que queremos obtener y encuentran en la base de datos.

    public E findById(ID id) throws Exception;             //Nos trae una entidad de acuerdo a su numero de id.

    public E save(E entity) throws Exception;                //Nos crea una nueva entidad y por eso entre parentesis le enviamos una entidad al repositorio.

    public E update(ID id, E entity) throws Exception;     //Tendra los parametros id y entidad que sera la entidad actualizada.

    public boolean delete(ID id) throws Exception;         //Se encargara de eliminar un registro de la base de datos.

}
