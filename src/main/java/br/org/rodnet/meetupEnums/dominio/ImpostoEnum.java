package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.Calculadora.porcentagem;
import static java.math.BigDecimal.ONE;

enum ImpostoEnum implements Imposto{
    ISS{
        @Override
        public BigDecimal aplicar(BigDecimal valor) {
            return porcentagem(ONE, valor);
        }
    },
    ICMS{
        @Override
        public BigDecimal aplicar(BigDecimal valor) {
            return porcentagem(BigDecimal.valueOf(2), valor);
        }
    },
    PIS{
        @Override
        public BigDecimal aplicar(BigDecimal valor) {
            return BigDecimal.valueOf(3);
        }
    };

}
