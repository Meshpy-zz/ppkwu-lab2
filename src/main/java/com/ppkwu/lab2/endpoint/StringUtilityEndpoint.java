package com.ppkwu.lab2.endpoint;

import com.ppkwu.lab2.service.StringUtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringUtilityEndpoint {

    private StringUtilityService stringUtilityService;

    @Autowired
    public StringUtilityEndpoint(StringUtilityService stringUtilityService) {
        this.stringUtilityService = stringUtilityService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/length/{text}")
    public ResponseEntity<Integer> getLengthOfText(@PathVariable String text) {
        Integer lengthOfText = stringUtilityService.getLengthOfText(text);
        return ResponseEntity.ok(lengthOfText);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contain/whitespace/{text}")
    public ResponseEntity<Boolean> hasAnyWhiteSpace(@PathVariable String text) {
        Boolean hasAnyWhiteSpace = stringUtilityService.hasAnyWhiteSpace(text);
        return ResponseEntity.ok(hasAnyWhiteSpace);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contain/uppercase/{text}")
    public ResponseEntity<Boolean> hasAnyUpperCaseLetter(@PathVariable String text) {
        Boolean hasAnyUpperCase = stringUtilityService.hasUpperCaseLetters(text);
        return ResponseEntity.ok(hasAnyUpperCase);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contain/lowercase/{text}")
    public ResponseEntity<Boolean> hasAnyLowerCaseLetter(@PathVariable String text) {
        Boolean hasAnyLowerCase = stringUtilityService.hasLowerCaseLetters(text);
        return ResponseEntity.ok(hasAnyLowerCase);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contain/specialsymbol/{text}")
    public ResponseEntity<Boolean> hasAnySpecialSymbol(@PathVariable String text) {
        Boolean hasAnySpecialSymbol = stringUtilityService.hasAnySpecialSymbols(text);
        return ResponseEntity.ok(hasAnySpecialSymbol);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/digit/{text}")
    public ResponseEntity<Boolean> isDigit(@PathVariable String text) {
        Boolean isDigit = stringUtilityService.isDigit(text);
        return ResponseEntity.ok(isDigit);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/count/uppercase/{text}")
    public ResponseEntity<Integer> getNumberOfUpperCaseLetters(@PathVariable String text) {
        Integer numberOfUpperCaseLetters = stringUtilityService.getNumberOfUpperCaseLetters(text);
        return ResponseEntity.ok(numberOfUpperCaseLetters);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/count/lowercase/{text}")
    public ResponseEntity<Integer> getNumberOfLowerCaseLetters(@PathVariable String text) {
        Integer numberOfLowerCaseLetters = stringUtilityService.getNumberOfLowerCaseLetters(text);
        return ResponseEntity.ok(numberOfLowerCaseLetters);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/count/whitespaces/{text}")
    public ResponseEntity<Integer> getNumberOfWhiteSpaces(@PathVariable String text) {
        Integer numberOfWhiteSpaces = stringUtilityService.getNumberOfWhiteSpaces(text);
        return ResponseEntity.ok(numberOfWhiteSpaces);
    }

}