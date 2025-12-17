package com.navidam.sdk.internal.meme;


public final class MemegenText {
    private MemegenText() {}

    public static String line(String s) {
        if (s == null || s.isBlank()) return "_";

        String out = s;

        out = out.replace("_", "__");
        out = out.replace("-", "--");

        out = out.replace("\n", "~n");
        out = out.replace(" ", "_");

        out = out.replace("?", "~q");
        out = out.replace("&", "~a");
        out = out.replace("%", "~p");
        out = out.replace("#", "~h");
        out = out.replace("/", "~s");
        out = out.replace("\\", "~b");
        out = out.replace("<", "~l");
        out = out.replace(">", "~g");
        out = out.replace("\"", "''");

        return out;
    }
}
