/**
  * Solution for MiniMax on Hackerrank
  *
  */

object MiniMax {
  def miniMaxSum(arr: Array[Int]) {
    val sorted = arr.sorted
    val min: Long = sorted.take(4).map(_.toLong).sum
    val max: Long = sorted.drop(1).map(_.toLong).sum
    println(min + " " + max)
  }
}