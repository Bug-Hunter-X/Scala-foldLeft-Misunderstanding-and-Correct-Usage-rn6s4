```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct use of foldLeft with explicit type handling 
  val sum = list.foldLeft(0)((acc, x) => acc + x) 
  println(sum) // Prints 15

  // More concise way using sum
  val sum2 = list.sum
  println(sum2) // Prints 15

  // Correct way for String Concatenation with explicit type handling
  val str = list.foldLeft("")((acc, x) => acc + x.toString)
  println(str) //Prints 12345

  // More concise way using mkString
  val str2 = list.mkString
  println(str2) // Prints 12345
}```