# credhub-format-cert
Convert multi line certificate into one line file

`awk 'NF {sub(/\r/, ""); printf "%s\\n",$0;}' mycertificate.pem > oneliner`

Create Credhub Service with the certificate

`cf create-service credhub default mycert -c {"cert": "<insert oneliner contents here>"}`

e.g.  `cf create-service credhub default mycert -c {"cert": "-----BEGIN CERTIFICATE-----\n...\n-----END CERTIFICATE-----\n"}`

