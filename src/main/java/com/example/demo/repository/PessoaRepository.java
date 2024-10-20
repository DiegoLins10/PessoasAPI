package com.example.demo.repository;

import com.example.demo.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
