package test.scala

import org.scalatest.matchers.ShouldMatchers
import main.scala.FizzBuzzFilter
import org.scalatest.{FeatureSpec, Spec}

class FizzBuzzFilterSpec extends Spec with ShouldMatchers {
  describe("FizzBuzzFilter") {
    it("should return Fizz if divisible by 3") {
      FizzBuzzFilter(3) should be("Fizz")
    }
    it("should return Buzz if divisible by 5") {
      FizzBuzzFilter(5) should be("Buzz")
    }
    it("should return FizzBuzz if divisible by 3 and 5") {
      FizzBuzzFilter(15) should be("FizzBuzz")
    }
    it("should return a number otherwise") {
      FizzBuzzFilter(1) should be("1")
    }
  }
}

class FizzBuzzAnswer extends FeatureSpec with ShouldMatchers {
  feature("The answer") {
    scenario("1 to 100") {
      (3 to 15).map(FizzBuzzFilter(_)) should be (List("Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
        "Buzz", "11", "Fizz", "13", "14", "FizzBuzz") )
    }
  }
}

class FizzBuzzCheck extends Spec {
  import org.scalacheck._

  describe("FizzBuzzFilter") {
    it("should ") {
     val results = Gen.choose(1, 100)
      import org.scalacheck.Prop._
      val propSmallInteger = Prop.forAll(results){
        n: Int => n % 3 == 0 ==> (FizzBuzzFilter(n)=="Fizz")
      }

      propSmallInteger.check
    }
  }


}