const prompt = require("prompt-sync")();
const bookRack = {suggest_book_and_page, add_books, remove_books, update_books, show_all_books} = require("./book_suggestion_app.js");

console.log("-------------------------------------------------------------W E L C O M E TO THE B O O K SUGESTION SYSTEM-------------------------------------------------------------")                       
 console.log("                                                                  WHAT WOULD YOU LIKE TO READ TODAY🤓️")

let suggestionStarted = true;
while(suggestionStarted){

    console.log(` 
    1. Get Suggestions
    2. Add A Book
    3. Remove A Book
    4. Update A Book
    5. Show all Books
    0. Exit

    `)


    const userInput = Number(prompt("What would like.... "))
            
    switch(userInput){
            
        case 1:
            process.stdout.write(`-------------------Suggested Book ⌛️-------------------\n `)
            let suggestion = suggest_book_and_page()
            console.log(suggestion)
            
            let anotherSuggestion = prompt("Would you like to get another suggestion? [yes/no]: ")
            
            while (anotherSuggestion.toLowerCase() == "yes"){
                process.stdout.write(`\n-------------------Suggested Book ⌛️-------------------\n `)
                suggestion = suggest_book_and_page()
                console.log(suggestion)
        
                anotherSuggestion = prompt("Would you like to get another suggestion? (yes/no): ")
            }
            break;
            
        case 2:
            console.log("-------------------Adding A Book📚️-------------------\n")
            let bookToAdd = prompt("Enter the book title to add: ")
            let addingBooks = add_books(bookToAdd)
            console.log(addingBooks)
            break;

        case 3:
            console.log("-------------------Removing A Book📔️-------------------\n")
            let bookToRemove = prompt("Enter the book title to remove: ")
            let removingBooks = remove_books(bookToRemove)
            console.log(removingBooks)
            break;

        case 4:
            console.log("-------------------Updating Book📖️-------------------\n")
            let oldBookToUpdate = prompt("Enter the name of old book title to update: ")
            let newBookToUpdate = prompt("Enter the name of new book title to update: ")
            let updatingBooks = update_books(oldBookToUpdate, newBookToUpdate)
            console.log(updatingBooks)
            break;
            
        case 5:
            console.log("-------------------Displaying Books📚️-------------------\n")
            let displayBooks = show_all_books()
            console.log(displayBooks)
            break;

        case 0:
            suggestionStarted = false
            console.log(`
-----------------------------------------------------------------------------GoodBye!👋️-----------------------------------------------------------------------------\n`)        
            break;

        default:
            console.log("Invalid Option!🫢️... Try again")
    }


}














         

                
                
        
