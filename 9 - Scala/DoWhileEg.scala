

object DoWhileEg {
  def main(args: Array[String]) {
    var i = 2

    do {
      print(i)
      i += 2
    } while (i <= 100)
  }
}