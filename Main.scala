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

  // P04(*) Find the number of elements of a list
  it should "be zero when list is empty" in {
    P04.length(List()) should be(0)  
  }
  
  it should "be 7 when the list have seven elements" in {
    val l = List(1, 2, 3, 4, 5, 6, 7)
    P04.length(l) should be(7)
  }

  // P05(*) Reverse a list
  it should "reverse a list" in {
    val l = List(1, 2, 3, 4, 5)
    P05.reverse(l) should be(List(5, 4, 3, 2, 1))
  }
  
  it should "reverse a list using recursion" in {
    val l = List(5, 6, 7, 8)
    P05.reverseRec(l) should be(List(8, 7, 6, 5))
  }
  
  // P06(*) Find out whether a list is palindrome
  it should "return true when list is palindrome" in {
    val l = List("a", "b", "b", "a")
    P06.isPalindrome(l) should be(true)
  }
  
  it should "return false when list isn't palindrome" in {
    val l = List(1, 2, 3, 4, 5)
    P06.isPalindrome(l) should be(false)
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