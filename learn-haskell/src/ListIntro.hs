let numbers = [1,2,3,4,5]

-- Basically it will join `numbers` list on the left side and the right side.
-- It will fine on small amount of list, but it will cost a lot of memory on
-- large amount of list, because haskell will read entire list on the left side
-- then add righ side list.
numbers ++ [6, 7, 8, 89]

-- Different with `++` operator, `:` will append 100 at the beginning without
-- read the existing list. O(1)
100:numbers

numbers !! 4 -- Get element by index, it will returns 5.

-- Compare list. Haskell will compare each element on the left side with the
-- right side.
[1, 2, 3] == [1, 2, 3]  -- True
[1, 2, 3] > [0, 0, 0]   -- True
[1, 2, 3] <= [0, 0, 0]  -- False

-- Basic list operations.
head numbers    -- 1
tail numbers    -- [2, 3, 4, 5]
last numbers    -- 5
init numbers    -- [1, 2, 3, 4]
sum numbers     -- 15
product numbers -- 30
maximum numbers -- 5
minimum numbers -- 1
reverse numbers -- [5, 4, 3, 2, 1]
length numbers  -- 5
null numbers    -- False, Check if list empty.

-- Infix function.
1 `elem` numbers  -- True
10 `elem` numbers -- False

-- Generate list by given range.
[1..5]      -- [1,2,3,4,5]
['a'..'z']  -- also works on alphabet.

-- List comprehension.
[x * 2 | x <- [1..10]] -- Doubled each item on list.
[x * 2 | x <- [1..10], x * 2 >= 12] -- Only get doubled value that >= 12
