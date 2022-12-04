package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

class PedidoTest {

    @Test
    void aplicarUmImposto(){
        var total = valueOf(100);
        var totalMaisTaxas = total.add(BigDecimal.ONE);
        var pedido = new Pedido(total);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(total);

        pedido.aplicar(new ISS());

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(totalMaisTaxas);
    }

    @Test
    void aplicarDoisImpostos(){
        var total = valueOf(100);
        var totalMaisTaxas = total.add(valueOf(3));
        var pedido = new Pedido(total);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(total);

        pedido.aplicar(new ISS());
        pedido.aplicar(new ICMS());

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(totalMaisTaxas);
    }

    @Test
    void aplicarTodosImpostos(){
        var total = valueOf(100);
        var totalMaisTaxas = total.add(valueOf(6));
        var pedido = new Pedido(total);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(total);

        pedido.aplicar(new ISS());
        pedido.aplicar(new ICMS());
        pedido.aplicar(new PIS());

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalMaisTaxas()).isEqualTo(totalMaisTaxas);
    }
}
