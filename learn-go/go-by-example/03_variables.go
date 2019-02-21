package main

import "fmt"

func main() {

	var a = "initial"
	fmt.Println(a)

	var b, c int = 1, 2
	fmt.Println(b, c)

	var d = true
	fmt.Println(d)

	// Default value for int is 0
	var e int
	fmt.Println(e)

	// Shortcut for `var f string = "short"`
	f := "short"
	fmt.Println(f)
}
