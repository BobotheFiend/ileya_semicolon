import unittest

import credit_card_validator_functions

class test_credit_card_validator_functions(unittest.TestCase):

    def test_to_check_that_the_function_returns_only_whole_numbers(self):
        expected = credit_card_validator_functions.check_number_validity()
        actual = '458577478'
        self.assertEqual(actual, expected)

    def test_that_the_length_of_my_function_returned_is_alwakys_within_thirteen_and_sixteen(self):
#        input this number_to_check = 663722736273736 on the terminal
        expected = credit_card_validator_functions.check_length()
        actual = 15
        self.assertEqual(actual, expected)


    def test_that_the_exact_credit_card_type_is_returned_based_on_the_starting_digit(self):
#       input on the terminal a number that starts from 4 and the length is between 13 and 16
        expected = credit_card_validator_functions.check_the_credit_card_number_type()
        actual = "VisaCard"
        self.assertEqual(actual, expected)
#       input on the terminal a number that starts from 5 and the length is between 13 and 16
#        expected_for_mastercard = credit_card_validator_functions.check_the_credit_card_number_type()
#        actual_result_mastercard = "MasterCard"
#        self.assertEqual(actual_result_mastercard, expected_for_mastercard)
#       input on the terminal a number that starts with 37 and the length is between 13 and 16
#        expected_for_American_express = credit_card_validator_functions.check_the_credit_card_number_type()
#        actual_result_American_express = "American Express Card"
#        self.assertEqual(actual_result_American_express, expected_for_American_express)
#       input on the terminal a number that starts from 6 and the length is between 13 and 16
#        expected_for_siscover = credit_card_validator_functions.check_the_credit_card_number_type()
#        actual_result_discover = "Discover Cards"
#        self.assertEqual(actual_result_discover, expected_for_siscover)

    def test_that_the_validity_of_credit_card_number_is_valid_or_invalid(self):
#       input on the terminal this number 5399831619690404
        expected_invalid = credit_card_validator_functions.check_the_credit_card_validity()
        actual = "Invalid"
        self.assertEqual(actual, expected_invalid)
#       input on the terminal this number 4388576018410707
#        expected_valid = credit_card_validator_functions.check_the_credit_card_validity()
#        actual_result = "Valid"
#        self.assertEqual(actual_result, expected_valid)

