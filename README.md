# Scala foldLeft Pitfalls and Best Practices

This repository showcases a common error when using the `foldLeft` method in Scala and provides corrected solutions.  The primary issue arises from incorrectly specifying the aggregation function within `foldLeft`, often leading to unexpected results or type errors.

## Bug Description
The `bug.scala` file illustrates an example of incorrectly using `foldLeft`, especially when dealing with different types (numerical lists or string concatenation). The incorrect approach attempts to use `_ + _` without proper type handling, leading to potential type mismatches.

## Solution
The `bugSolution.scala` file demonstrates the correct usage of `foldLeft`, along with more efficient alternatives provided by Scala's standard library, like `.sum` for numerical aggregation and `.mkString` for string concatenation. These alternatives avoid common `foldLeft` pitfalls, leading to more readable and maintainable code.
