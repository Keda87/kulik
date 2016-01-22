package id.co.adiyatmubarak.learnscala.collections

/**
 * Created by adiyatmubarak on 10/21/15.
 */
object ScalaList {
  def main(args: Array[String]) {
    // List of string.
    val fruits : List[String] = List("orange", "apples", "banana")
    for (fruit <- fruits) {
      print(fruit + " ")
    }
    println()

    // List of integer.
    val numbers : List[Int] = List(6, 2, 4, 1)
    for (number <- numbers) {
      print(number + " ")
    }

    // Empty list.
    val empty : List[Nothing] = List()
    println(empty.isEmpty)

    // Basic list operations.
    println("Head of fruit: " + fruits.head)
    println("Tail of fruit: " + fruits.tail)
    println("Check if fruit empty: " + fruits.isEmpty)

    // Concatenating list.
    val list1 = List("a", "b", "c")
    val list2 = List("d", "e", "f")
    val a2e = list1 ::: list2
    println("list1 ::: list2 -> " + a2e)                                  // ::: operator
    println("list1.:::(list2) -> " + list1.:::(list2))                    // ::: method
    println("List.concat(list1, list2) -> " + List.concat(list1, list2))  // List.concat method
  }
}
