package huyta.example;

class Printer {
    void print(String message) {
        System.out.println(message);
    }
}

class Report {
    private Printer printer;

    // Inject Printer qua constructor
    public Report(Printer printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}


