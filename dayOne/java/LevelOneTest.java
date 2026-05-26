import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelOneTest{

    @Test
    public void testThatArrayIsSplitIntoEvenAndOddElementsAndReturnsA2DArray(){

        int [] input = {45, 60, 3, 10, 9, 22};
        int [][] expected = LevelOne.oddEvenArraySplitter(input);
        int [][] actual = {{45, 3, 9}, {60, 10, 22}};

        assertArrayEquals(actual, expected);

        int [] inputTwo = {25, 88, 33, 100, 16, 36};
        int [][] expectedTwo = LevelOne.oddEvenArraySplitter(inputTwo);
        int [][] actualTwo = {{25, 33}, {88, 100, 16, 36}};

        assertArrayEquals(actualTwo, expectedTwo);
    }

    @Test
    public void testThatArrayIsTheSameElementInAReversedOrderdAndReturnsTrue(){

        int [] input = {45, 0, 8, 0, 45};
        boolean expected = LevelOne.palindromeArray(input);
        boolean actual = true;

        assertEquals(actual, expected);

        int [] inputTwo = {66, 6, 0, 6, 66};
        boolean expectedTwo = LevelOne.palindromeArray(input);

        assertTrue(expectedTwo);
    }
    @Test
    public void testThatArrayIsNotTheSameElementInAReversedOrderdAndReturnsFalse(){

        int [] input = {45, 44, 9, 9, 44};
        boolean expected = LevelOne.palindromeArray(input);
        boolean actual = false;

        assertEquals(actual, expected);

        int [] inputTwo = {10, 9, 6, 6, 10};
        boolean expectedTwo = LevelOne.palindromeArray(input);

        assertFalse(expectedTwo);
    }

    @Test
    public void testThatArraySortsIntoAllPerfectSquareElementsAndReturnsAPerfectSquaredNumbers(){

        int [] input = {4, 7, 9, 10, 16, 18};
        int [] expected = LevelOne.perfectSquareNumber(input);
        int [] actual = {4, 9, 16};

        assertArrayEquals(actual, expected);

        int [] inputTwo = {25, 88, 4, 100, 16, 36};
        int [] expectedTwo = LevelOne.perfectSquareNumber(inputTwo);
        int [] actualTwo = {25, 4, 100, 16, 36};

        assertArrayEquals(actualTwo, expectedTwo);
    }

    @Test
    public void testThatArraySortsIntoAllNonPerfectSquareElementsAndReturnsANonPerfectSquaredNumbers(){

        int [] input = {4, 7, 9, 10, 49, 6};
        int [] expected = LevelOne.nonPerfectSquareNumber(input);
        int [] actual = {4, -1, 9, -1, 49, -1};

        assertArrayEquals(actual, expected);

        int [] inputTwo = {25, 88, 4, 50, 100, 30, 16, 36, 19};
        int [] expectedTwo = LevelOne.nonPerfectSquareNumber(inputTwo);
        int [] actualTwo = {25, -1, 4, -1, 100, -1, 16, 36, -1};

        assertArrayEquals(actualTwo, expectedTwo);
    }

}
