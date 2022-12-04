package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

/**
 * Valor fixo de R$3,00
 */
class PIS implements Imposto{
    @Override
    public BigDecimal aplicar(BigDecimal valor) {
        return valueOf(3);
    }
}
