package main.scala

/**
 * Created by IntelliJ IDEA.
 * User: Pawel
 * Date: 18.11.10
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */

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