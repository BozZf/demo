package com.horas.demo.repository;

import com.horas.demo.entity.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {

    @Query("SELECT c FROM Certificado c WHERE c.nome = :nome")
    Certificado findByName(@Param("nome") String nome);

    @Query("SELECT c FROM Certificado c WHERE c.dataEvento = :data")
    Certificado findByDate(@Param("data") Date dataEvento);
}
