package com.horas.demo.service.imp;

import com.horas.demo.dto.AlunoDto;
import com.horas.demo.dto.mapper.DTOMapper;
import com.horas.demo.entity.Aluno;
import com.horas.demo.exception.RequiredObjetIsNull;
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
    public AlunoDto createAluno(AlunoDto alunoDtoToCreate) {
        if (alunoDtoToCreate == null) {
            throw new RequiredObjetIsNull();
        }
        if (alunoDtoToCreate.getUsername() == null || alunoRepository.existsByUsername(alunoDtoToCreate.getUsername())) {
            throw new IllegalArgumentException();
        }

        var entity = DTOMapper.parseObject(alunoDtoToCreate, Aluno.class);
        entity.setPassword(passwordEncoding(alunoDtoToCreate.getPassword()));

        var dto = DTOMapper.parseObject(alunoDtoToCreate, AlunoDto.class);
        return dto;

    }

    private String passwordEncoding(String password) { return passwordEncoder.encode(password);}
}
