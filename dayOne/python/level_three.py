def merge_and_sort(collections_one, collections_two):
    merge_list = collections_one + collections_two
    for index in range(len(merge_list)):
        for counter in range(index+1, len(merge_list)):
            if(merge_list[index] > merge_list[counter]):
                swap = merge_list[index]
                merge_list[index] = merge_list[counter]
                merge_list[counter] = swap
    return merge_list

