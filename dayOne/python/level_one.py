def odd_even_split(collections):
    even_list = []
    odd_list = []
    for count in collections:
        if count % 2 == 0:
            even_list.append(count)
        else:
            odd_list.append(count)
    combine_list = [odd_list, even_list]
    return combine_list;

def palindrome_list(collections):
    start_of_element = 0
    last_element = len(collections) - 1
    while(start_of_element < last_element):
        if (collections[start_of_element] != collections[last_element]):
            return False;
        start_of_element += 1
        last_element -= 1
        
    return True;

def perfect_square_list(collections):
    perfectSq_list = []
    for count in collections:
        if (count % count**0.5 == 0):
            perfectSq_list.append(count)

    return perfectSq_list

def non_perfect_square_list(collections):
    non_perfectSq_list = []
    for count in collections:
        if (count % count**0.5 == 0):
            non_perfectSq_list.append(count)
        else:
            non_perfectSq_list.append(-1)

    return non_perfectSq_list

            
