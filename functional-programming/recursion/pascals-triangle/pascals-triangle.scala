object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val k = readInt()
        printPascalRow(List(1), k)
    }
    
    def printPascalRow(row: List[Int], n: Int):Unit = {
        if (n == 0) {
            return
        }
        println(row.map(_.toString).mkString(" "))
        val start: List[Int] = List()
        val ret: (Int, List[Int]) = row.foldLeft((0, start): (Int, List[Int])) { (res: (Int, List[Int]), num: Int) =>
            (num, res._2 :+ (res._1 + num))
        }
        printPascalRow(ret._2 :+ 1, n - 1)
    }
}
