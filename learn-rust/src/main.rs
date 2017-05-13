fn main() {
    // Variable bindings.
    let name = "John Doe";
    println!("Hello {}", name);

    // Patterns.
    let (x, y) = (1, 2);
    println!("Value of x = {} and y = {}", x, y);

    // Type annotations.
    // Rust is statically type and has type inference once we declaring variables.
    // But we also can defining variables with variable type explicitly.
    let z: i32 = 5;
    println!("32bit Integer on z = {}", z);

    // Mutability.
    // By default variable binding in rust are immutable, so we can't reassign new value
    // to assigned variable.
    let mut foo = 5;
    println!("Mutable variable foo before reasignment = {}", foo);
    foo = 10;
    println!("Mutable variable foo after reassignment = {}", foo);

    // Variable scope.
    let example1: i32 = 17;
    {
        let example2: i32 = 3;
        println!("The value of example1: {} and example2: {}", example1, example2);
    }
    // Won't work because variable2 is out of scope.
    // println!("The value of example1: {} and example2: {}", example1, example2);
    
    // Variable shadowing.
    let shadow1: i32 = 8;
    {
        println!("shadow1: {}", shadow1); // output 8 (initial declaration value)
        let shadow1 = 12;
        println!("shadow1: {}", shadow1); // output 12 (variable overrided only in this score)
    }
    println!("shadow1: {}", shadow1);  // output 8 (out from the scope, the value still the same as first declared)
    let shadow1 = 42;  // variable declaration overriden
    println!("shadow1: {}", shadow1); // output 42
    let shadow1 = "I'm a text";  // variable declaration overriden (with new type)
    println!("shadow1: {}", shadow1); // replaced with string
}
