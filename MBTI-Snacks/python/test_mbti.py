import unittest

import mbti

mbti.user_choices = ["A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B"]
class test_mbti_functions(unittest.TestCase):

    def test_that_the_question_has_twenty_items_and_twenty_questions_in_it(self):

        questions =  mbti.questions
        expected_length = len(questions)
        actual = 20
        self.assertEqual(actual, expected_length)

    def test_that_user_choices_can_take_choices(self):

        answers = mbti.user_choices
        expected_length = len(answers)
        actual_length = 20
        self.assertEqual(actual_length, expected_length)

    def test_that_the_user_responses_returns_MBTI_letter_to_get_personality_type_for_intovert_extrovert(self):
        choices = mbti.user_choices
        choices[0] ="B"
        choices[4] = "B"
        choices[8] = "A"
        choices[12] = "B"
        choices[16] = "A"
        expect = mbti.extroverted_VS_introverted()
        
        actual = "I";

        self.assertEqual(actual, expect);  

        second_test_choices = mbti.user_choices
        choices[0] ="B"
        choices[4] = "A"
        choices[8] = "A"
        choices[12] = "A"
        choices[16] = "A"
        expected = mbti.extroverted_VS_introverted()
        
        actual_result = "E";

        self.assertEqual(actual_result, expected)

    def test_that_the_user_responses_returns_MBTI_letter_to_get_personality_type_for_sensing_intuitive(self):
        choices = mbti.user_choices
        choices[1] ="A"
        choices[5] = "A"
        choices[9] = "A"
        choices[13] = "B"
        choices[17] = "A"
        expect = mbti.sensing_VS_intuitive()
        
        actual = "S";

        self.assertEqual(actual, expect)

        second_test_choices = mbti.user_choices
        choices[1] ="B"
        choices[5] = "B"
        choices[9] = "A"
        choices[13] = "B"
        choices[17] = "B"
        expected = mbti.sensing_VS_intuitive()
        
        actual_result = "N";

        self.assertEqual(actual_result, expected)   

    def test_that_the_user_responses_returns_MBTI_letter_to_get_personality_type_for_thinking_feeling(self):
        choices = mbti.user_choices
        choices[2] ="B"
        choices[6] = "B"
        choices[10] = "A"
        choices[14] = "B"
        choices[18] = "A"
        expect = mbti.thinking_VS_feeling()
        
        actual = "F";

        self.assertEqual(actual, expect)     

        second_test_choices = mbti.user_choices;
        choices[2] ="A"
        choices[6] = "B"
        choices[10] = "A"
        choices[14] = "B"
        choices[18] = "A"
        expected = mbti.thinking_VS_feeling()
        
        actual_result = "T";

        self.assertEqual(actual_result, expected)

    def test_that_the_user_responses_returns_MBTI_letter_to_get_personality_type_for_judging_perceptive(self):
        choices = mbti.user_choices;
        choices[3] ="B"
        choices[7] = "A"
        choices[11] = "B"
        choices[15] = "B"
        choices[19] = "A"
        expect = mbti.judging_VS_perceptive()
        
        actual = "P";

        self.assertEqual(actual, expect)

        second_test_choices = mbti.user_choices;
        choices[3] ="A"
        choices[7] = "A"
        choices[11] = "A"
        choices[15] = "B"
        choices[19] = "A"
        expected = mbti.judging_VS_perceptive()
        
        actual_result = "J";

        self.assertEqual(actual_result, expected)
