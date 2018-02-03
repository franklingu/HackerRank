object Solution {
    
    def fibonacci(x:Int):Int = {
          
        // Fill Up this function body
        // You can add another function as well, if required
        if (x == 1) {
            0
        } else if (x == 2) {
            1
        } else {
            helper(x - 3, 0, 1)
        }
    }
    
    def helper(idx: Int, prev: Int, next: Int): Int = {
        if (idx == 0) {
            prev + next
        } else {
            helper(idx - 1, next, prev + next)
        }
    }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
