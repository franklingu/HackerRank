import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val n = lines.head.toInt
  val pairs = lines.tail.map(_.split(" ").map(_.toInt)).map(array => Tuple2(array(0), array(1)))
  println(area(pairs))


  def area(points: List[(Int, Int)]) = {
    val n = points.length
    math.abs(((0 until n).map(i => pairs(i % n)._1 * pairs((i + 1) % n)._2).sum - (0 until n).map(i => pairs((i + 1) % n)._1 * pairs(i % n)._2).sum) / 2d)
  }
}
