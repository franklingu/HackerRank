object Solution {

    def numberOfWays(X:Int,N:Int):Int = {
       // Compute the answer in this function over here
       // It is fine to define new functions as and where required
        numberOfWaysInner(X, N, X/2)
    }

    def numberOfWaysInner(X: Int, N: Int, upper: Int): Int = {
        if (X <= 0 || upper <= 0) {
            return 0
        }
        val calc: Int = math.pow(upper, N).toInt
        if (calc > X) {
            numberOfWaysInner(X, N, upper - 1)
        } else if (calc == X) {
            numberOfWaysInner(X, N, upper - 1) + 1
        } else {
            numberOfWaysInner(X, N, upper - 1) + numberOfWaysInner(X - calc, N, upper - 1)
        }
    }

    def main(args: Array[String]) {
       println(numberOfWays(readInt(),readInt()))
    }
}
