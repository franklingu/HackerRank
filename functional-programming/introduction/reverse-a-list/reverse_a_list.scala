def f(arr:List[Int]):List[Int] = arr.foldLeft(List[Int]())((a, b) => b::a)
