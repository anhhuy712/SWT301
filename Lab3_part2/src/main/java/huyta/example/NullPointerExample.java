package huyta.example;

public class NullPointerExample {
    public static void main(String[] args) {
        String text = ""; // hoặc từ input nào đó đảm bảo không null
        if (text.length() > 0) {
            System.out.println("Text is not empty");
        }
    }
}
