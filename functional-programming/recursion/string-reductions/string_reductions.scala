object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val input = readLine()
        println(removePrevDups(input.toList, "".toList).reverse.mkString(""))
    }

    def removePrevDups(l: List[Char], res: List[Char]): List[Char] = {
        l match {
            case Nil => res
            case x::xs => {
                if (res.contains(x)) {
                    removePrevDups(xs, res)
                } else {
                    removePrevDups(xs, x::res)
                }
            }
        }
    }
}
