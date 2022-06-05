package resturantManagemnt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class ReceipeReader {
    public static void Reader() {
        FileReader file;

        try {
            file = InputReader.Reader("receipe.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
             InputReader.updateReceipe(scan.nextLine());
            }

        }
    }
