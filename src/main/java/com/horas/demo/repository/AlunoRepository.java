package com.horas.demo.repository;

import com.horas.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    boolean existsByUsername(String username);

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

    @Modifying
    @Query("UPDATE Aluno a SET a.accountNonExpired = :state WHERE a.username = :username")
    void updateAccountNonExpired(@Param("username") String username, @Param("state") boolean state);

    @Modifying
    @Query("UPDATE Aluno a SET a.accountNonLocked = :state WHERE a.username = :username")
    void updateAccountNonLocked(@Param("username") String username, @Param("state") boolean state);

    @Modifying
    @Query("UPDATE Aluno a SET a.accountCredentialsNonExpired = :state WHERE a.username = :username")
    void updateCredentialsNonExpired(@Param("username") String username, @Param("state") boolean state);

    @Modifying
    @Query("UPDATE Aluno a SET a.enabled = :state WHERE a.username = :username")
    void updateEnabled(@Param("username") String username, @Param("state") boolean state);
}
