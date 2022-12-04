package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import static br.org.rodnet.meetupEnums.dominio.Calculadora.porcentagem;
import static java.math.BigDecimal.TEN;
import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

class CalculadoraTest {

    @Test
    void calcular(){
        assertThat(porcentagem(TEN, valueOf(100))).isEqualTo(TEN);
    }
}
