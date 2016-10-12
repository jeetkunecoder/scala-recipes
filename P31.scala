/**
 * P31 Solver 
 * isPrime: Determine whether a given integer number is prime
 */

package edu.problems.codes

object P31 {
  
  def isPrime(n: Int): Boolean = {
    if (n < 2) false
    else !((2 to n - 1) exists (x => n % x == 0))
  }
  
  def isPrime2(n: Int): Boolean = {
    if (n < 2) false 
    else !((2 to Math.sqrt(n).toInt) exists (x => n % x == 0))
  }
}