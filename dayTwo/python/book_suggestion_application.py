from book_suggestion_app import *

print("""
-------------------------------------------------------------W E L C O M E TO THE B O O K SUGESTION SYSTEM-------------------------------------------------------------
                             
                                                                   WHAT WOULD YOU LIKE TO READ TODAY🤓️  """)

active = True
while(active):
    print("""
                        1. Get Suggestions
                        2. Add A Book
                        3. Remove a Book
                        4. Update A Book
                        5. Show Book Rack
                        0. Exit:  """
                                                          )
    user_choice = int(input("Enter your choice: "))
    match(user_choice):
        case 1: 
            print("-------------------Suggested Book ⌛️-------------------\n")
            suggestion = suggest_book_and_page()
            print(suggestion)

            prompt_again = input("Would you like to get another suggestion? [Yes/No]: ")
            while(prompt_again.lower() == "yes"):
                print("-------------------Suggested Book ⌛️-------------------\n")
                suggestion = suggest_book_and_page()
                print(suggestion)
                prompt_again = input("Would you like to get another suggestion? [Yes/No]: ")

        case 2:
            print("-------------------Adding A Book📚️-------------------\n")
            book_to_add = input("Enter the book title to add: ")
            adding_books = add_books(book_to_add)
            print(adding_books)

        case 3:
            print("-------------------Removing A Book📔️-------------------\n")
            book_to_remove = input("Enter the book title to remove: ")
            removing_books = remove_books(book_to_remove)
            print(removing_books)

        case 4:
            print("-------------------Updating Book📖️-------------------\n")
            old_book_to_update = input("Enter the name of old book title to update: ")
            new_book_to_update = input("Enter the name of new book title to update: ")
            updating_books = update_books(old_book_to_update, new_book_to_update)
            print(updating_books)

        case 5:
            print("-------------------Displaying Books📚️-------------------\n")
            display_books = show_all_books()
            print(display_books)

        case 0:
            active = False
            print("""
-----------------------------------------------------------------------------GoodBye!👋️-----------------------------------------------------------------------------\n""")
        case _:
            print("Wrong input Try Again")

