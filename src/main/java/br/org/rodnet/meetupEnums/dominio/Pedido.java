package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

import static java.util.Arrays.stream;

class Pedido {

    private BigDecimal total;
    private BigDecimal totalMaisTaxas;
    public Pedido(BigDecimal total) {
        this.total = total;
        this.totalMaisTaxas = total;
    }
    public BigDecimal total() {
        return total;
    }

    public void aplicar(Imposto ... impostos){
        totalMaisTaxas = stream(impostos)
                .map(imposto -> imposto.aplicar(total))
                .reduce(totalMaisTaxas, BigDecimal::add);
    }

    public BigDecimal totalComImpostos() {
        return totalMaisTaxas;
    }
}
