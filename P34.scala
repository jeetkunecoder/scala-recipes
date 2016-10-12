/**
 * P34 Solver
 * primeNumbers: Obtains the prime numbers in a given sequence 
 */

package edu.problems.codes

object P34 {
  def isPrime(n: Int): Boolean = {
    if (n < 2) false 
    else !((2 to Math.sqrt(n).toInt) exists (x => n % x == 0))
  }
  
  def primeNumbers(l: List[Int]): List[Int] = l.filter(x => isPrime(x))
}