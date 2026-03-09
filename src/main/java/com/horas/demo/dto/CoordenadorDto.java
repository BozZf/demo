package com.horas.demo.dto;

import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;

public class CoordenadorDto extends RepresentationModel<CoordenadorDto> {
    private String username;
    private String password;
    private String nome;
    private Long registroProfissional;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CoordenadorDto that = (CoordenadorDto) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(nome, that.nome) && Objects.equals(registroProfissional, that.registroProfissional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password, nome, registroProfissional);
    }
}
