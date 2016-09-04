doubleMe x = x + x

doubleUs x y = doubleMe x + doubleMe y

doubleSmallNumber x = (if x > 100 then x else x*2)

-- Function to remove uppercase with list comperhension.
removeUpperCase arg = [x | x <- arg, x `elem` ['A'..'Z']]

getVowel arg = [x | x <- arg, x `elem` ['a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O']]
