package com.horas.demo.entity;

public class Aluno {
    private Long id;
    private String username;
    private String password;
    private String nome;
    private String email;
    private Long estudanteId;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStudentId() {
        return estudanteId;
    }

    public void setStudentId(Long studentId) {
        this.estudanteId = studentId;
    }
}
