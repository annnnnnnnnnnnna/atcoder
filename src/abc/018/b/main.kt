package abc.`018`.b

fun main() {
    var s = readLine()!!
    val n = readLine()!!.toInt()
    repeat(n) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        val head = s.substring(0,l-1)
        val tail = s.substring(r,s.length)
        s = head + s.substring(l-1,r).reversed() + tail
    }
    println(s)
}
