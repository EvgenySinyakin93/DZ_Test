package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static String[] validNames;

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        validNames = new String[]{
                "Anya",
                "Sveta",
                "Olya",
                "Alexandra",
                "Ruslana",
                "Olesya",
                "Vika"
        };
    }
        // when:
        void validateNames(){
        for (int i = 0; i < validNames.length; i++){
            boolean isValid = main.validateNames(validNames[i]);
            Assertions.assertTrue(isValid);
        }
        // then:

    }
}