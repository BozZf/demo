package com.horas.demo.repository;

import com.horas.demo.entity.Aluno;
import com.horas.demo.entity.Coordenador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CoordenadorRepository extends CrudRepository<Coordenador, Long> {

    @Query("SELECT c FROM Coordenador c WHERE c.nome = :nome")
    Coordenador findByName(@Param("nome") String nome);

    @Query("SELECT c FROM Coordenador c WHERE c.registroProfissional = :registro")
    Coordenador findByRegistro(@Param("registro") String registroProfissional);
}
