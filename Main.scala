/**
 * Solutions to 99 Problems in Scala using ScalaTest
 */

package edu.problems.codes
import org.scalatest._

class Main extends FlatSpec with Matchers {  
    
  // P01(*) Find the last element of a list
  it should "find the last element of a list " in {
    val P01 = new P01
    val last = P01.last(List("a","b","c","d"))
    last should be("d")
  }
  
  // P02(*) Find the last but one element of a list
  it should "find the last but one element of a list" in {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val penultimate = P02.penultimate(numbers)
    penultimate should be(9)
  }
  
  // P03(*) Find the k-th element of a list
  it should "be first element when k is 0" in {
    val l = List(1, 2, 3, 4, 5)
    P03.kth(l, 0) should be(1)
  }
  
  it should "be last element when k is equal to size of list minus one" in {
    val l = List(1, 2, 3, 4, 5)
    P03.kth(l, l.length - 1) should be(5)
  }
  
  it should "be (k+1)th element" in {
    val l = List(1, 2, 3, 4, 5)  
    P03.kth(l, 2) should be(3)
  }
  
  // P34(*) A list of Prime Numbers

  it should "list 2, 3, 5, 7 as prime numbers between 0 and 10" in {
    val rangeSeq = (0 to 10).toList
    val primeNumbers = P34.primeNumbers(rangeSeq)
    primeNumbers should have length 4
    primeNumbers should be(List(2,3,5,7))
  }
  
  it should "list 7, 11, 13, 17, 19, 23, 29, 31 as primes between 7 and 31" in {
    
    val rangeSeq = (7 to 31).toList
    val primeNumbers = P34.primeNumbers(rangeSeq)
    primeNumbers should have length 8
    primeNumbers should be (List(7, 11, 13, 17, 19, 23, 29, 31))
  }
}

/**
 * PO1 Solver
 * last: Finds the last element of a list
 */

class P01 {
  
  def last[A](l: List[A]): A = l.last
  
}

/**
 * P02 Solver 
 * penultimate: Finds the penultimate element in a list
 */

object P02 {
  
  def penultimate[A](l: List[A]): A = l.dropRight(1).last
  def penultimate2[A](l: List[A]): A = l.reverse.drop(1).head
  
}

/**
 * P03 Solver
 * nth: Find the k-th element in a list
 */

object P03 {
  
  def kth[A](l: List[A], n: Int) = l(n)
  
}

/**
 * P31 Solver 
 * isPrime: Determine whether a given integer number is prime
 */

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

/**
 * P34 Solver
 * primeNumbers: Obtains the prime numbers in a given sequence 
 */

object P34 {
  def isPrime(n: Int): Boolean = {
    if (n < 2) false 
    else !((2 to Math.sqrt(n).toInt) exists (x => n % x == 0))
  }
  
  def primeNumbers(l: List[Int]): List[Int] = l.filter(x => isPrime(x))
}