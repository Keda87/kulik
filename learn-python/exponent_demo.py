
def bad_exponent(a, b):
    """Compute exponentiation a^b with O(n)."""
    result = 1
    for i in range(b):
        result *= a
    return result


def another_bad_exponent(a, b):
    if b == 0:
        return 1
    if b < 0:  # Case for minus.
        return 1 / pangkat(a, abs(b))
    else:
        if b == 1:
            return a
        return a * pangkat(a, b - 1)


def good_exponent(a, b):
    """Compute exponentiation a^b with exponentiation
    with squaring algorithm that has O(log(n) + log(n)).
    ref: https://simple.wikipedia.org/wiki/Exponentiation_by_squaring"""
    if b == 1:
        return a
    if b == 2:
        return a * a
    if b % 2 == 0:
        return good_exponent(good_exponent(a, b / 2), 2)
    else:
        return a * good_exponent(good_exponent(a, (b - 1) / 2), 2)


if __name__ == '__main__':
    print bad_exponent(2, 999999)  # 23 secs
    print good_exponent(2, 999999) # 3 secs
