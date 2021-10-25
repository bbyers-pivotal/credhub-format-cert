package com.credhubcert.credhubcert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    private CertConfig certConfig;

    public Home(CertConfig certConfig) {
        this.certConfig = certConfig;
    }
    @GetMapping("/")
    public String home() {
        String cert = this.certConfig.getFormattedCert();
        System.out.println(cert);
        return "ok";
    }
}
