fun main(args: Array<String>) {
    val s = readLine()!!
    val n = readLine()!!.toInt()

    var ans = CharArray(2)
    var cnt = 0
    fun make (lst: List<Char>, d: Int) {
        lst.forEach {
            ans[d] = it
            if (d == 1) {
                cnt++
                if (cnt == n) {
                    println(ans)
                    return
                }
            } else {
                make(lst, d+1)
            }
        }
    }
    make(s.toCharArray().toList(),0)
}
