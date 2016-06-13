package main

import "fmt"


func plus(a int, b int) int {
	return a + b
}

func plusPlus(a, b, c int) int {
	return a + b + c
}

func vals() (int, int) {
	return 3, 7
}

// Variadic functions.
func sum(nums ...int) {
	fmt.Print(nums, " ")

	total := 0
	for _, i := range nums {
		total += i
	}
	fmt.Println(total)
}

func main() {
	// -------- functions
	res := plus(1, 2)
	fmt.Println("1 + 2 = ", res)

	res = plusPlus(1, 2, 3)
	fmt.Println("1 + 2 + 3 = ", res)

	// -------- multiple return value
	a, b := vals()
	fmt.Println(a)
	fmt.Println(b)

	_, c := vals()
	fmt.Println(c)

	// --------- variadic functions
	sum(1, 2, 3, 4, 5)
}
