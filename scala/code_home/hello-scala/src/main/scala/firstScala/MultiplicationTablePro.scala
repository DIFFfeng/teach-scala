package firstScala

import scala.io.StdIn

object MultiplicationTablePro {
  def main(args: Array[String]): Unit = {
    print("请输入乘法表的大小：")
    val size = StdIn.readInt()

    // 验证输入是否为正整数
    if (size <= 0) {
      println("错误：请输入大于 0 的整数！")
      return
    }

    for (i <- 1 to size) {
      for (j <- 1 to i) {
        print(s"$j × $i = ${i * j}\t")
      }
      println()
    }

  }
}
