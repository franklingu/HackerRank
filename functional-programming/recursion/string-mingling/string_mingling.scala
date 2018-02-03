object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val s1 = readLine()
        val s2 = readLine()
        val ret = s1.zip(s2).foldLeft("") { (res, cs) =>
            res + cs._1 + cs._2
        }
        println(ret)
    }
}
