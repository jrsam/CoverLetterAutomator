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
        System.out.println("Cover Letter Builder");
//        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("input.txt");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String input = new String(Files.readAllBytes(Paths.get("src/main/resources/input.txt")), StandardCharsets.UTF_8);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter company name");
            String company = scanner.next();

            System.out.println("Enter role");
            String role = scanner.next();

            String coverLetter = TemplateBuilder.generateCoverLetter(input, new String[] {company, role});
            System.out.println(coverLetter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}