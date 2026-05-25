def re_occurring(collections):
    highest_count = 0;
    new_list = []

    for element in collections:
        appearance = 0
        for counter in range(len(collections)):
            if (element == collections[counter]):
                appearance+=1

        if (appearance > highest_count):
            highest_count = appearance
            new_list = [element]
#            new_list.append(collections[count])
        elif (appearance == highest_count) and element not in new_list:
            new_list.append(element)
    return new_list


def sort_list(collections):    
    for index in range(len(collections)):
        for counter in range(index+1, len(collections)):
            if (collections[index] < collections[counter]):
                swap = collections[index]
                collections[index] = collections[counter]
                collections[counter] = swap
    return collections    


