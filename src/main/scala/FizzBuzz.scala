package main.scala

object FizzBuzzFilter {
  def apply(i : Int) = {
    i match {
      case z if z%3 == 0 && z%5 == 0 => "FizzBuzz"
      case a if a%3 == 0 => "Fizz"
      case b if b %5 == 0 => "Buzz"
      case _ => i.toString
  }
  }
}