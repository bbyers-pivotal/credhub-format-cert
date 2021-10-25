package com.credhubcert.credhubcert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@ConfigurationProperties("vcap.services.mycert.credentials")
public class CertConfig {
    public String cert;


    /**
     * This method will convert the one line certificate back into a multi line file that can be used for connecting to services
     * @return multi line string
     */

    public String getFormattedCert() {
        return cert.replaceAll("\\n", "\n");
    }

}


