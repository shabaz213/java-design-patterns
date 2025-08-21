package com.shabaz.design.pattern.momento.exercise;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentState> states = new ArrayList<>();
    private int currentIndex;

    public VersionControl(DocumentState initialState) {
        this.currentIndex = 0;
        states.add(initialState);
    }

    public void save(DocumentState state) {
        states.add(state);
        currentIndex++;
    }

    public DocumentState undo() {
        if (currentIndex == 0)
            return states.get(currentIndex);
        else
            return states.get(--currentIndex);
    }

    public DocumentState redo() {
        if (currentIndex == (states.size() - 1))
            return states.get(currentIndex);
        else
            return states.get(++currentIndex);
    }
}
