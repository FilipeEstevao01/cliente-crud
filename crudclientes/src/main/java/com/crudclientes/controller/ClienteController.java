package com.crudclientes.controller;

import com.crudclientes.model.Cliente;
import com.crudclientes.repository.ClienteRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@Repository
@Controller
@RequestMapping({"/clientes"})
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }
    
}



