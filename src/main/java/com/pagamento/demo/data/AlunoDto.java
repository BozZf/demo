package com.pagamento.demo.data;

import org.springframework.hateoas.RepresentationModel;

public class AlunoDto extends RepresentationModel<AlunoDto> {
    private String nome;
    private Long studendId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getStudendId() {
        return studendId;
    }

    public void setStudendId(Long studendId) {
        this.studendId = studendId;
    }
}
