package com.horas.demo.service;

import com.horas.demo.dto.CertificadoDto;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public interface CertificadoService {

    CertificadoDto createCertificado(MultipartFile file);

    CertificadoDto findCertificadoById(Long Id);

    PagedModel<EntityModel<CertificadoDto>> findCertificadoByDate(Date data, Pageable pageable);

    CertificadoDto updateValidadeCertificado(Long Id, Boolean valid);
}
