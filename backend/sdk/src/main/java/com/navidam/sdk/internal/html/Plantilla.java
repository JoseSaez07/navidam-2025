package com.navidam.sdk.internal.html;

public class Plantilla {

    private String titulo;

    private String path;

    private String content;

    public Plantilla(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public Plantilla titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Plantilla path(String path) {
        this.path = path;
        this.content = null;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Plantilla content(String content) {
        this.content = content;
        this.path = null;
        return  this;
    }
}
