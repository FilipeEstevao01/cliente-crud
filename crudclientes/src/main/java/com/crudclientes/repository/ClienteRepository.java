package com.crudclientes.repository;

import com.crudclientes.model.Cliente;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cliente")
public class ClienteRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;
    private String telefone;
    private String cidade;

    public Cliente save(Cliente cliente) {
        return cliente;
    }

    public Iterable<Cliente> findAll() {
    }
}


