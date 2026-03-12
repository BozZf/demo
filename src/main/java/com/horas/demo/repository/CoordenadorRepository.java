package com.horas.demo.repository;

import com.horas.demo.entity.Aluno;
import com.horas.demo.entity.Coordenador;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CoordenadorRepository extends CrudRepository<Coordenador, Long> {

    boolean existsByUsername(String username);

    @Query("SELECT c FROM Coordenador c WHERE c.nome = :nome")
    Coordenador findByName(@Param("nome") String nome);

    @Query("SELECT c FROM Coordenador c WHERE c.registroProfissional = :registro")
    Coordenador findByRegistro(@Param("registro") String registroProfissional);

    @Modifying
    @Query("UPDATE Coordenador c SET c.username = :user_name WHERE c.username = :username")
    void updateUsername(@Param("username") String username);

    @Modifying
    @Query("UPDATE Coordenador c SET c.password = :password WHERE c.username = :username")
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
