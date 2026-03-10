package com.horas.demo.service;

import com.horas.demo.dto.CoordenadorDto;

public interface CoordenadorService {

    CoordenadorDto createCoordenador(CoordenadorDto coordenadorDtoToCreate);

    CoordenadorDto updateCoordenadorUsername(String username, String newUsername);

    CoordenadorDto updateCoordenadorPassword(String username, String password);

    CoordenadorDto updateCoordenadorEmail(String username, String email);
}

