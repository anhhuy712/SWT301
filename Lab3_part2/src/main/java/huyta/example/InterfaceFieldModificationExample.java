package huyta.example;

class Constants {
    public static int MAX_USERS = 100;
}

public class InterfaceFieldModificationExample {
    public static void main(String[] args) {
        Constants.MAX_USERS = 200;
        System.out.println("Max users allowed: " + Constants.MAX_USERS);
    }
}
