```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft
  val sum = list.foldLeft(0)(_ + _)
  println(sum) //Prints 15

  //Correct usage
  val sum2 = list.sum
  println(sum2) //Prints 15

  //Another Example
  val str = list.foldLeft("")(_ + _) // Concatenates all numbers as strings
  println(str) // Prints "12345"

  //More Correct Way for String Concatenation
  val str2 = list.mkString
  println(str2) //Prints "12345"

}