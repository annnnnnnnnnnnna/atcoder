package abc.`010`.c

fun main() {
    val xy = readLine()!!.split(' ').map { it.toDouble() }.chunked(2)
    val maxL = xy[2][0] * xy[2][1]
    val n = readLine()!!.toInt()
    repeat(n) {
        val (x, y) = readLine()!!.split(' ').map { it.toDouble() }

        val first = Math.sqrt((x-xy[0][0])*(x-xy[0][0])+(y-xy[0][1])*(y-xy[0][1]))
        val second = Math.sqrt((x-xy[1][0])*(x-xy[1][0])+(y-xy[1][1])*(y-xy[1][1]))
        if (first + second <= maxL) {
            println("YES")
            return
        }
    }
    println("NO")
}
