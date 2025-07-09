package firstScala

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j × $i = ${i * j}\t")
      }
      println()
    }
  }
}
