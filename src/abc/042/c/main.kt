package abc.`042`.c

fun main() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val d = readLine()!!.replace(" ", "")


    fun check(c: Char): Boolean {
        return d.indexOf(c) == -1
    }

    var ans = n.toString()
    fun checkAll(s: String): Boolean {
        var ret = true
        for (i in 0 until s.length) {
            ret = ret && check(s[i])
        }
        return ret
    }

    var c = n
    while(true) {
        if (checkAll(ans) ) {
            println(c)
            break
        } else {
            c++
            ans = c.toString()
        }
    }
}
