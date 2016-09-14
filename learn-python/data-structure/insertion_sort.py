

def insertion_sort(arr):
    for j in range(1, len(arr)):
        key = arr[j]
        i = j - 1
        while i >= 0 and arr[i] > key:
            arr[i + 1] = arr[i]
            i = i - 1
        arr[i + 1] = key


if __name__ == '__main__':
    data = [6, 2, 4, 6, 87, 23, 11, 25, 31, 1, 1, 32, 55, 43, 35, 76]
    print data
    insertion_sort(data)
    print data
