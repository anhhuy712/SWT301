package huyta.example;

public class AccountService {

    public boolean registerAccount(String username, String password, String email) {
        return password.length() > 6 && isValidEmail(email);
    }

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public boolean isStrongPassword(String password) {
        if (password == null) return false;
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }

    public String normalizeEmail(String email) {
        if (email == null) return null;
        return email.trim().toLowerCase();
    }
}

