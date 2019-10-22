package com.ppkwu.lab2.service;

import org.springframework.stereotype.Service;

@Service
public class StringUtilityService {

    public boolean hasUpperCaseLetters(String text) {
        return !text.equals(text.toLowerCase());
    }

    public boolean hasLowerCaseLetters(String text) {
        return text.equals(text.toLowerCase());
    }

    public boolean hasAnySpecialSymbols(String text) {
        return !text.chars().allMatch(Character::isLetter);
    }

    public boolean hasAnyWhiteSpace(String text) {
        return text.contains(" ");
    }

    public boolean isDigit(String text) {
        return text.matches("\\d+(\\.\\d+)?");
    }

    public int getLengthOfText(String text) {
        return text.length();
    }

    public int getNumberOfUpperCaseLetters(String text) {
        return (int) text.codePoints()
                .filter(c -> c >= 'A' && c <= 'Z')
                .count();
    }

    public int getNumberOfLowerCaseLetters(String text) {
        return (int) text.codePoints()
                .filter(c -> c >= 'a' && c <= 'z')
                .count();
    }

    public int getNumberOfWhiteSpaces(String text) {
        int spaceCounter = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCounter++;
            }
        }

        return spaceCounter;
    }

}