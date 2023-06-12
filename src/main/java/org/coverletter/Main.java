package org.coverletter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cover Letter Builder\n");

        try {
            String input = new String(Files.readAllBytes(Paths.get("src/main/resources/input.txt")), StandardCharsets.UTF_8);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter company name");
            String company = scanner.nextLine();

            System.out.println("Enter role");
            String role = scanner.nextLine();

            System.out.println("Enter skills");
            String skills = scanner.nextLine();

            String[] inputArgs = {company, role, skills};
            String coverLetter = TemplateBuilder.generateCoverLetter(input, inputArgs);
            System.out.println(coverLetter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}