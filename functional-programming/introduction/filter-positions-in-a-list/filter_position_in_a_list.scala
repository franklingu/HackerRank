
def f(arr:List[Int]):List[Int] = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    arr.zipWithIndex.collect {
        case (x,i) if i % 2 == 1 => x
    }
}
