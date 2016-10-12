/**
 * P05
 * reverse: Reverse the elements of a list 
 */

package edu.problems.codes

object P05 {
  def reverse[A](l: List[A]): List[A] = l.reverse
  def reverseRec[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case x :: xs => reverseRec(xs) ::: List(x)
  }
}