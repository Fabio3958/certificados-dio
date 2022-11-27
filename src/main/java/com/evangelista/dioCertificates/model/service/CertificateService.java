package com.evangelista.dioCertificates.model.service;

import com.evangelista.dioCertificates.model.Certificate;

import java.util.List;
import java.util.Optional;

public interface CertificateService {

    List<Certificate> findAll();
}
