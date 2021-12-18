

object FunctionEf {
  def main(args: Array[String]) {
    def add(a: Double = 100, b: Double = 200): Double = {
      var sum: Double = 0
      sum = a + b
      return sum
    }
    print("sum :" + add(b = 11))
  }
}