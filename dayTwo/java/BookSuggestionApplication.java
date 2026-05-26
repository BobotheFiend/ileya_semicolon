public class BookSuggestionApplication{
    static void main(String... nnamdi){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        BookSuggestionApp suggest = new BookSuggestionApp();
//        java.util.ArrayList<Integer> 
        System.out.println("""
-------------------------------------------------------------W E L C O M E TO THE B O O K SUGESTION SYSTEM-------------------------------------------------------------
                             WHAT WOULD YOU LIKE TO READ TODAY🤓️  """
                                );

        String loggedIn = "Yes";
        boolean active = loggedIn.equalsIgnoreCase("Yes");
        while(active){
            System.out.printf("""
                        1. Get Suggestions
                        2. Add A Book
                        3. Remove a Book
                        4. Update A Book
                        5. Show Book Rack
                        0. Exit%n%nEnter your choice: """
                                                          );
            int userChoice = inputCollector.nextInt();
            inputCollector.nextLine();

            switch(userChoice){
                case 1:
                    System.out.print("-------------------Suggested Book ⌛️-------------------\n");
                    String Suggestion = suggest.suggestBookPage();
                    System.out.println(Suggestion);
                    break;

                case 2: 
                    System.out.print("-------------------Adding A Book-------------------\n");
                    System.out.print("Enter the Book you would like to add: ");
                    String bookToAdd = inputCollector.nextLine();
                    String addABook = suggest.addBooks(bookToAdd);
                    System.out.println(addABook);
                    break;
                
                case 3:
                    System.out.print("-------------------Removing A Book-------------------\n");
                    System.out.print("Enter the Book you would like to remove: ");
                    String bookToRemove = inputCollector.nextLine();
                    String removeABook = suggest.removeBooks(bookToRemove);
                    System.out.println(removeABook);
                    break;

                case 4:
                    System.out.print("-------------------Updating Book Rack🤓️-------------------\n");
                    System.out.print("Enter the name of the old book: ");
                    String oldBookToUpdate = inputCollector.nextLine();
                    System.out.print("Enter new book title: ");
                    String newBookToUpdate = inputCollector.nextLine();

                    String updateABook = suggest.updateBooks(oldBookToUpdate, newBookToUpdate);
                    System.out.println(updateABook);
                    break;

                case 5:
                    System.out.print("-------------------Your current Book Rack Looks like this-------------------\n");
                    String bookRack = suggest.showAllBooks();
                    System.out.println(bookRack);
                    break;

                case 0:
                    loggedIn = "No";
                    if(loggedIn.equalsIgnoreCase("No")) active = false;

                    System.out.print("""
-----------------------------------------------------------------------------GoodBye!-----------------------------------------------------------------------------\n"""
                                    );
                    break;

                default: System.out.print("Wrong input Try Again");
            }


        }            


    }


}
