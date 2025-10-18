import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<String> documentElements;
    private String renderedDocument;

    public DocumentEditor() {
        documentElements = new ArrayList<>();
        renderedDocument = "";
    }

    public void addText(String text) {
        documentElements.add(text);
    }

    public void addImage(String imagePath) {
        documentElements.add(imagePath);
    }

    public String renderDocument() {
        if (renderedDocument.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (String element : documentElements) {
                if (element.length() > 4 && 
                   (element.endsWith(".jpg") || element.endsWith(".png"))) {
                    result.append("[Image: ").append(element).append("]\n");
                } else {
                    result.append(element).append("\n");
                }
            }
            renderedDocument = result.toString();
        }
        return renderedDocument;
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write(renderDocument());
            writer.close();
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }
    }

    
}
