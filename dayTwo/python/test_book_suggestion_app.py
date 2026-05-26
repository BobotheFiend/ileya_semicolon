import unittest
import book_suggestion_app

class test_for_book_suggestion_app(unittest.TestCase):

    def test_that_book_page_suggest_is_between_one_and_hundred(self):
        index = book_suggestion_app.book_pages()
        first_index = index[0]
        last_index = index[-1]

        actual_for_first = 1
        actual_for_second = 100    
        self.assertEqual(first_index, actual_for_first)
        self.assertEqual(actual_for_second, last_index)

    def test_that_the_page_returns_a_number_between_one_nd_hundred(self):
        expected = book_suggestion_app.pages()
        actual = expected >=1 and expected <= 100
        self.assertTrue(expected, actual)
    
    def test_that_book_is_added(self):
    
       expected = book_suggestion_app.add_books("HimNNAMDI the Brave")
       actual = "Book Added Successfully\n"
       self.assertEqual(expected, actual)

       expected_result = book_suggestion_app.add_books("A Moving man")
       actual_result = "Book already added\n"
       self.assertEqual(expected_result, actual_result)

    def test_that_book_is_removed(self):
    
       expected = book_suggestion_app.remove_books("Take Take and Take Some More")
       actual = "Book removed Successfully!\n"
       self.assertEqual(expected, actual)

       expected_result = book_suggestion_app.remove_books("Feed Me More")
       actual_result = "Book not found!\n"
       self.assertEqual(expected_result, actual_result)

    def test_that_book_is_updated(self):
    
       expected = book_suggestion_app.update_books("Delusion or Confidence","The Wonders Of The World")
       actual = "Book updated Successfully!\n"
       self.assertEqual(expected, actual)

       expected_result = book_suggestion_app.update_books("Twist of Fate","Justice League")
       actual_result = "Book not Found!\n"
       self.assertEqual(expected_result, actual_result)

    def test_that_the_return_list_return_the_current_list(self):

        book_suggestion_app.book_rack.clear()
        expected = book_suggestion_app.show_all_books()
        actual = "No Book(s) in Rack 🥲️"
        self.assertEqual(expected, actual)

