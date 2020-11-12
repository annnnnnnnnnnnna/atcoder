package abc.`029`.c

fun main() {
    val n = readLine()!!.toInt()
    val lst = listOf('a', 'b', 'c')

    val res = Array<Char>(n){' '}
    fun make(lst: List<Char>, d: Int) {
        lst.forEach {
            res[d] = it
            if (d == n-1) {
                println(res.joinToString(""))
            } else {
                make(lst, d+1)
            }
        }
    }
    make(lst, 0)
}
