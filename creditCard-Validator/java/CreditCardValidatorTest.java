import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CreditCardValidatorTest{


    @Test
    void thatTheNumberInputedReturnsTheValidNumberLengthAndReturnsZeroForInvalidLength(){
        long userInput = 56478625573839L;
        int expected = CreditCardValidator.checkNumberLength(userInput);
        int actual = 14;
        assertEquals(actual, expected);

        long secondUserInput = 564786255;
        int expectedSecondResult = CreditCardValidator.checkNumberLength(secondUserInput);
        int actualResult = 0;
        assertEquals(actualResult, expectedSecondResult);

        long thirdUserInput = 5647862554757494L;
        int expectedThirdResult = CreditCardValidator.checkNumberLength(secondUserInput);
        int actualThirdResult = 0;
        assertEquals(actualResult, expectedSecondResult);

        assertTrue(expected >=13 && expected <=16);
    }

    @Test
    void thatTheCorrectCardTypeIsReturnedBasedOnTheFirstDigit(){
        long firstCreditCardInput = 463672888282282L;
        String firstExpectedCardType = CreditCardValidator.checkCardType(firstCreditCardInput);
        String actualCardTypeOne = "VisaCard";
        assertEquals(actualCardTypeOne, firstExpectedCardType);

        long secondCreditCardInput = 5636882822825L;
        String secondExpectedCardType = CreditCardValidator.checkCardType(secondCreditCardInput);
        String actualCardTypeTwo = "MasterCard";
        assertEquals(actualCardTypeTwo, secondExpectedCardType);

        long thirdCreditCardInput = 373632901111282L;
        String thirdExpectedCardType = CreditCardValidator.checkCardType(thirdCreditCardInput);
        String actualCardTypeThree = "American ExpressCard";
        assertEquals(actualCardTypeThree, thirdExpectedCardType);

        long fourthCreditCardInput = 61985747111190L;
        String fourthExpectedCardType = CreditCardValidator.checkCardType(fourthCreditCardInput);
        String actualCardTypeFour = "DiscoverCard";
        assertEquals(actualCardTypeFour, fourthExpectedCardType);

        assertEquals(null, CreditCardValidator.checkCardType(33456884928374049L));
    }

    @Test
    void testThatTheFunctionChecksIfAnActualCreditCardNumberIsValidOrNot(){
        long firstCreditNumber = 4388576018402626L;
        String firstExpectedValidity = CreditCardValidator.checkValidity(firstCreditNumber);
        String actualValidityOne = "Invalid";
        assertEquals(actualValidityOne, firstExpectedValidity);

        long secondCreditNumber = 4388576018410707L;
        String secondExpectedValidity = CreditCardValidator.checkValidity(secondCreditNumber);
        String actualValidityTwo = "Valid";
        assertEquals(actualValidityTwo, secondExpectedValidity);
    }
}
