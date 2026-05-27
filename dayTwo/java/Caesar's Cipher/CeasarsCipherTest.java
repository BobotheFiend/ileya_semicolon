import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CeasarsCipherTest{


    @Test
    void thatTheFuctionReturnsAMessage(){
        int positionToMove = 3;
        String message = "EOB";

        String expected = CeasarsCipher.caesarShift(message,positionToMove);
        assertNotNull(expected);
    }

    @Test
    void thatTheFuctionReturnsWrongMessageWithTheNumberOfShiftAsFalse(){
        int positionToMove = 8;
        String message = "ABC";

        String expected = CeasarsCipher.caesarShift(message,positionToMove);
        String actual = "XYZ";
        assertNotEquals(expected, actual);
    }

    @Test
    void thatTheFuctionReturnsTheMessageThatAlignsWithTheNumberOfShift(){
        int positionToMove = 3;
        String message = "call me tomorrow";

        String expected = CeasarsCipher.caesarShift(message,positionToMove);
        String actual = "FDOO PH WRPRUURZ";
        assertEquals(actual, expected);
    }

    @Test
    void thatTheDecryptFuctionReturnsTheMessageThatAlignsWithTheNumberOfShift(){
        int positionToMove = 3;
        String message = "FDOO PH WRPRUURZ";

        String expected = CeasarsCipher.decryptCaesarShift(message,positionToMove);
        String actual = "CALL ME TOMORROW";
        assertEquals(actual, expected);
    }

    @Test
    void thatTheDecryptFuctionReturnsWrongMessageWithTheNumberOfShift(){
        int positionToMove = 3;
        String message = "d";

        String expected = CeasarsCipher.decryptCaesarShift(message,positionToMove);
        String actual = "Z";
        assertNotEquals(actual, expected);
    }
}
