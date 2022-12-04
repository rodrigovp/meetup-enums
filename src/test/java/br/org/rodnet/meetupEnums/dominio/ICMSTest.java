package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ICMSTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var doisReais = BigDecimal.valueOf(2);
        var icms = new ICMS();

        BigDecimal valorDoImposto = icms.aplicar(cemReais);
        assertThat(valorDoImposto).isEqualTo(doisReais);
    }
}
