package org.java.oop.snacks;

import java.math.BigDecimal;

public class ContoBancario {

    private int numeroDiConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroDiConto) {
        this.numeroDiConto = numeroDiConto;
        this.saldo = new BigDecimal(0);
    }

    public int getNumeroDiConto() {
        return this.numeroDiConto;
    }

    // Mostra saldo
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    // preleva
    public void preleva(BigDecimal prelievo) {
        this.saldo = this.saldo.subtract(prelievo);
    }

    // deposita
    public void deposita(BigDecimal deposito) {
        this.saldo = this.saldo.add(deposito);
    }

}