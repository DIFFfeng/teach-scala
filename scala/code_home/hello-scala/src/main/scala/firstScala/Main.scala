package firstScala
case class Student(name: String, scores: List[Int]) {
  def average: Double = scores.sum.toDouble / scores.size
  def total: Int = scores.sum
}

object Main extends App {
  // 创建学生列表
  val students = List(
    Student("Alice", List(85, 90, 95)),
    Student("Bob", List(75, 80, 85)),
    Student("Charlie", List(95, 95, 98))
  )

  // 筛选并排序（一行代码即可）
  val result = students
    .filter(_.average > 80)
    .sortBy(-_.total)  // 负号表示降序

  // 输出结果
  result.foreach { s =>
    println(f"${s.name}: 平均分=${s.average}%.1f, 总分=${s.total}")
  }
}