package com.horas.demo.repository;

import com.horas.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
    Aluno findByName(@Param("nome") String nome);

    @Query("SELECT a FROM Aluno a WHERE a.studentId = :studentId")
    Aluno findByStudentId(@Param("studentId") Long studentId);
}
