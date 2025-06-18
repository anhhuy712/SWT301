package huyta.example;

import java.io.File;
import java.io.FileReader;

public class PathTraversalExample {
    public void readFile(String filename) throws Exception {
        // Chặn các ký tự không an toàn
        if (filename.contains("..") || filename.contains("/") || filename.contains("\\")) {
            throw new IllegalArgumentException("Invalid filename");
        }

        File file = new File("/data/files/", filename);
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }
}
