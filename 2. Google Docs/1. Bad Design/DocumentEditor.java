import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<String> documentElements;
    private String renderDocument;

    public DocumentEditor() {
        documentElements = new ArrayList<>();
        renderDocument = "";
    }

    public void addText(String text) {
        documentElements.add(text);
        System.out.println("Text added successfully...");
    }

    public void addImage(String imagePath) {
        documentElements.add(imagePath);
        System.out.println("Image added successfully");
    }

    public String renderDocument() {
        if(renderDocument.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for(String element : documentElements) {
                if (element.length() > 4 && (element.endsWith(".jpg") || element.endsWith(".png"))) {
                    sb.append("[Image: ").append(element).append("]\n");
                } else {
                    sb.append(sb).append("\n");
                }
            } 
            renderDocument = sb.toString();
        }
        return renderDocument;
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