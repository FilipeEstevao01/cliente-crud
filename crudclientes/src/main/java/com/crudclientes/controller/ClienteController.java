package com.crudclientes.controller;

import com.crudclientes.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/clientes"})
public class ClienteController {

    private Cliente cliente;
}
