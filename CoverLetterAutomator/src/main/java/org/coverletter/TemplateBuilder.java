package org.coverletter;

import java.text.MessageFormat;

public class TemplateBuilder {
    static String generateCoverLetter(String input, String[] args) {
        String coverLetterOutput = MessageFormat.format(input, args[0], args[1]);

        return coverLetterOutput;
    }
}
