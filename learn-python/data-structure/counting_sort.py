

def counting_sort(arr, max_range):
    """
    :arr        -- list of integers.
    :max_range  -- maximum value within the list.s
    """
    # initialize array with 0.
    container = [0 for i in range(max_range + 1)]

    # count given data in array by index.
    for i in arr:
        container[i] += 1

    # add each element with previous value.
    for index, data in enumerate(container):
        if index > 0:
            container[index] += container[index - 1]

    # Create container to hold the results.
    result = [0 for i in range(len(arr))]

    # Put each value on given array on result list and the index
    # following the container value, after that value within the container
    # must be decrease by 1.
    for i in arr:
        result[container[i] - 1] = i
        container[i] -= 1
    print result


if __name__ == '__main__':
    counting_sort([1, 4, 1, 2, 7, 5, 2], 9)
    counting_sort([1, 20, 36, 32, 11, 50, 33, 26, 19, 44], 50)
