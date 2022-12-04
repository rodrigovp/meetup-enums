package br.org.rodnet.meetupEnums.dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.org.rodnet.meetupEnums.dominio.ImpostoEnum.*;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

class PedidoTest {

    private Pedido pedido;
    private BigDecimal total;

    @BeforeEach
    void setUp(){
        total = valueOf(100);
        pedido = new Pedido(total);
    }

    @Test
    void aplicarUmImposto(){
        var totalMaisImpostos = total.add(ONE);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(total);

        pedido.aplicar(ISS);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(totalMaisImpostos);
    }

    @Test
    void aplicarDoisImpostos(){
        var totalMaisImpostos = total.add(valueOf(3));

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(total);

        pedido.aplicar(ISS, ICMS);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(totalMaisImpostos);
    }

    @Test
    void aplicarTodosImpostos(){
        var totalMaisImpostos = total.add(valueOf(6));

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(total);

        pedido.aplicar(ISS, ICMS, PIS);

        assertThat(pedido.total()).isEqualTo(total);
        assertThat(pedido.totalComImpostos()).isEqualTo(totalMaisImpostos);
    }
}
