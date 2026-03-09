package com.horas.demo.entity;

public class Coordenador {
    private Long  id;
    private String username;
    private String password;
    private String nome;
    private Long registroProfissional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}