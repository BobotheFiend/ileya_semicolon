import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MbtiTest{


    @Test
    void testThatTheQuestionHasTwentyItemsAndTwentyQuestionsInIt(){

        int length = Mbti.questions.length;
        int actual = 20;

        assertEquals(actual, length);

        String getQuestionAtIndexTwo = Mbti.questions[2];
        String actualQuestion = "(A.) Logical, thinking, questioning          OR          (B.) Empathetic, feeling, accommodating ";
        assertEquals(actualQuestion, getQuestionAtIndexTwo);

        boolean expect = Mbti.questions[19].contains("(A.) Control, govern          OR          (B.) Latitude, freedom");
        assertTrue(expect, "(A.) Control, govern          OR          (B.) Latitude, freedom");
        
    }

    @Test
    void testThatUserChoicesHasTwentyItems(){

        int length = Mbti.userChoices.length;
        int actual = 20;

        assertEquals(actual, length);        
    }

    @Test
    void testThatNameFunctionPromptsForNameAndreturnsTheActualNameTyped(){

        String expect = Mbti.whatIsYourName();
        String actual = "NNAMDI AniakoR";

        assertEquals(actual, expect);
    }

    @Test
    void testThatNameFunctionReturnsUserResponseThatIsEitherAorB(){
        String [] responses = new String [20];
        String [] expect = Mbti.userResponseChoices();

        int count = 0;
        for(String answers : expect){
            if(answers.equals("A") || answers.equals("B")){
            responses[count] = answers;
            count++;
            }
        }
        String [] actual = responses;

        assertArrayEquals(actual, expect);
    }

    @Test
    void testThatUserResponsesReturnsMbtiLetterToGetPersonalityTypeForIntovertAndExtrovert(){

        String [] choices = Mbti.userChoices;
        choices[0] = "A";
        choices[4] = "B";
        choices[8] = "A";
        choices[12] = "B";
        choices[16] = "B";
        String expect = Mbti.extrovertedVsIntroverted();
        
        String actual = "I";

        assertEquals(actual, expect);
    }

    @Test
    void testThatUserResponsesReturnsMbtiLetterToGetPersonalityTypeForSensingAndIntuitive(){

        String [] choices = Mbti.userChoices;
        choices[1] = "A";
        choices[5] = "A";
        choices[9] = "A";
        choices[13] = "B";
        choices[17] = "A";
        String expect = Mbti.sensingVSintuitive();
        
        String actual = "S";

        assertEquals(actual, expect);
    }

    @Test
    void testThatUserResponsesReturnsMbtiLetterToGetPersonalityTypeForThinkingAndFeeling(){

        String [] choices = Mbti.userChoices;
        choices[2] = "B";
        choices[6] = "B";
        choices[10] = "A";
        choices[14] = "B";
        choices[18] = "A";
        String expect = Mbti.thinkingVSfeeling();
        
        String actual = "F";

        assertEquals(actual, expect);
    }

    @Test
    void testThatUserResponsesReturnsMbtiLetterToGetPersonalityTypeForJudgingAndPercepective(){

        String [] choices = Mbti.userChoices;

        choices[3] = "A";
        choices[7] = "B";
        choices[11] = "A";
        choices[15] = "B";
        choices[19] = "A";
        String expect = Mbti.judgingVSperceptive();
        
        String actual = "J";

        assertEquals(actual, expect);
    }

}
