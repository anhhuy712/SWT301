package huyta.example;

import java.io.*;
import java.util.logging.Logger;

public class ResourceLeakExample {
    private static final Logger logger = Logger.getLogger(ResourceLeakExample.class.getName());

    public void readFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                logger.info(line);
                line = br.readLine();
            }
        }
    }
}

