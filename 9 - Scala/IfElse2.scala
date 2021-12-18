

object IfElse2 {
  def main(args: Array[String]) {
    var marks = 75
    if (marks >= 75) {

      println("Distinction")
    } else if (marks >= 60 && marks < 70)
      println("First Class")
    else if (marks >= 50 && marks < 60)
      println("Second Class")
    else if (marks >= 40 && marks < 50)
      println("pass Class")
    else
      println("Fail")
  }
}