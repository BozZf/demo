package com.horas.demo.dto;

import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;

public class AlunoDto extends RepresentationModel<AlunoDto> {
    private String username;
    private String password;
    private String nome;
    private Long estudanteId;

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

    public String getNome() { return nome; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getEstudanteId() {
        return estudanteId;
    }

    public void setEstudanteId(Long estudanteId) {
        this.estudanteId = estudanteId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlunoDto alunoDto = (AlunoDto) o;
        return Objects.equals(username, alunoDto.username) && Objects.equals(password, alunoDto.password) && Objects.equals(nome, alunoDto.nome) && Objects.equals(estudanteId, alunoDto.estudanteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password, nome, estudanteId);
    }
}
