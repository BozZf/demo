package com.horas.demo.service.imp;

import com.horas.demo.dto.AlunoDto;
import com.horas.demo.repository.AlunoRepository;
import com.horas.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImp implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public AlunoServiceImp(AlunoRepository alunoRepository, PasswordEncoder passwordEncoder) {
        this.alunoRepository = alunoRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AlunoDto createAluno(AlunoDto alunoDto) {
        if (alunoDto == null) {
            throw new RequiredObjectIsNull();
        }
        if (alunoDto.getUsername() == null || alunoRepository.existsByUsername(alunoDto.getUsername())) {
            throw new IllegalArgumentException();
        }
    }
}
