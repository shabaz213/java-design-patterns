package com.shabaz.design.pattern.momento.exercise;

public class DocumentState {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
