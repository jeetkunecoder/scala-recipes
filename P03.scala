/**
 * P03 Solver
 * nth: Find the k-th element in a list
 */

package edu.problems.codes

object P03 {
  
  def kth[A](l: List[A], n: Int): A = l(n)
  def kthRecursive[A](l: List[A], n: Int): A = l match {
    case x :: xs if(n == 0) => x
    case x :: xs if(n > 0) => kthRecursive(xs, n - 1)
    case _ => throw new NoSuchElementException
  }
}