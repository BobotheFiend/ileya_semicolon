import unittest
import level_three

class TestLevelThreeFunctions(unittest.TestCase):

    def test_that_when_two_list_are_passed_it_returns_the_a_merged_and_sorted_in_ascending(self):
    
        input_one = [3, 5, 1]
        input_two = [2, 4, 6]
        expected = level_three.merge_and_sort(input_one, input_two)
        actual = [1, 2, 3, 4, 5, 6]
        self.assertListEqual(actual, expected)

        second_input_one = [6, 8 ,4, 3, 5, 100]
        second_input_two = [44, 11, 20]
        expected_two = level_three.merge_and_sort(second_input_one, second_input_two)
        actual_two = [3, 4, 5, 6, 8, 11, 20, 44, 100] 
        self.assertListEqual(actual_two, expected_two)
        

