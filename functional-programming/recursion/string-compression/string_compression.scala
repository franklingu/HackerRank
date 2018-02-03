object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val input = readLine()
        println ("(\\w)\\1+".r.replaceAllIn (input, m => "$1" + m.toString.length))
    }
}
