
credit_card_number = []
credit_card_type = ""
string_number = ""
credit_card_length = 0
is_valid = ""

def check_number_validity():
    user_number = None 
    is_input_number = True
    while(is_input_number):
            user_input = input("Enter Card details: ")
            print()
            if(user_input.isdigit()):
                is_input_number = False
                user_number = user_input
            else:
                print("Invalid Input! Check that your inputs are all numbers and withing the range of 13-16\nTry Again!\n")
   
    return user_number;

def check_length():
    global credit_card_length
    global string_number
    is_length_valid = True
    while(is_length_valid):
        print("Your card must be between 13 and 16 digits")
        number = check_number_validity()
        digit_length = len(number)
        if(digit_length >= 13 and digit_length <= 16 ):
            is_length_valid = False
            string_number = number
            credit_card_length = digit_length
            return credit_card_length
        
def check_the_credit_card_number_type():
    global credit_card_type   
    type_of_card = True
    while(type_of_card):
        print("Card Must Start with either \"4\", \"5\", \"37\", \"6\" ")
        check_length()
        if string_number.startswith("4"):   
            type_of_card = False
            credit_card_type = "VisaCard"
            return credit_card_type
   
        elif string_number.startswith("5"):
            type_of_card = False
            credit_card_type = "MasterCard"
            return credit_card_type           

        elif string_number.startswith("37"):
            type_of_card = False
            credit_card_type = "American Express Card"
            return credit_card_type 

        elif string_number.startswith("6"):
            type_of_card = False
            credit_card_type = "Discover Cards"
            return credit_card_type 

        else:
            check_length()

def check_the_credit_card_validity():
    global is_valid
    check_the_credit_card_number_type()

    for numbers in string_number:
        credit_card_number.append(int(numbers))
   
    add_even_index = 0 
    for even_count in range(len(credit_card_number)-2, -1, -2):
        multiply = credit_card_number[even_count] * 2
        if(len(str(multiply)) > 1):
            add = 0
            while(multiply > 0):
                extractor = multiply % 10
                add += extractor
                multiply = multiply//10
            add_even_index += add
        else:
            add_even_index+= multiply

    add_odd_index = 0
    for odd_count in range(len(credit_card_number)-1, -1, -2):
        multiply = credit_card_number[odd_count]
        add_odd_index+= multiply      
    
    sum_of_all = add_odd_index + add_even_index

    if(sum_of_all % 10 == 0):
        is_valid = "Valid"
        return is_valid
    else:
        is_valid = "Invalid"
        return is_valid

def void_out_put():
    global is_valid
    global credit_card_type
    global string_number
    global credit_card_length 
 
    check_the_credit_card_validity()
    print(f"""
************************************************************************************

** Credit Card Type  :            {credit_card_type}
** Credit Card Number:            {string_number}
** Credit Card Digit Length:      {credit_card_length}
** Credit Card Validity Status:   {is_valid}

************************************************************************************
""")

