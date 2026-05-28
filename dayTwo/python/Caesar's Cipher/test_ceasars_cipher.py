import unittest
import ceasars_cipher

class test_ceasars_cipher(unittest.TestCase):

    def test_that_the_function_accepts_two_input_and_return_a_message(self):
        position_to_move = 3
        message = "CALL ME Tomorrow"

        expected = ceasars_cipher.caesar_shift(message, position_to_move)
        actual = "FDOO PH Wrpruurz"
        self.assertEqual(actual, expected)

    def test_that_the_function_accepts_two_input_and_return_a_message_where_the_message_has_space(self):
        position_to_move = 5
        message = "FOOD all GOOD"

        expected = ceasars_cipher.caesar_shift(message, position_to_move)
        actual = "KTTI fqq LTTI"
        self.assertEqual(actual, expected)

    def test_that_the_function_is_returns_wrong_message(self):
        position_to_move = 10
        message = "Hamboning"

        expected = ceasars_cipher.caesar_shift(message, position_to_move)
        actual = "RJUKXVVVR"
        self.assertNotEqual(actual, expected)

    def test_that_the_function_accepts_two_input_and_return_a_message_from_a_decrpyted_text(self):
        position_to_move = 3
        message = "FDOO PH WRPRUURZ"

        expected = ceasars_cipher.decrypt_caesar_shift(message, position_to_move)
        actual = "CALL ME TOMORROW"
        self.assertEqual(actual, expected)

    def test_that_the_function_accepts_two_input_and_return_a_message_from_a_decrpyted_text_message_where_the_message_has_space(self):
        position_to_move = 5
        message = "ktti FQQ LttI"

        expected = ceasars_cipher.decrypt_caesar_shift(message, position_to_move)
        actual = "food ALL GooD"
        self.assertEqual(actual, expected)

    def test_that_the_function_accepts_two_input_and_return_a_message_from_a_decrpyted_text_returns_wrong_message(self):
        position_to_move = 3
        message = "RJUK X VSVR"

        expected = ceasars_cipher.decrypt_caesar_shift(message, position_to_move)
        actual = "HAMB O NING"
        self.assertNotEqual(actual, expected)
