package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

/**
 * 2% sobre o valor
 */
class ICMS implements Imposto {
    @Override
    public BigDecimal aplicar(BigDecimal valor) {
        return valor.divide(valueOf(100)).multiply(valueOf(2));
    }
}
