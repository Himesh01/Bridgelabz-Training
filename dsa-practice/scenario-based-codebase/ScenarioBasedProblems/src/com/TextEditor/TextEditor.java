package com.TextEditor;
import java.util.Stack;

public class TextEditor {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditor() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
    }

    // Delete last n characters
    public void delete(int length) {
        if (length > content.length()) return;

        String deletedText =
                content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());

        undoStack.push(new Action("delete", deletedText));
        redoStack.clear();
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) return;

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content.delete(
                    content.length() - action.text.length(),
                    content.length());
        } else if (action.type.equals("delete")) {
            content.append(action.text);
        }

        redoStack.push(action);
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) return;

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content.append(action.text);
        } else if (action.type.equals("delete")) {
            content.delete(
                    content.length() - action.text.length(),
                    content.length());
        }

        undoStack.push(action);
    }

    // Display content
    public void display() {
        System.out.println("Text: " + content);
    }
}
