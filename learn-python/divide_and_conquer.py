def max_and_min_bad(lst):
    """Find minimum and maximum value within list with O(n).
    :arg:       list
    :return:    (min, max)
    """
    minim = lst[0]
    maxim = lst[0]
    for i in lst:
        if i < minim:
            minim = i
        if i > maxim:
            maxim = i
    return (minim, maxim)


def max_and_min_good(lst):
    """Find minimum and maximum value within list with O(log n).
    :arg:       list
    :return:    (min, max)
    """
    if len(lst) == 1:
        return lst[0], lst[0]
    if len(lst) == 2:
        x1, x2 = lst
        return (x1, x2) if x1 < x2 else (x2, x1)
    mid = len(lst) // 2
    min1, max1 = max_and_min_good(lst[:mid])
    min2, max2 = max_and_min_good(lst[mid:])
    return (min1 if min1 < min2 else min2, max1 if max1 > max2 else max2)

if __name__ == '__main__':
    ar = [39, 4, 2, 6, 7 ,4, 32, 100, 24, 22, 12, 47, -1]
    print max_and_min_bad(ar)
    print max_and_min_good(ar)
