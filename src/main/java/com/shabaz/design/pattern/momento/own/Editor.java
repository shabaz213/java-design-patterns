package com.shabaz.design.pattern.momento.own;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private final List<String> contents = new ArrayList<>();
    private int currentIndex = -1;

    public String getContent() {
        return contents.get(currentIndex);
    }

    public void setContent(String content) {
        contents.add(content);
        currentIndex++;
    }

    public void undo() {
        if (currentIndex == -1)
            System.out.println("Nothing to undo");
        else
            currentIndex--;
    }

    public void redo() {
        if (currentIndex == (contents.size()-1))
            System.out.println("Nothing to redo");
        else
            currentIndex++;
    }
}
