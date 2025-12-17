package com.navidam.sdk.internal.melodia;

public enum Figura {
    CORCHEA(0.5),
    NEGRA(1.0),
    BLANCA(2.0),
    REDONDA(4.0);

    private final double negras;

    Figura(double negras) {
        this.negras = negras;
    }

    public long ticks(int ppq) {
        return Math.round(negras * ppq);
    }
}