import unittest
import level_two

class TestLevelTwoFunctions(unittest.TestCase):

    def test_that_re_occuring_numbers_are_returned_the_list(self):
    
        input_one = [1, 2, 3, 2, 4, 3]
        expected = level_two.re_occurring(input_one)
        actual = [2, 3]
        self.assertListEqual(actual, expected)

        input_two = [4, 6, 7, 8 ,4, 3, 5, 4]
        expected_two = level_two.re_occurring(input_two)
        actual_two = [4]
        self.assertListEqual(actual_two, expected_two)
        
    
        
    def test_that_the_list_is_sorted_in_a_descending_order(self):
    
        input_one = [5, 0 , 3, 0, 2, 0]
        expected = level_two.sort_list(input_one)
        actual = [5, 3 , 2 , 0, 0 , 0]
        self.assertListEqual(actual, expected)
        
        original_list = [4, 7, 9, 10, 49, 6]
        expected_two = level_two.sort_list(original_list)
        actual_two = [49, 10, 9, 7, 6, 4]
        self.assertListEqual(actual_two, expected_two)

