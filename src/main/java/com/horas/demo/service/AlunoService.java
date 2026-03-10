package com.horas.demo.service;

import com.horas.demo.dto.AlunoDto;

public interface AlunoService {

    AlunoDto createAluno(AlunoDto alunoDtoToCreate);

    AlunoDto updateAlunoUsername(String username, String newUsername);

    AlunoDto updateAlunoPassword(String username, String password);

    AlunoDto updateAlunoEmail(String username, String email);
}
