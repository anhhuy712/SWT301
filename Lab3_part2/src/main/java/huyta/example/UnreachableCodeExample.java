package huyta.example;

public class UnreachableCodeExample {
    public static int getNumber() {
        return 42;
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
