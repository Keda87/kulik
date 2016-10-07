"""
It will sort given list of integers to this pattern.
Large Small Large Small Large Small etc...
The list must contains unique integers.

Example:
Input : 1 3 4 6 5
Output: 3 1 6 4 5
"""

def magic_sort(n):
    for v in range(len(n) - 1):
        if v % 2 == 0:
            if n[v] < n[v + 1]:
                n[v], n[v + 1] = swap(n[v], n[v + 1])
        else:
            if n[v] > n[v + 1]:
                n[v], n[v + 1] = swap(n[v], n[v + 1])
    print n

def swap(a, b):
    tmp = None
    tmp = b
    b = a
    a = tmp
    return a, b


if __name__ == '__main__':
    n1 = [1,3,4,6,5]
    magic_sort(n1)

    n2 = [1,2,3,4,5]
    magic_sort(n2)

    n3 = [3, 1, 6, 9, 20, 11, 43, 27, 38, 77]
    magic_sort(n3)
