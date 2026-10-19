package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStringBuilder {

    private StringBuilder text;

    private Deque<String> history;

    public MyStringBuilder() {
        this.text = new StringBuilder();
        this.history = new ArrayDeque<>();
    }
    public void append(String value) {
        history.push(text.toString());
        text.append(value);
    }

    public void undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();
            text.replace(0, text.length(), previousState);
        }
    }
    @Override
    public String toString() {
        return text.toString();
    }

}
