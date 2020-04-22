package chapter3

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.must.Matchers._

class ListTest extends AnyFeatureSpec {
  Scenario("computing tail of a list") {
    val l = List(1,2,3,4,5)
    List.tail(l) mustBe List(2,3,4,5)
  }

  Scenario("replace head of a list") {
    val l = List(1,2,4,5)
    val newHeadElem = 10
    List.setHead(l, newHeadElem) mustBe List(10, 2, 4, 5)
  }

  Scenario("drop N elements from a list") {
    val l = List(3,4,5,6,7,8,9,9)
    List.drop(l, 3) mustBe List(6, 7, 8, 9, 9)
  }

  Scenario("dropWhile a condition is satisfied") {
    val l = List(3,9,9, 1)
    List.dropWhile(l, (a: Int) => a % 3 == 0) mustBe List(1)
    List.dropWhile(List(1, 2, 4), (a: Int) => a % 3 == 0) mustBe List(1, 2, 4)
  }

  Scenario("remove last element of a list") {
    val l = List(1,2,3,4,5,6,7)
    List.init(l) mustBe List(1,2,3,4,5,6)
  }

  Scenario("length of a list") {
    List.length(List(1,2,3,4,5,6)) mustBe 6
    List.length(Nil) mustBe 0
  }

  Scenario("length of a list using foldLeft") {
    List.foldLeft(List(1,2,3,4,5,6), 0)((b: Int, _: Int) => b + 1) mustBe 6
    List.foldLeft(Nil, 0)((b: Int, _: Int) => b + 1) mustBe 0
  }

  Scenario("compute sum using foldLeft") {
    val l = List(1,2,3,4,5,6)
    List.sum3(l) mustBe List.sum2(l)
  }

  Scenario("compute product using foldLeft") {
    val l = List(1.0,2,3,4,5,6)
    List.product3(l) mustBe List.product2(l)
  }

  Scenario("compute length using foldLeft") {
    val l = List(1,2,3,4,5,6)
    List.length2(l) mustBe List.length(l)
  }
}
