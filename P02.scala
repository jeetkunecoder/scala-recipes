/**
 * P02 Solver 
 * penultimate: Finds the penultimate element in a list
 */

package edu.problems.codes

object P02 {
  
  def penultimate[A](l: List[A]): A = l.dropRight(1).last
  def penultimate2[A](l: List[A]): A = l.reverse.drop(1).head
  
}