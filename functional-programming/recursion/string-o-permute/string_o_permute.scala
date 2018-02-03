import scala.io.Source

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val lines = Source.stdin.getLines().toList
        val inputs = lines.tail
        inputs.map { str =>
            println(swap_positions(str))
        }
    }
    
    def swap_positions(line: String) : String = {
        line.grouped(2).map(_.reverse).mkString("")
    }
}
