import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelTwoTest{

    @Test
    public void testThatTheElemntsInTheArrayReturnsTheMostOccuringNumbers(){

        int [] input = {1, 2, 3, 2, 4, 3};
        int [] expected = LevelTwo.mostOccuringNumber(input);
        int [] actual = {2, 3};

        assertEquals(actual, expected);

        int [] inputTwo = {66, 6, 0, 6, 66};
        int [] expectedTwo = LevelTwo.mostOccuringNumber(input);
        int [] actualTwo = {66, 6};

        assertArrayEquals(actualTwo, expectedTwo);
    }

    @Test
    public void testThatArraySortsIntoADescendingListAndItReturns(){

        int [] input = {5, 0 , 3, 0, 2, 0};
        int [] expected = LevelTwo.sort(input);
        int [] actual = {5, 3 , 2 , 0, 0 , 0};

        assertArrayEquals(actual, expected);

        int [] inputTwo = {25, 88, 4, 100, 16, 36};
        int [] expectedTwo = LevelTwo.sort(inputTwo);
        int [] actualTwo = {100, 88, 36, 16, 25, 25};

        assertArrayEquals(actualTwo, expectedTwo);
    }



}
