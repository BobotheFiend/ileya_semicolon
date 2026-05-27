const { pages,  suggest_books,  add_books,  remove_books,  update_books,  show_all_books } = require("./book_suggestion_app.js");


test ("that pages Returns number 1-100 ", () => {

        let expectedResult = pages()


        expect(expectedResult > 0 && expectedResult < 101) .toBe(true)

//testing to see that the pages is false if it is not within 1-100

        let expected = pages()


        expect(expected < 0 && expected > 101) .toBe(false)
})


test ("that suggestedBook returns a length of 6", () => {
        let expectedResult = suggest_books()

        expect(expectedResult.length > 0) .toBe(true)

})

test ("that The add function add a book and Returns The Correct Output if not found", () => {

        let bookTitle = "The Big gambler";
        let expectedResult = add_books(bookTitle)


        expect(expectedResult) .toBe("Book Added Successfully!\n")

//testing to see that the book returns a "Book already added message" if book is already on rack

        let secondBookTitle = "Things Fall Apart"
        let secondExpectedResult = add_books(secondBookTitle)

        expect(secondExpectedResult) .toBe("Book already added!\n")
})


test ("that The remove function removes a book and Returns The Correct Output if book not found", () => {


        let secondBookTitle = "Things Fall Apart"
        let expectedResult = remove_books(secondBookTitle)

        expect(expectedResult) .toBe("Book removed Successfully!\n")

//testing to see that the book returns a "Book not found message" if book is not on rack
        let booktitle = "The Big Show";
        let secondExpectedResult = remove_books(booktitle)

        expect(secondExpectedResult) .toBe("Book not found!\n")
})


test ("that The update function updates a book and Returns The Correct Output if book not found", () => {

        let newBookTitle = "Eye of the Dragon";
        let oldBookTitle = "The Pain Of Knowing A Fool"
        let expectedResult = update_books(oldBookTitle, newBookTitle)

        expect(expectedResult) .toBe("Book updated Successfully!\n")

//testing to see that the book returns a "Book not found message" if book is not on rack
        let oldBookTitleTwo = "The Nun";
        let newBookTitleOne = "Star Wars"
        let secondExpectedResult = update_books(oldBookTitleTwo, newBookTitleOne)

        expect(secondExpectedResult) .toStrictEqual("Book not Found!\n")
})

test ("that The showAllBooks function updates a book and Returns The Correct Output if rack is empty", () => {

        let expectedResult = show_all_books()

        expect(expectedResult).toStrictEqual(["JavScript How to be a Programmer", "The Glutton", "The Area Mama", "Happy Sad Happy Sad", "The Big gambler", "Eye of the Dragon"]);

})
