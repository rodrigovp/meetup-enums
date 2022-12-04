package br.org.rodnet.meetupEnums.dominio;

import java.math.BigDecimal;

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
    public void aplicar(Imposto imposto) {
        totalMaisTaxas = totalMaisTaxas.add(imposto.aplicar(total));
    }

    public BigDecimal totalMaisTaxas() {
        return totalMaisTaxas;
    }
}
