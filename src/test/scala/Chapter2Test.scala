import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.must.Matchers._

class Chapter2Test extends AnyFeatureSpec {
  Scenario("fibonacci number computation") {
    Chapter2Exercises.fib(6) mustBe 5
    Chapter2Exercises.fib(1) mustBe 0
    Chapter2Exercises.fib(2) mustBe 1
  }

  Scenario("isSorted") {
    Chapter2Exercises.isSorted(Array(1, 2, 3), (x: Int, y: Int) => x > y) mustBe false
    Chapter2Exercises.isSorted(Array(3, 2, 1), (x: Int, y: Int) => x > y) mustBe true
  }
}
