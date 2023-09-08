package com.example.porFinn.controllers;

import com.example.porFinn.models.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable>{

    public ResponseEntity<?> getAll();                                                                      //Con el signo ? estamos indicando que ResponseEntity va a recivir cualquer tipo que extienda de object
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);                                                   //@RequestBody son los datos que se envian en el cuerpo de la petición utilizando HTTP POST . En otras palabras, la información de los datos va junto con la información de toda la peticion, no en la url.
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);

}
