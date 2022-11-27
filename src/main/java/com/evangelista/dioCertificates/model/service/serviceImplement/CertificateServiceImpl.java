package com.evangelista.dioCertificates.model.service.serviceImplement;

import com.evangelista.dioCertificates.model.Certificate;
import com.evangelista.dioCertificates.model.service.CertificateService;
import com.evangelista.dioCertificates.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    CertificateRepository certificateRepository;

    @Override
    public List<Certificate> findAll() {
        return certificateRepository.findAll();
    }
}
