package com.shabaz.design.pattern.momento.exercise;

public class Document {
    private StringBuilder content = new StringBuilder();
    private String fontName = "Courier";
    private int fontSize = 12;

    public void write(String content) {
        this.content.append(content);
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState getState() {
        return new DocumentState(content.toString(), fontName, fontSize);
    }

    public void restore(DocumentState stateToRestore) {
        content = new StringBuilder(stateToRestore.getContent());
        fontName = stateToRestore.getFontName();
        fontSize = stateToRestore.getFontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content=" + content +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
