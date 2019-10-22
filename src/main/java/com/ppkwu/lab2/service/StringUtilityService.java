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

    public int getLengthOfText(String text) {
        return text.length();
    }

}