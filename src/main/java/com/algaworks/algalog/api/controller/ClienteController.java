package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        var clienteUm = new Cliente();
        clienteUm.setId(1L);
        clienteUm.setNome("Zé da Silva");
        clienteUm.setTelefone("11 98374-1111");
        clienteUm.setEmail("zedasilva@algaworks.com");

        var clienteDois = new Cliente();
        clienteDois.setId(2L);
        clienteDois.setNome("Maria da Silva");
        clienteDois.setTelefone("11 98123-1111");
        clienteDois.setEmail("mariadasilva@algaworks.com");

        return Arrays.asList(clienteUm, clienteDois);
    }
}
