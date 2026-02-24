package com.pagamento.demo.data;

import org.springframework.hateoas.RepresentationModel;

import java.util.Date;

public class CertificadoDto extends RepresentationModel<CertificadoDto> {
    private String nome;
    private Long horas;
    private Date dataEvento;

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
}
