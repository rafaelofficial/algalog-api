package com.algaworks.algalog.domain.repository;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    /**
     *
     * @param nome
     * @return : faz uma pesquisa no banco pelo nome exato do cliente
     */
    List<Cliente> findByNome(String nome);

    /**
     *
     * @param nome
     * @return : retorna caso contenha no banco de dados os mesmos dados informados da pesquisa (like)
     */
    List<Cliente> findByNomeContaining(String nome);

    Optional<Cliente> findByEmail(String email);
}
