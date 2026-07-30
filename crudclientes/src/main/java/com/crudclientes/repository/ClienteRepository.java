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

    // Aqui foi instanciado o save para usar o save.
    public Cliente save(Cliente cliente) {
        return cliente;
    }

    // Aqui foi instanciado o "findAll" para pode usalo no READ.
    public String findAll() {
        return null;
    }

    public ClienteRepository(Integer id) {
    }

    public Cliente findById(Integer id) {
        return null;
    }

    public void deleteById(Integer id) {
    }
}


