package com.example.porFinn.controllers;

import com.example.porFinn.models.Base;
import com.example.porFinn.models.Persona;
import com.example.porFinn.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;

    //ResponseEntity va a contener el status de la respuesta ej. si salio bien o salio mal  esto se hace con un codigo httpStatus que va hacer de tipo 200 OK etc.
    //Tambien va a tener un body en el que vamos a enviar los datos a la aplicacion web.
    @GetMapping("")
    public ResponseEntity<?> getAll(){                                                                                  //Este ResponseEntity<?> nos va a brindar los status y las respuestas en formato Json para nuestra aplicacion web.
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());                                 //Es decir si en el body si se encuentran en nuestra base de datos personas se van a devolver la lista de personas encontradas.
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. por favor intenta más tarde.\"}");
        }
    }

    @GetMapping("/{id}")                                                                                                //Dentro de la URI "/{id}" recibimos el ID
    public ResponseEntity<?> getOne(@PathVariable Long id){                                                             //@PathVariable quiere decir que va hacer una variable que va a estar adentro de la URL con la cual accedemos al recurso
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. por favor intenta más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){                                                         //La persona entity hay que declararla como que esta dentro del body del request asi @RequestBody.
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error. por favor intenta más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error. por favor intenta más tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error. por favor intenta más tarde.\"}");
        }
    }

}
