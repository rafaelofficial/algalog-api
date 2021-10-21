package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    /**
     * PersistenceContext : A anotação PersistenceContext injeta um EntityManager na variável de instancia 'manager'
     */
    @PersistenceContext
    private EntityManager manager;

    /**
     * @return : retorna uma consulta na tabela cliente no banco de dados
     */
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    }
}
