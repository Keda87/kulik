package main

import "fmt"

func factorial(n int) int {
	if n == 0 {
		return 1
	}
	return n * factorial(n - 1)
}

func fib(n int) int {
	if n  <= 2 {
		return 1
	}
	return fib(n - 1)  + fib(n - 2)
}

func main() {
	fmt.Println("3! = ", factorial(3))
	fmt.Println("fib(6):", fib(6))
}
