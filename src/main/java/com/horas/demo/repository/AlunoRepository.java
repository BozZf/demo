package com.horas.demo.repository;

import com.horas.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Boolean existsByUsername(String username);

    @Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
    Aluno findByName(@Param("nome") String nome);

    @Query("SELECT a FROM Aluno a WHERE a.estudanteId = :estudanteId")
    Aluno findByStudentId(@Param("estudanteId") Long estudanteId);

    @Modifying
    @Query("UPDATE Aluno a SET a.username = :user_name WHERE a.username = :username")
    void updateUsername(@Param("user_name") String username);

    @Modifying
    @Query("UPDATE Aluno a SET a.password = :password WHERE a.username = :username")
    void updatePassword(@Param("username") String username, @Param("password") String password);
}
