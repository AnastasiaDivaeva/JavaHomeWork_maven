package divaeva.hw13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    private static final String NEXT = "next";
    private static final String END = "end";

    private static void processUserInput(Scanner scanner, FileWriter writer) throws IOException {
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals(NEXT)) {
                writer.write(System.lineSeparator());
            } else if (userInput.equals(END)) {
                break;
            } else {
                writeUserInput(writer, userInput);
            }
        }
    }

    private static void writeUserInput(FileWriter writer, String userInput) throws IOException {
        writer.write("\"" + userInput + "\",");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("Text1.csv")) {
            processUserInput(scanner, writer);
        }
    }
}

