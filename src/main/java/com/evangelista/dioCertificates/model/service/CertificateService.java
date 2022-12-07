package com.evangelista.dioCertificates.model.service;

import com.evangelista.dioCertificates.model.Certificate;

import java.util.List;

public interface CertificateService {

    List<Certificate> findAll();
    void save(Certificate certificate);
    void delete(Long id);
}
