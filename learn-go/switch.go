package main

import "fmt"
import "time"

func main() {
	n := 2
	fmt.Print("Write ", n, " as ")
	switch n {
	case 1:
		fmt.Println("one")
	case 2:
		fmt.Println("two")
	case 3:
		fmt.Println("three")
	}

	fmt.Println(time.Now().Weekday())
	switch time.Now().Weekday() {
	case time.Saturday, time.Sunday:
		fmt.Println("It's weekend!")
	default:
		fmt.Println("It's weekday!")
	}
}
