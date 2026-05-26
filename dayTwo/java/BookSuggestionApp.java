public class BookSuggestionApp{

//
    java.util.ArrayList<String> bookRack = new java.util.ArrayList<>(java.util.List.of("Hidden Potential", "Java How to Program, Ditel", "The Subtule Art Of Not Giving A Fuck", "Oliver Twist", "The Clean Coder"));
    java.util.Random randomizer = new java.util.Random();


    public String [] bookNames(){
        String []  books = new String [bookRack.size()]; 
        int index = 0;
        for(; index < books.length; index++){
            books[index] = bookRack.get(index);
        }   
        return books;
    }
    public int [] bookPage(){
        int [] pages = new int [100];

        int index = 0;
        int page = 0;
        for(; index < pages.length; ){
            pages[index++] = ++page;
        }
        return pages;
    }

    public int pages(){        
        BookSuggestionApp givePages = new BookSuggestionApp();
        int [] numberofpages = givePages.bookPage();

        int suggestion = randomizer.nextInt(numberofpages.length);
        int suggestPages = numberofpages[suggestion];
        if(bookRack.isEmpty())
            return 0;
        return suggestPages;
    }

    public String suggestBooks(){
        BookSuggestionApp giveBooks = new BookSuggestionApp();
        
        if(bookRack.isEmpty()){
            String notification = String.format("""
            No Suggestion!%nYour Book Collection is Empty%n"""
                                                );
            return notification;
        }
        
        String [] books = giveBooks.bookNames();
        int bookSuggestion = randomizer.nextInt(books.length);

        String suggestBooks = books[bookSuggestion];

        return suggestBooks;
            
    }

    public String suggestBookPage(){
        BookSuggestionApp giveBooks = new BookSuggestionApp();
        String bookName = suggestBooks();
        int page = pages();

        String bookWithPage = String.format("""
           Book Title: %s%nPage: %d%n"""                                 
                                            ,bookName, page);
            return bookWithPage;
    }

    public String addBooks(String newBook){
        
        if(!bookRack.contains(newBook)){
                bookRack.add(newBook.trim());
            return "Book added Successfully!\n";
        }
        return"Book already added\n";
    }
        
    public String removeBooks(String bookName){
            if(bookRack.remove(bookName.trim()))
                return "Book removed Successfully!\n";
            else
                return "Book Not Found!\n";
    }

    public String updateBooks(String oldTitle, String newTitle){
        for (String bookTitle : bookNames()){
            if(bookTitle.equalsIgnoreCase(oldTitle.trim())){
                bookRack.remove(oldTitle);
                bookRack.add(newTitle.trim());
                return "Book updated Successfully!\n"; 
            }       
        }
        return "Book not found!\n";
       
    }

    public String showAllBooks(){
        BookSuggestionApp suggestNames = new BookSuggestionApp();
        int lengthOfRack = suggestNames.bookRack.size();
        if (lengthOfRack == 0){
            return "No Book(s) in Shelf 🥲️";
        }
        return java.util.Arrays.toString(bookNames());
    }
}
