package com.linkelist.undoredo;

public class Main {
	 public static void main(String[] args) {

		 TextEditor editor = new TextEditor();
		 
		 editor.addState("Himesh");
		 editor.addState("Himesh Kurmi");
		 editor.addState("Himesh Kurmi is");
		 editor.addState("Himesh Kurmi is best ");
		 
		 editor.displayCurrentState();
		 
		 editor.undo();
		 editor.displayCurrentState();
		 
		 editor.undo();
		 editor.displayCurrentState();
		 
		 editor.redo();
		 editor.displayCurrentState();
		 
		 editor.addState("Himesh Creator");
		 editor.displayCurrentState();
		 	
		 editor.redo(); 
	 }
}
