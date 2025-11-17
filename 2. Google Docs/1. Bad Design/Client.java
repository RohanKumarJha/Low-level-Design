public class Client {
    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addText("Hi Rohan, How are you?");
        documentEditor.addImage("rohan.jpg");
        System.out.println(documentEditor.renderDocument());
    }
}
