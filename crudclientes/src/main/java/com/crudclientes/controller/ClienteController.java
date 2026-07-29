package com.crudclientes.controller;

import com.crudclientes.model.Cliente;
import com.crudclientes.repository.ClienteRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    //CREATE
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);

    }

    //READ (Listar todos)
    @GetMapping
    public Iterable<Cliente> listar(){
        return repository.findAll();
    }

     // READ (Buscar por id)
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Integer id) {
        return (Cliente) repository.findById(id).orElse(null);
    }

    //UPDATE
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Integer id, @RequestBody Cliente cliente){
        cliente.setId(id);
        return repository.save(cliente);
    }


}



