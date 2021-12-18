

object NestedFunction {
  def main(args: Array[String]) {

    def square(x: Double): Double = {
      return x * x
    }

    def sumsquare(x: Double, y: Double): Double = {
      return square(x) + square(y)
    }

    println("Sum Of Square :" + sumsquare(2, 3))

  }
}