package abc.`051`.b

fun main() {
    val (k, s) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    for (x  in 0 .. k) {
        for (y  in 0 .. Math.min(s-x,k)) {
            if (s-x-y <= k) ans ++
        }
    }
    println(ans)
}
