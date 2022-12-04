package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.Calculadora.porcentagem;
import static java.math.BigDecimal.ONE;

/**
 * 1% sobre o valor.
 */
class ISS implements Imposto {
    @Override
    public BigDecimal aplicar(BigDecimal valor) {
        return porcentagem(ONE, valor);
    }
}
