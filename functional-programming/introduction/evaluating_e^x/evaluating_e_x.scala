object Solution {

    def main(args: Array[String]) {
        val n = scala.io.StdIn.readInt()
        (1 to n).foreach { idx =>
            val num = scala.io.StdIn.readDouble()
            val res = (List.range(0, 10) map (e => math.pow(num, e) / (1 to e).product )).sum.toFloat
            println("%.4f".format(res))
        }
    }
}
