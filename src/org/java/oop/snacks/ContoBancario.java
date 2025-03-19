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
    public boolean preleva(BigDecimal prelievo) {
        if(prelievo.compareTo(new BigDecimal(0)) == 1 && this.saldo.compareTo(prelievo) == 1) {
            this.saldo = this.saldo.subtract(prelievo);
            return true;
        }
        return false;
    }

    // deposita
    public void deposita(BigDecimal deposito) {
        if (deposito.compareTo(new BigDecimal(0)) == 1) {
            this.saldo = this.saldo.add(deposito);
        }
    }

}