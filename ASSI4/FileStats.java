import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStats <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not a regular file.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            int lines = 0;
            int characters = 0;
            int words = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines++;
                characters += line.length();
                words += line.trim().split("\\s+").length;
            }

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of words: " + words);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        }
    }
}
