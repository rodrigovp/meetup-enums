package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ISSTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var umReal = BigDecimal.ONE;
        var iss = new ISS();

        BigDecimal valorDoImposto = iss.aplicar(cemReais);
        assertThat(valorDoImposto).isEqualTo(umReal);
    }
}
