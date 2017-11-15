def f(num:Int,arr:List[Int]):List[Int] = {
    var replicated = List.fill(0)(2)
    for (elem <- arr) {
        replicated = replicated ::: List.fill(num)(elem)
    }
    return replicated
}
