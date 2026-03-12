package com.horas.demo.service.imp;

import com.horas.demo.dto.AlunoDto;
import com.horas.demo.dto.mapper.DTOMapper;
import com.horas.demo.entity.Aluno;
import com.horas.demo.exception.RequiredObjetIsNull;
import com.horas.demo.repository.AlunoRepository;
import com.horas.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

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
        setBooleansToTrue(entity);

        var dto = DTOMapper.parseObject(alunoRepository.save(entity) , AlunoDto.class);
        addLinks(dto);

        return dto;

    }

    private String passwordEncoding(String password) { return passwordEncoder.encode(password);}

    private void addLinks(AlunoDto dto){
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                .build()
                .toUriString() + "/api/v1/alunos";

        URI createAlunoUri = UriComponentsBuilder
                .fromUriString(baseUrl + "/create")
                .build()
                .toUri();
        Link createAlunoLink = Link.of(createAlunoUri.toString(), "Criar uma nova conta Aluno");
        dto.add(createAlunoLink);

        URI updateUsernameUri = UriComponentsBuilder
                .fromUriString(baseUrl + "/update/:username/username")
                .buildAndExpand()
                .toUri();
        Link updateUsernameLink = Link.of(updateUsernameUri.toString(), "Mudar o nome de usuario");
        dto.add(updateUsernameLink);

        URI updatePasswordUri = UriComponentsBuilder
                .fromUriString(baseUrl + "/update/:username/password")
                .buildAndExpand()
                .toUri();
        Link updatePasswordLink = Link.of(updatePasswordUri.toString(), "Mudar a senha");
        dto.add(updatePasswordLink);
    }

    private void setBooleansToTrue(Aluno entity) {
        entity.setAccountNonExpired(true);
        entity.setAccountNonLocked(true);
        entity.setCredentialsNonExpired(true);
        entity.setEnabled(true);
    }
}
