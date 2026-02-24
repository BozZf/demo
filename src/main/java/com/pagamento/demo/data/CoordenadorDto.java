package com.pagamento.demo.data;

import org.springframework.hateoas.RepresentationModel;

public class CoordenadorDto extends RepresentationModel<CoordenadorDto> {
    private String nome;
    private Long registroProfissional;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Long registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
