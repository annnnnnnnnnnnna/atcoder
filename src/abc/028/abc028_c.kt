fun main(args: Array<String>) {
    val n = readLine()!!.split(' ').map { it.toInt() }.sortedDescending()
    var cnt = 0
    var sel = IntArray(3){0}
    val res = mutableSetOf<Int>()
    fun make(lst: List<Int>, d: Int) {
        lst.forEach {
            sel[d] = it
            if (d == 2) {
                var sum = 0
                sel.forEach {
                    sum += it
                }
                res.add(sum)
            } else {
                make(lst - it, d+1)
            }
        }
    }
    make(n, 0)
    println(res.toList().sortedDescending()[2])
}
