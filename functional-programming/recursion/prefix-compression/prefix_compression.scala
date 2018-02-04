object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val input1 = readLine()
        val input2 = readLine()
        val res = computePrefixDecoded("".toList, input1.toList, input2.toList)
        println("%d %s".format(res._1.length, res._1.reverse.mkString("")))
        println("%d %s".format(res._2.length, res._2.mkString("")))
        println("%d %s".format(res._3.length, res._3.mkString("")))
    }

    def computePrefixDecoded(prefix: List[Char], x: List[Char], y: List[Char]): (List[Char], List[Char], List[Char]) = {
        x match {
        case Nil => (prefix, x, y)
        case ch::chs => {
                if (y != Nil) {
                    // a hack there because scala list append is O(n) time while prepend is O(1) time
                    if (ch == y.head) computePrefixDecoded(ch :: prefix, chs, y.tail) else (prefix, x, y)
                } else {
                    (prefix, x, y)
                }
            }
        }
    }
}
