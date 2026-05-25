import unittest
import level_one

class TestLevelOneFunctions(unittest.TestCase):

    def test_that_even_numbers_are_separated_from_odd_numbers(self):
    
        input_one = [45, 60, 3, 10, 9, 22]
        expected = level_one.odd_even_split(input_one)
        actual = [[45, 3 , 9] , [60 , 10, 22 ]]
        self.assertListEqual(actual, expected)
        
    def test_that_list_return_false_if_not_palindrome_and_true_if_palindrome(self):
    
        input_one = [45, 60, 3, 10, 9, 22]
        expected = level_one.palindrome_list(input_one)
        self.assertFalse(expected)

        input_two = [45, 0, 8, 0, 45 ]
        expected_two = level_one.palindrome_list(input_two)
        self.assertTrue(expected_two)
        
        
    def test_that_perfect_square_number_list_is_returned(self):
    
        input_one = [4, 7, 9, 10, 16, 18] 
        expected = level_one.perfect_square_list(input_one)
        actual = [4, 9, 16]
        self.assertListEqual(actual, expected)
        
        original_list = [4, 7, 9, 10, 49, 6]
        expected_two = level_one.perfect_square_list(original_list)
        actual_two = [4, 9, 49]
        self.assertListEqual(actual_two, expected_two)

    def test_that_non_perfect_square_number_list_is_replaced_with_minus_one_and_returned(self):
    
        input_one = [4, 7, 9, 10, 16, 18] 
        expected = level_one.non_perfect_square_list(input_one)
        actual = [4, -1,  9, -1, 16, -1]
        self.assertListEqual(actual, expected)
        
        original_list = [4, 7, 9, 10, 49, 6]
        expected_two = level_one.non_perfect_square_list(original_list)
        actual_two = [4, -1, 9, -1, 49, -1]
        self.assertListEqual(actual_two, expected_two)
