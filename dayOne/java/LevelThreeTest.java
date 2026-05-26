import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LevelThreeTest{

    @Test
    public void testThatTwoArrayIsPassedIntoTheMethodAndReturnsAConcatenatedListThatIsAscending(){
        LevelThree activate = new LevelThree();
        int [] input = {2,3,5,7};
        int [] secondInput = {4,9,25,49};
        int [] expectedOutput = activate.mergeSort(input, secondInput);
        int [] actualOutput = {2, 3, 4, 5, 7, 9, 25, 49};

        assertArrayEquals(actualOutput, expectedOutput);

        int [] inputTwo = {3, 5, 1};
        int [] secondInputTwo = {2, 4, 6};
        int [] secondExpectedOutput = activate.mergeSort(inputTwo, secondInputTwo);
        int [] secondActualOutput = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(secondActualOutput, secondExpectedOutput);
    }
}
