package com.shabaz.design.pattern.momento.own;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.undo();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        editor.undo();
        editor.redo();
        System.out.println(editor.getContent());
        editor.redo();
        editor.redo();
        editor.redo();
    }
}
