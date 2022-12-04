package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

/**
 * 1% sobre o valor.
 */
class ISS implements Imposto {
    @Override
    public BigDecimal aplicar(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.ONE);
    }
}
