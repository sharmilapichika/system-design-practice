package baddesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class SimpleDocument {
    private List<String> elements;
    private String output;

    public SimpleDocument() {
        elements = new ArrayList<>();
        output = "";
    }

    public void insertText(String text) {
        elements.add(text);
    }

    public void insertPicture(String path) {
        elements.add(path);
    }

    public String display() {
        if (output.isEmpty()) {
            StringBuilder builder = new StringBuilder();

            for (String item : elements) {
                if (item.endsWith(".jpg") || item.endsWith(".png")) {
                    builder.append("[Picture: ")
                            .append(item)
                            .append("]\n");
                } else {
                    builder.append(item).append("\n");
                }
            }

            output = builder.toString();
        }

        return output;
    }

    public void save() {
        try {
            FileWriter file = new FileWriter("mydocument.txt");
            file.write(display());
            file.close();

            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            System.out.println("Unable to save the document.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        SimpleDocument document = new SimpleDocument();

        document.insertText("Welcome to my document!");
        document.insertPicture("nature.png");
        document.insertText("This document is created for practice.");

        System.out.println(document.display());

        document.save();
    }
}
