def caesar_shift(message, key):

    new_message = ""
    alphabets = ""
    for number in range(65,90+1):

        alphabets += chr(number)
#        print(alphabets)  
    message_all_caps = message.upper()
    for letter in message_all_caps:
        if (letter.isalpha()):
            for character in alphabets:
                if letter == character:
                    converting = (alphabets.index(character) + key) % 26
                    new_message += alphabets[converting]
        else:
            new_message += letter                  
    return new_message


def decrypt_caesar_shift(message, key):

    new_message = ""
    alphabets = ""
    for number in range(65,90+1):

        alphabets += chr(number)
#        print(alphabets)  
    message_all_caps = message.upper()
    for letter in message_all_caps:
        if (letter.isalpha()):
            for character in alphabets:
                if letter == character:
                    converting = (alphabets.index(character) - key) % 26
                    new_message += alphabets[converting]
        else:
            new_message += letter                  
    return new_message

