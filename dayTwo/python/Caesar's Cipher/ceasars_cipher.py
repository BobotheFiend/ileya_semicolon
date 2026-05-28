def caesar_shift(message, key):

    new_message = ""
    alphabets_upper = ""
    alphabets_lower = ""
    for number in range(65,90+1):
        alphabets_upper += chr(number)
    for lower_caps_number in range(97,122+1):
        alphabets_lower += chr(lower_caps_number)
  
    for letter in message:
        if (letter.isalpha() and letter.isupper()):
            for character in alphabets_upper:
                if letter == character:
                    converting = (alphabets_upper.index(character) + key ) % 26
                    new_message += alphabets_upper[converting]

        elif (letter.isalpha() and letter.islower()):
            for character in alphabets_lower:
                if letter == character:
                    converting = (alphabets_lower.index(character) + key ) % 26
                    new_message += alphabets_lower[converting]
        else:
            new_message += letter                  
    return new_message


def decrypt_caesar_shift(message, key):

    new_message = ""
    alphabets_upper = ""
    alphabets_lower = ""
    for number in range(65,90+1):
        alphabets_upper += chr(number)
    for lower_caps_number in range(97,122+1):
        alphabets_lower += chr(lower_caps_number)


    for letter in message:
        if (letter.isalpha() and letter.isupper()):
            for character in alphabets_upper:
                if letter == character:
                    converting = (alphabets_upper.index(character) - key + 26) % 26
                    new_message += alphabets_upper[converting]

        elif (letter.isalpha() and letter.islower()):
            for character in alphabets_lower:
                if letter == character:
                    converting = (alphabets_lower.index(character) - key + 26 ) % 26
                    new_message += alphabets_lower[converting]
        else:
            new_message += letter                  
    return new_message


print(caesar_shift("Nammdi OOO", 3))
