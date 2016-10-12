/**
 * P06
 * isPalindrome: Finds out if a list is palindrome
 */

package edu.problems.codes

object P06 {
  
  def isPalindrome[A](l: List[A]): Boolean = {
    l == l.reverse
  }
}