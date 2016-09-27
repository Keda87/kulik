doubleMe x = x + x

doubleUs x y = doubleMe x + doubleMe y

doubleSmallNumber x = (if x > 100 then x else x*2)

-- Function to remove uppercase with list comperhension.
removeUpperCase arg = [x | x <- arg, x `elem` ['A'..'Z']]

getVowel arg = [x | x <- arg, x `elem` ['a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O']]

greet() =
  do planet <- getLine
     home <- getLine
     putStrLn ("Greetings " ++ planet ++ " ling.")
     putStrLn ("I am from " ++ home ++ ".")
     putStrLn "Take me to your leader."

-- One liner greet.
one_liner_greet = do { planet <- getLine; home <- getLine; putStrLn ("Greetings " ++ planet ++ " ling."); putStrLn ("I am from " ++ home ++ ".")}

-- Simple factorial definition.
factorial :: Int -> Int
factorial n = if n == 0 then 1 else n * factorial(n - 1)

-- Make people noble function
mknoble :: String -> String
mknoble name = "Sir " ++ name
