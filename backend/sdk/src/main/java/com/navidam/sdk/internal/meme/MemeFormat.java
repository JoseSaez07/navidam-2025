package com.navidam.sdk.internal.meme;

public enum MemeFormat {
    PNG("png"), JPG("jpg"), WEBP("webp"), GIF("gif");
    private final String ext;
    MemeFormat(String ext) { this.ext = ext; }
    public String ext() { return ext; }
}