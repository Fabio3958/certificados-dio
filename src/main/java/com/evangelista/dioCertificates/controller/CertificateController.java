package com.evangelista.dioCertificates.controller;

import com.evangelista.dioCertificates.model.Certificate;
import com.evangelista.dioCertificates.model.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CertificateController {

    @Autowired
    CertificateService certificateService;

    @GetMapping("/certificates")
    public ModelAndView getCertificates(){
        ModelAndView modelAndView = new ModelAndView("Certificates");
        List<Certificate> certificates = certificateService.findAll();
        modelAndView.addObject("certificates", certificates);
        return modelAndView;
    }

    @GetMapping("/post-certificate")
    public String getPostCertificate(Certificate certificate){ return "PostCertificate"; }

    @PostMapping("/post-certificate")
    public String postCertificate(Certificate certificate){
        certificateService.save(certificate);
        return "redirect:/certificates";
    }


}
