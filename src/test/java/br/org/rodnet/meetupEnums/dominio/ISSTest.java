package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.ImpostoEnum.ISS;
import static org.assertj.core.api.Assertions.assertThat;

class ISSTest {

    @Test
    void aplicarSobreValor(){
        var cemReais = BigDecimal.valueOf(100);
        var umReal = BigDecimal.ONE;

        assertThat(ISS.aplicar(cemReais)).isEqualTo(umReal);
    }
}
