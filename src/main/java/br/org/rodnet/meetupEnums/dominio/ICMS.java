package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.Calculadora.porcentagem;
import static java.math.BigDecimal.valueOf;

/**
 * 2% sobre o valor
 */
class ICMS implements Imposto {
    @Override
    public BigDecimal aplicar(BigDecimal valor) {
        return porcentagem(valueOf(2), valor);
    }
}
