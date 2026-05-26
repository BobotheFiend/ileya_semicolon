import random
book_rack = ["Learn Python in 12 hrs", "Everything is F*ucked", "A Moving man", "Delusion or Confidence", "Take Take and Take Some More"]

def book_pages():
    pages = [];

    for count in range (1, 100+1):
        pages.append(count)
    return pages;
    

def suggest_books():
    if(book_rack == []):
        return f"No Sugestion!\nBook Rack is Empty!\n";

    suggested_book = random.choice(book_rack)
    return suggested_book

def pages():
    number_of_pages = book_pages()

    page = random.choice(number_of_pages)
    if(book_rack == []):
        return f"Nil\n";
    return page;


def suggest_book_and_page():
    page = pages()
    book_title = suggest_books()
    return f"Book Title: {book_title}\nPage: {page}";

def add_books(title):
    if (title not in book_rack):
        return f"Book Added Successfully\n";
    return f"Book already added\n";

def remove_books(title):
    if(title not in book_rack):
        return f"Book not found!\n";
    book_rack.remove(title)
    return f"Book removed Successfully!\n";


def update_books(old_title, new_title):
    if(old_title in book_rack):
        book_rack.remove(old_title)
        book_rack.append(new_title)
        return f"Book updated Successfully!\n";
    return f"Book not Found!\n";

def show_all_books():
    if(book_rack == []):
        return f"No Book(s) in Rack 🥲️";
    return book_rack;

#print(update_books("A Moving man", "Man Artica"))
#print(remove_books("Learn Python in 12 hrs"))
#print(remove_books("Everything is F*ucked"))
#print(remove_books("A Moving man"))
#print(remove_books("Delusion or Confidence"))
#print(remove_books("Take Take and Take Some More"))
#print(show_all_books())
#print(suggest_book_and_page())

listss = [4,5,6,7,8,9]
print(listss[-1])
