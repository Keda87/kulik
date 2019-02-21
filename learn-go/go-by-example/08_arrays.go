package main

import "fmt"

func main() {

	// Default initial array elements are 0.
	var a [5]int
	fmt.Println("emp:", a)

	// Assign value within array element.
	a[4] = 100
	fmt.Println("set:", a)
	fmt.Println("get:", a[4])

	// Count array element.
	fmt.Println("len:", len(a))

	// Declare array with initial value.
	b := [5]int{1, 2, 3, 4, 5}
	fmt.Println("dcl:", b)

	// 2 dimensional arrays.
	var twoD [2][3]int
	for i := 0; i < 2; i++ {
		for j := 0; j < 3; j++ {
			twoD[i][j] = i + j
		}
	}
	fmt.Println("2d:", twoD)
}
