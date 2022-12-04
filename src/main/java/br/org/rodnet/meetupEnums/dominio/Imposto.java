package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

interface Imposto {

    public BigDecimal aplicar(BigDecimal valor);
}
