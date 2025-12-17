package com.navidam.sdk.internal.melodia;

public enum Nota {
    DO(60),
    DO_SOSTENIDO(61),
    RE(62),
    RE_SOSTENIDO(63),
    MI(64),
    FA(65),
    FA_SOSTENIDO(66),
    SOL(67),
    SOL_SOSTENIDO(68),
    LA(69),
    LA_SOSTENIDO(70),
    SI(71);

    private final int midi;

    Nota(int midi) {
        this.midi = midi;
    }

    public int getMidi() {
        return midi;
    }
}
