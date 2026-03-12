package com.horas.demo.dto;

import org.springframework.hateoas.RepresentationModel;

import java.util.Date;
import java.util.Objects;

public class CertificadoDto extends RepresentationModel<CertificadoDto> {
    private String nome;
    private Long horas;
    private Date dataEvento;
    private boolean checado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getHoras() {
        return horas;
    }

    public void setHoras(Long horas) {
        this.horas = horas;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Boolean getChecado() {
        return checado;
    }

    public void setChecado(Boolean checado) {
        this.checado = checado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CertificadoDto that = (CertificadoDto) o;
        return Objects.equals(nome, that.nome) && Objects.equals(horas, that.horas) && Objects.equals(dataEvento, that.dataEvento) && Objects.equals(checado, that.checado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, horas, dataEvento, checado);
    }
}
