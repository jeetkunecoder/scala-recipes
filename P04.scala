/**
 * P04 Solver
 * length: Find the number of elements of a list
 */

package edu.problems.codes

object P04 {
  
  // Simplest way using the standard library
  def length[A](l: List[A]): Int = l.length
  
  // We can also use pattern matching
  def length2[A](l: List[A]): Int = l match {
    case Nil => 0
    case x :: xs => 1 + length2(xs) 
  }
}