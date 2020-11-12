package abc.`150`.c

fun main() {
    val N = readLine()!!.toInt()
    val p = readLine()!!.replace(" ", "").toInt()
    val q = readLine()!!.replace(" ", "").toInt()

    var pPos = 0
    var qPos = 0

    val a = IntArray(N)
    var cnt = 0
    fun create(n:Int, ary: List<Int>) {
        ary.forEach {
            a[n] = it
            if (n+1 == N) {
                val i = a.joinToString ("" ).toInt()
                cnt++
                if (i == p) pPos = cnt
                if (i == q) qPos = cnt
            } else {
                create(n + 1, ary.minus(it))
            }
        }
    }

    val all = mutableListOf<Int>()
    repeat(N) {
        all.add(it+1)
    }
    create(0, all)

    println(Math.abs(pPos - qPos))
}
