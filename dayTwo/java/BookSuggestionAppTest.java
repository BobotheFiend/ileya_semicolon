import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookSuggestionAppTest{


    @Test
    void testThatTheBookRackIsNotEmptyAndContainsFiveBooksAndItIsALengthOfFiveAfterConvertingItFromAnArrayList(){
        BookSuggestionApp activate = new BookSuggestionApp();

        String [] expectedBookRackAmount = activate.bookNames();
        assertEquals(5, expectedBookRackAmount.length);

        assertEquals(expectedBookRackAmount[4], "The Clean Coder");
    }

    @Test
    void testThatBookPageIsHundred(){
        BookSuggestionApp pageTest = new BookSuggestionApp();
        int [] expectedPagesCount = pageTest.bookPage();

        int [] actualPagesCount = new int [100];
        int index = 0;
        int number = 0;
        for (; index < actualPagesCount.length;){
            actualPagesCount[index++] = ++number;
        }

        assertArrayEquals(actualPagesCount, expectedPagesCount);
    }
    
    @Test
    void testThatTheBookReturnsARandomPageWithinOneToHundred(){
        BookSuggestionApp giveMePage = new BookSuggestionApp();

        for(int count = 0;  count < 100_000; count++){
            int expectedPage = giveMePage.pages();
            assertTrue(expectedPage >=1 && expectedPage <= 100);
        }
    }
    @Test
    void testThatTheSuggestBookFunctionSuggestsABooksAtRandomOrAMesseageIfEmpty(){
        BookSuggestionApp activate = new BookSuggestionApp();
        activate.bookRack.clear();
        String expected = activate.suggestBooks();
        assertEquals("No Suggestion!\nYour Book Collection is Empty\n", expected);

    }

    @Test
    void testThatTheBooksCanBeAddedToTheListOrMessageIsSentIfAlreadyAdded(){
        BookSuggestionApp activate = new BookSuggestionApp();
        String book = "ABC";
        String expected = activate.addBooks(book);
        String actual = "Book added Successfully!\n";
        assertEquals(actual, expected);

        String expectedBook = activate.addBooks("Oliver Twist");
        String actualBook = "Book already added\n";
        assertEquals(actualBook, expectedBook);
    }

    @Test
    void thatTheBooksFromTheRackCanBeRemovedIfInTheRackElseItThrowsBookNotFoundMessage(){
        BookSuggestionApp activate = new BookSuggestionApp();
        String book = "Semicolon";
        String expected = activate.removeBooks(book);
        String actual = "Book Not Found!\n";
        assertEquals(actual, expected);

        String bookTwo = "Oliver Twist";
        String expectedBook = activate.removeBooks(bookTwo);
        String actualBook = "Book removed Successfully!\n";
        assertEquals(actualBook, expectedBook);
    }

    @Test
    void thatBooksFromtheRackCanBeUpdatedBySearchingUpTheOldOneElseThrowsBookNotFound(){
        BookSuggestionApp activate = new BookSuggestionApp();
        String book = "Artificial Intelligence(AI)";
        String bookTwo = "Natural Stupidity(NS)";
        String expected = activate.updateBooks(book, bookTwo);
        String actual = "Book not found!\n";
        assertEquals(actual, expected);

        String bookOne = "Hidden Potential";
        String bookThree = "Potential Disappearance";
        String expectedBook = activate.updateBooks(bookOne, bookThree);
        String actualBook = "Book updated Successfully!\n";
        assertEquals(actualBook, expectedBook);
    }

    @Test
    void thatTheBookDisplaysAllCollectionsAvailableOntheRackElseItReturnsMessageIfNothingIsAvailable(){

        BookSuggestionApp activate = new BookSuggestionApp();
        String expected = activate.showAllBooks();
        String actual = java.util.Arrays.toString(activate.bookNames());
        assertEquals(actual, expected);

    }
}
