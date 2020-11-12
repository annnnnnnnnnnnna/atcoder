package abc.`015`.c

fun main() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val t = Array<Array<Int>>(n) { Array(k) {0} }
    repeat(n) {
        t[it] = readLine()!!.split(' ').map { it.toInt() }.toTypedArray()
    }

    var found = false
    val arr = Array<Int>(n) {0}
    fun chk() {
        var xor = 0
        for (i in 0 until n) {
            xor = xor.xor(t[i][arr[i]])
        }
        if (xor == 0) found = true
    }
    fun make(d: Int) {
        for (i in 0 until k) {
            arr[d] = i
            if (d == n-1) chk()
            else make(d+1)
        }
    }

    make(0)

    if(found) println("Found")
    else println("Nothing")
}
