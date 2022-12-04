package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.ImpostoEnum.ICMS;
import static org.assertj.core.api.Assertions.assertThat;

class ICMSTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var doisReais = BigDecimal.valueOf(2);

        assertThat(ICMS.aplicar(cemReais)).isEqualTo(doisReais);
    }
}
