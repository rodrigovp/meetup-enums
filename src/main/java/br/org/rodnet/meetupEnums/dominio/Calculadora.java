package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

class Calculadora {

    static final BigDecimal porcentagem(BigDecimal porcentagem, BigDecimal valorBase){
        return valorBase.divide(BigDecimal.valueOf(100)).multiply(porcentagem);
    }
}
