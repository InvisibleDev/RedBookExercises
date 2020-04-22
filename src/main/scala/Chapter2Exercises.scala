import scala.annotation.tailrec

object Chapter2Exercises {

  def compose[A,B,C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = (a: A) => (b: B) => f(a, b)

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = as.sortWith(ordered) sameElements as

  def fib(n: Int): Int = fib(n, 1, 0)

  @tailrec
  private def fib(n: Int, prev1: Int, prev0: Int): Int = {
    if (n == 2)
      prev1
    else if (n == 1)
      prev0
    else fib(n - 1, prev1 + prev0, prev1)
  }
}
