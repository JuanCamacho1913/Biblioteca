package com.example.porFinn.controllers;

import com.example.porFinn.models.Persona;
import com.example.porFinn.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")                                                                                             //Con esta anotacion @CrossOrigin vamos a permitir el acceso o no a nuestra api y con (origins = "*") permitir desde distintos origenes "clientes".
@RequestMapping(path = "api/v1/personas")                                                                               //Dentro del @RequestMapping declaramos el path "URI ó URL" que necesitamos para acceder a nuestros recursos "En este caso a acceder a los metodos de persona".
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
                                                                                                                        //Controlador generico
}
