package com.navidam.sdk.internal.melodia;

import javax.sound.midi.MidiChannel;

public enum Instrumento {

    // PIANOS (0–7)
    PIANO_ACUSTICO(0, "Piano acústico"),
    PIANO_ACUSTICO_BRILLANTE(1, "Piano acústico brillante"),
    PIANO_ELECTRICO_GRANDE(2, "Piano eléctrico (grand)"),
    PIANO_HONKY_TONK(3, "Piano honky-tonk"),
    PIANO_ELECTRICO_1(4, "Piano eléctrico 1 (Rhodes)"),
    PIANO_ELECTRICO_2(5, "Piano eléctrico 2 (chorus/FM)"),
    CLAVECIN(6, "Clavecín"),
    CLAVINET(7, "Clavinet"),

    // PERCUSIÓN CROMÁTICA (8–15)
    CELESTA(8, "Celesta"),
    GLOCKENSPIEL(9, "Glockenspiel"),
    CAJA_DE_MUSICA(10, "Caja de música"),
    VIBRAFONO(11, "Vibráfono"),
    MARIMBA(12, "Marimba"),
    XILOFONO(13, "Xilófono"),
    CAMPANAS_TUBULARES(14, "Campanas tubulares"),
    DULCIMER(15, "Dulcimer"),

    // ÓRGANOS (16–23)
    ORGANO_DRAWBAR(16, "Órgano (drawbar)"),
    ORGANO_PERCUSIVO(17, "Órgano percusivo"),
    ORGANO_ROCK(18, "Órgano rock"),
    ORGANO_IGLESIA(19, "Órgano de iglesia"),
    ORGANO_LENGUETA(20, "Órgano de lengüeta"),
    ACORDEON(21, "Acordeón"),
    ARMONICA(22, "Armónica"),
    ACORDEON_TANGO(23, "Acordeón de tango"),

    // GUITARRAS (24–31)
    GUITARRA_NYLON(24, "Guitarra acústica (nylon)"),
    GUITARRA_ACERO(25, "Guitarra acústica (acero)"),
    GUITARRA_JAZZ(26, "Guitarra eléctrica (jazz)"),
    GUITARRA_LIMPIA(27, "Guitarra eléctrica (limpia)"),
    GUITARRA_MUTED(28, "Guitarra eléctrica (mute)"),
    GUITARRA_OVERDRIVE(29, "Guitarra overdrive"),
    GUITARRA_DISTORSION(30, "Guitarra distorsión"),
    ARMONICOS_GUITARRA(31, "Armónicos de guitarra"),

    // BAJOS (32–39)
    BAJO_ACUSTICO(32, "Bajo acústico"),
    BAJO_ELECTRICO_DEDO(33, "Bajo eléctrico (dedo)"),
    BAJO_ELECTRICO_PUA(34, "Bajo eléctrico (púa)"),
    BAJO_FRETLESS(35, "Bajo fretless"),
    BAJO_SLAP_1(36, "Bajo slap 1"),
    BAJO_SLAP_2(37, "Bajo slap 2"),
    BAJO_SINTETICO_1(38, "Bajo sintético 1"),
    BAJO_SINTETICO_2(39, "Bajo sintético 2"),

    // CUERDAS (40–47)
    VIOLIN(40, "Violín"),
    VIOLA(41, "Viola"),
    VIOLONCHELO(42, "Violonchelo"),
    CONTRABAJO(43, "Contrabajo"),
    CUERDAS_TREMOLO(44, "Cuerdas trémolo"),
    CUERDAS_PIZZICATO(45, "Cuerdas pizzicato"),
    ARPA_ORQUESTAL(46, "Arpa orquestal"),
    TIMBALES(47, "Timbales"),

    // ENSAMBLE (48–55)
    ENSAMBLE_CUERDAS_1(48, "Ensamble de cuerdas 1"),
    ENSAMBLE_CUERDAS_2(49, "Ensamble de cuerdas 2"),
    CUERDAS_SINTETICAS_1(50, "Cuerdas sintéticas 1"),
    CUERDAS_SINTETICAS_2(51, "Cuerdas sintéticas 2"),
    CORO_AAHS(52, "Coro (aahs)"),
    VOCES_OOHS(53, "Voces (oohs)"),
    VOZ_SINTETICA(54, "Voz sintética"),
    GOLPE_ORQUESTA(55, "Golpe de orquesta"),

    // METALES (56–63)
    TROMPETA(56, "Trompeta"),
    TROMBON(57, "Trombón"),
    TUBA(58, "Tuba"),
    TROMPETA_SORDINA(59, "Trompeta con sordina"),
    TROMPA(60, "Trompa (French horn)"),
    SECCION_METALES(61, "Sección de metales"),
    METALES_SINTETICOS_1(62, "Metales sintéticos 1"),
    METALES_SINTETICOS_2(63, "Metales sintéticos 2"),

    // LENGÜETAS (64–71)
    SAXO_SOPRANO(64, "Saxofón soprano"),
    SAXO_ALTO(65, "Saxofón alto"),
    SAXO_TENOR(66, "Saxofón tenor"),
    SAXO_BARITONO(67, "Saxofón barítono"),
    OBOE(68, "Oboe"),
    CORNO_INGLES(69, "Corno inglés"),
    FAGOT(70, "Fagot"),
    CLARINETE(71, "Clarinete"),

    // FLAUTAS (72–79)
    PICCOLO(72, "Piccolo"),
    FLAUTA(73, "Flauta"),
    FLAUTA_DULCE(74, "Flauta dulce"),
    FLAUTA_PAN(75, "Flauta de pan"),
    BOTELLA_SOPLADA(76, "Botella soplada"),
    SHAKUHACHI(77, "Shakuhachi"),
    SILBATO(78, "Silbato"),
    OCARINA(79, "Ocarina"),

    // LEADS (80–87)
    LEAD_CUADRADA(80, "Lead 1 (onda cuadrada)"),
    LEAD_SIERRA(81, "Lead 2 (onda sierra)"),
    LEAD_CALLIOPE(82, "Lead 3 (calliope)"),
    LEAD_CHIFF(83, "Lead 4 (chiff)"),
    LEAD_CHARANG(84, "Lead 5 (charang)"),
    LEAD_VOZ(85, "Lead 6 (voz)"),
    LEAD_QUINTAS(86, "Lead 7 (quintas)"),
    LEAD_BAJO_Y_LEAD(87, "Lead 8 (bajo + lead)"),

    // PADS (88–95)
    PAD_NEW_AGE(88, "Pad 1 (new age)"),
    PAD_CALIDO(89, "Pad 2 (cálido)"),
    PAD_POLISINTETICO(90, "Pad 3 (polisintético)"),
    PAD_CORO(91, "Pad 4 (coro)"),
    PAD_ARQUEADO(92, "Pad 5 (bowed)"),
    PAD_METALICO(93, "Pad 6 (metálico)"),
    PAD_HALO(94, "Pad 7 (halo)"),
    PAD_BARRIDO(95, "Pad 8 (barrido)"),

    // FX (96–103)
    FX_LLUVIA(96, "FX 1 (lluvia)"),
    FX_BANDA_SONORA(97, "FX 2 (banda sonora)"),
    FX_CRISTAL(98, "FX 3 (cristal)"),
    FX_ATMOSFERA(99, "FX 4 (atmósfera)"),
    FX_BRILLO(100, "FX 5 (brillo)"),
    FX_DUENDES(101, "FX 6 (duendes)"),
    FX_ECOS(102, "FX 7 (ecos)"),
    FX_CIENCIA_FICCION(103, "FX 8 (ciencia ficción)"),

    // ÉTNICOS (104–111)
    SITAR(104, "Sitar"),
    BANJO(105, "Banjo"),
    SHAMISEN(106, "Shamisen"),
    KOTO(107, "Koto"),
    KALIMBA(108, "Kalimba"),
    GAITA(109, "Gaita"),
    FIDDLE(110, "Fiddle"),
    SHANAI(111, "Shanai"),

    // PERCUSIÓN / OTROS (112–119)
    CAMPANILLA(112, "Campanilla (tinkle bell)"),
    AGOGO(113, "Agogô"),
    TAMBORES_DE_ACERO(114, "Tambores de acero"),
    BLOQUE_DE_MADERA(115, "Bloque de madera"),
    TAMBOR_TAIKO(116, "Tambor taiko"),
    TOM_MELODICO(117, "Tom melódico"),
    TAMBOR_SINTETICO(118, "Tambor sintético"),
    PLATILLO_INVERTIDO(119, "Platillo invertido"),

    // EFECTOS SONOROS (120–127)
    RUIDO_TRASTES_GUITARRA(120, "Ruido de trastes de guitarra"),
    RUIDO_RESPIRACION(121, "Ruido de respiración"),
    ORILLA_MAR(122, "Orilla del mar"),
    PAJARO(123, "Pájaro"),
    TELEFONO(124, "Teléfono"),
    HELICOPTERO(125, "Helicóptero"),
    APLAUSOS(126, "Aplausos"),
    DISPARO(127, "Disparo");

    private final int program;
    private final String nombre;

    Instrumento(int program, String nombre) {
        this.program = program;
        this.nombre = nombre;
    }

    public static Instrumento fromProgram(int program) {
        for (Instrumento i : values()) {
            if (i.program == program) return i;
        }
        throw new IllegalArgumentException("Program fuera de rango (0–127): " + program);
    }

    public int getProgram() {
        return program;
    }

    public String getNombre() {
        return nombre;
    }

    public void aplicar(MidiChannel ch) {
        ch.programChange(program);
    }
}
