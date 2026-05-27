//import random
let bookRack = ["JavScript How to be a Programmer", "Things Fall Apart", "The Glutton", "The Pain Of Knowing A Fool", "The Area Mama", "Happy Sad Happy Sad"];

function book_pages(){
    let pages = []
    let count = 0
    let numbers = 0
    for(; count < 100;){
        pages[count++] = ++numbers
    }
    return pages;
}   

function suggest_books(){
    if(bookRack.length === 0)
        return "No Sugestion!\nBook Rack is Empty!\n";

    let suggestedBook = Math.floor(Math.random() * bookRack.length)
    return bookRack[suggestedBook];
}

function pages(){
    let number_of_pages = book_pages()

    let page = Math.floor(Math.random() * number_of_pages.length)
    if(bookRack.length === 0){
        return "Nil\n";
    }
    return number_of_pages[page];
}

function suggest_book_and_page(){
    let page = pages()
    let book_title = suggest_books()
    return `\nBook Title: ${book_title}\nPage: ${page}`;
}

function add_books(title){
    if (bookRack.includes(title)){
        return "Book already added!\n";
    }
    else{
        bookRack.push(title)
        return "Book Added Successfully!\n";
    }
}

function remove_books(title){
    if(bookRack.includes(title)){
        bookRack.splice(bookRack.indexOf(title), 1)
        return "Book removed Successfully!\n";
    }
    return "Book not found!\n";
}

function update_books(oldTitle, newTitle){
    if(bookRack.includes(oldTitle)){
        bookRack.splice(bookRack.indexOf(oldTitle), 1)
        bookRack.push(newTitle)
        return "Book updated Successfully!\n";
    }
    return "Book not Found!\n";
}

function show_all_books(){
    if(bookRack.length === 0)
        return "No Book(s) in Rack 🥲️";
    return bookRack;
}

module.exports = {pages, bookRack, suggest_books, suggest_book_and_page, add_books, remove_books, update_books, show_all_books};


