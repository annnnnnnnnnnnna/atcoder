package abc.`133`.b

fun main() {
    val (n, d) = readLine()!!.split(' ').map { it.toInt() }

    val arr = Array(n) {IntArray(d)}
    repeat(n) { i->
        arr[i] = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }

    fun chk (y: IntArray, z: IntArray): Boolean {
        var tmp = 0
        repeat(d) {
            val a = y[it] - z[it]
            tmp += a*a
        }
        var dist = Math.sqrt(tmp.toDouble())
        return dist == Math.floor(dist)
    }

    var ans = 0
    for ( i in 0 until n-1) {
        for (j in i+1 until n) {
            if(chk(arr[i],arr[j])) ans++
        }
    }

    println(ans)
}
