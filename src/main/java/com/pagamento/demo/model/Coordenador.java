package com.pagamento.demo.model;

public class Coordenador {
    private Long  id;
    private String nome;
    private Long registroProfissional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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