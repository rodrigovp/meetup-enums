package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class PISTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var tresReais = BigDecimal.valueOf(3);
        var pis = new PIS();

        BigDecimal valorDoImposto = pis.aplicar(cemReais);
        assertThat(valorDoImposto).isEqualTo(tresReais);
    }
}
