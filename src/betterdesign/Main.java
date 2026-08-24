package betterdesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// 1. Common interface for every document element
interface DocumentElement {
    String render();
}


// 2. Represents text
class TextElement implements DocumentElement {

    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}


// 3. Represents an image
class ImageElement implements DocumentElement {

    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return "[Picture: " + imagePath + "]";
    }
}


// 4. Represents a new line
class NewLineElement implements DocumentElement {

    @Override
    public String render() {
        return "\n";
    }
}


// 5. Document only manages document elements
class Document {

    private List<DocumentElement> elements = new ArrayList<>();

    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    public String render() {

        StringBuilder result = new StringBuilder();

        for (DocumentElement element : elements) {
            result.append(element.render());
        }

        return result.toString();
    }
}


// 6. Abstraction for saving
interface Persistence {
    void save(String data);
}


// 7. Saves the document into a file
class FileStorage implements Persistence {

    @Override
    public void save(String data) {

        try {
            FileWriter file = new FileWriter("better-document.txt");

            file.write(data);
            file.close();

            System.out.println("Document saved successfully.");

        } catch (IOException e) {
            System.out.println("Unable to save the document.");
        }
    }
}


// 8. Another possible storage option
class DatabaseStorage implements Persistence {

    @Override
    public void save(String data) {
        System.out.println("Saving document to database...");
    }
}


// 9. Handles editing operations
class DocumentEditor {

    private Document document;
    private Persistence storage;

    public DocumentEditor(Document document, Persistence storage) {
        this.document = document;
        this.storage = storage;
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addPicture(String path) {
        document.addElement(new ImageElement(path));
    }

    public void addNewLine() {
        document.addElement(new NewLineElement());
    }

    public String displayDocument() {
        return document.render();
    }

    public void saveDocument() {
        String content = displayDocument();
        storage.save(content);
    }
}


// 10. Main class
public class Main {

    public static void main(String[] args) {

        Document document = new Document();

        Persistence storage = new FileStorage();

        DocumentEditor editor =
                new DocumentEditor(document, storage);


        editor.addText("Welcome to my document!");
        editor.addNewLine();

        editor.addText("This is my better design example.");
        editor.addNewLine();

        editor.addPicture("nature.png");
        editor.addNewLine();

        editor.addText("Learning SOLID principles.");


        System.out.println(editor.displayDocument());

        editor.saveDocument();
    }
}