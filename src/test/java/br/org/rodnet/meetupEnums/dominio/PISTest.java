package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.ImpostoEnum.PIS;
import static org.assertj.core.api.Assertions.assertThat;

class PISTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var tresReais = BigDecimal.valueOf(3);

        assertThat(PIS.aplicar(cemReais)).isEqualTo(tresReais);
    }
}
